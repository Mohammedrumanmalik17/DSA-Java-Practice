package dsa;
import java.util.*;

public class HashMapDemo {
public static void main(String[] args) {
	
	
	HashMap<String,Integer>map=new HashMap<>();
	map.put("INDIA", 1);
	map.put("AMERICA", 10);
	map.put("LONDON", 50);
	map.put("Bangladesh", -1);
	map.remove("Bangladesh");
	System.err.println(map);
	
	
	if(map.containsKey("INDIA")) {
		System.out.println("Key is present in the map");
		
	}
	else{
		System.out.println("Key is not present in the map");
	}
		System.out.println(map.get("INDIA"));
		System.out.println(map.get("Bangladesh"));
	
		
		
		for(Map.Entry<String,Integer>e:map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
}
}
