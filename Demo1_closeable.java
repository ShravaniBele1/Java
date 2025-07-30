package abc;
import java.util.Scanner;

public class Demo1_closeable{

	public static void main1(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Square: "+num*num);
	}
	
	public static void main2(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Square: "+num*num);
		sc.close();
	}
	
	public static void main3(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Square: "+num*num);
		sc.close();
		System.out.println("Resource Closed.");
	}
	
	public static void main4(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
				System.out.print("Enter the number:");
				int num=sc.nextInt();
				System.out.println("Square: "+num*num);
		    }
	    finally {
			sc.close();
			System.out.println("Resource Closed.");
	    }
	}
	
	public static void main5(String[] args) {
		//try with resource  (java 5.0)
		try(Scanner sc= new Scanner(System.in))
		{
			System.out.print("Enter the number:");
			int num=sc.nextInt();
			System.out.println("Square: "+num*num);
		}//sc.close()
	}
	
	public static void main(String[] args) {
		//custom resource class
		class  MyResource implements AutoCloseable{
			public MyResource(){
				System.out.println("Resource called...");
			}
			@Override
			public void close()
			{
				System.out.println("Resource closed");
			}
		}
		
		try(MyResource myresource=new MyResource())
	    {
			System.out.println("My Resource...");
		}//myResource.close();
	}
}
