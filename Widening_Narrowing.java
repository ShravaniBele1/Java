
public class Widening_Narrowing {

	public static void main(String[] args) {
		
		int age=25;
		double ageDouble=age;    //widening
		
		double marks=87.50;
		int marksInt=(int)marks;   //narrowing
		
		System.out.println("Age before conversion: "+age);
		System.out.println("Age after conversion: "+ageDouble);

		System.out.println("Marks before conversion: "+marks);
		System.out.println("Marks after conversion: "+marksInt);
	}

}
