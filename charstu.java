package framing;
import java.util.*;

public class charstu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of chars: ");
		int n=sc.nextInt();
		String in[]=new String[n];
		for(int i=0;i<n;i++)
		{
			in[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			if(in[i].equals("dle"))
			{
				in[i]="dle dle";
			}
		}
		System.out.println("Transmitted message is: ");
		System.out.println(" dle stx ");
		for(int i=0;i<n;i++)
		{
			System.out.println(in[i]+" ");
		}
		System.out.println(" dle etx ");
		sc.close();
	}

}
