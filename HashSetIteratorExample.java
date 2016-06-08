import java.util.*;


public class HashSetIteratorExample {
	
public static void main(String[] args) {
		
		HashSet names = new HashSet();
		
		names.add("ABC");
		names.add("DEF");
		names.add("GHI");
		names.add("JKL");
		names.add("MNO");
		names.add("PQR");
		names.add("STU");
		names.add("VWX");
		names.add("YZ");
		
		Iterator iterator = names.iterator();
		
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
			
		}
	
	}

}
