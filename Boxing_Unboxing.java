
public class Boxing_Unboxing {

	public static void main(String[] args) {
	   
		int a=10;
		Integer b=new Integer(a);  //boxing
		Integer c=a;   //auto-boxing
		
		Integer x= 20;
		int y= x.intValue();  //unboxing
		int z= x;   //auto-unboxing
		
		System.out.println("Unboxed a: "+ a);
		System.out.println("Boxed a: "+ b);
		System.out.println("Auto-Boxed a: "+ c);
		
		System.out.println(" ");

		System.out.println("Boxed x: "+ x);
		System.out.println("Unboxed x: "+ y);
		System.out.println("Auto-Unboxed x: "+ z);


	}
	

}


