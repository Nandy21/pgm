import java.util.Scanner;

class strrev{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] a=s.split(" ");
		String res="";
		for(int i=0;i<a.length;i++)
		{
			StringBuffer sb=new StringBuffer(a[i]);
			res=res+sb.reverse();
		}
			System.out.println(res);
	}
}
