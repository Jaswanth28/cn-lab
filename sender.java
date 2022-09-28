import java.io.*;
import java.net.*;
public class sender {
	public static void main(String[]args)
	{
		try
		{
			ServerSocket s=new ServerSocket(113);
			Socket s1=s.accept();
			DataInputStream in=new DataInputStream(s1.getInputStream());
			DataOutputStream op=new DataOutputStream(s1.getOutputStream());
			int p=Integer.parseInt(in.readUTF());
			for(int i=0;i<p;i++)
			{
				String st[]=new String[p];
				st[i]=(String)in.readUTF();
				System.out.println("frame"+i+" is"+st[i]);
				op.writeUTF("ACK");
			}
			s1.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
