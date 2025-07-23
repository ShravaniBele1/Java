
public class Helper_Method {

	public static void main(String[] args) {
		
		int maxValue=max(10,20);
		int minValue=min(10,20);
			
		System.out.println("MaxValue: "+ maxValue);
		System.out.println("MinValue: "+ minValue);

	}
		
	public static int max(int a,int b) {
		return Integer.max(a,b);
	}
	
	public static int min(int a,int b) {
		return Integer.min(a,b);
	}
}
