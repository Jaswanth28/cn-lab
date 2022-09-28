import java.util.*;
import java.io.*;
import java.net.*;
public class receiver {
	public static void main(String[]args) {
		try {
			Socket s=new Socket("localhost",113);
			DataOutputStream op=new DataOutputStream(s.getOutputStream());
			DataInputStream ip=new DataInputStream(s.getInputStream());
			Scanner s1=new Scanner(System.in);
			System.out.println("enter the frame size: ");
			int n =s1.nextInt();
			String k=Integer.toString(n);
			op.writeUTF(k);
			String ack[]=new String[n];
			int sendwindow,i,j=0;
			System.out.println("enter send window size: ");
			sendwindow=s1.nextInt();
			for(i=0,j=0;i<n/sendwindow;i++)
			{
				while(j<sendwindow)
				{
					System.out.println("enter frame"+j);
					String f=s1.next();
					op.writeUTF(f);
					ack[i]=(String)ip.readUTF();
					System.out.println(ack[i]);
					j++;
				}
				j=0;
			}
			op.flush();
			op.close();
			s.close();
			s1.close();
		}
		catch(Exception e) {System.out.println(e);}
	}
}
