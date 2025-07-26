
public class WrapperClasses {

	public static void main(String[] args) {
		
		//use of primitive as object
		int a=10;
		Integer b=new Integer(a);
		
		double d= b.doubleValue();
		float f= b.floatValue();
		byte byt= b.byteValue();
		
		System.out.println("original integer value: "+a);
		System.out.println("wrapper integer value: "+b);
		System.out.println("double integer value: "+d);
		System.out.println("float integer value: "+f);
		System.out.println("byte integer value: "+byt);

		
	}

}
