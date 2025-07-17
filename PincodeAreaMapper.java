import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class PincodeAreaMapper {

	public static void main(String[] args) {
		//Map<Integer,String> map = new HashMap<Integer,String>();
		   //Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		   //Map<Integer,String> map = new TreeMap<Integer,String>();
		   Map<Integer,String> map = new Hashtable<Integer,String>();
			
			map.put(415110,"Karad - Satara");
			map.put(411052, "Hinjawadi - Pune"); 
			map.put(411046, "Katraj - Pune"); 
			map.put(400027, "Byculla - Mumbai"); 
			map.put(411002, "Bajirao Rd - Pune"); 
			map.put(411037, "Marketyard - Pune"); 
			map.put(411007, "Aundh - Pune"); 
			map.put(411052, "HINJEWADI - Pune"); // when key is duplicate, value is overwritten
		
			//map will not take duplicate value
			System.out.println("Size : "+map.size());
			
			Scanner sc =new Scanner(System.in);
			
			System.out.print("Enter the pin : ");
			int pin = sc.nextInt();
			
			String area = map.get(pin); //will return value if present otherwise will return null 
			String area1 = map.getOrDefault(pin, "Not avail");//will return value if present otherwise will return 'Not avail'
			System.out.println("Area: "+area);
			System.out.println("Area: "+area1);
			
			Set<Integer> keys = map.keySet();
			for(Integer key : keys)   // will print set of keys 7 times
				System.out.println(key);//will print set of keys once
			
			Collection<String> vals = map.values();
			for(String val : vals) // will return all the values one by one
				System.out.println(val);// will return all the values in one line 
			
			Set<Entry<Integer,String>> keyVals = map.entrySet();
			for(Entry<Integer,String> en : keyVals)
				System.out.println(en.getKey() + " " + en.getValue());

	}

}
