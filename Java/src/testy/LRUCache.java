package testy;

import java.util.*;

public class LRUCache {

	Map<String, String> cache;
	
	Map<String, String> dMap;
	
	int capacity;
	
	public LRUCache(int capacity)
	{
		this.cache = new LinkedHashMap<>(capacity);
		this.dMap = new HashMap<>();
		dMap.put("ABCD", "ABCD");
		dMap.put("EFGH", "EFGH");
		dMap.put("1234", "1234");
		this.capacity = capacity;
	}
	
	

	public boolean get(String key, String value)
	{
		if(!cache.containsKey(key))
			return false;
		cache.remove(key);
		cache.put(key, value);
		return true;
	}

	public void display()
	{
		System.out.println("Linked HM: "+cache);
	}

	public void put(String key, String value)
	{
		if(cache.size()==capacity)
			cache.remove(cache.entrySet().iterator().next().getKey());
		cache.put(key, value);
	}
	
	public void getFromDetailedMap(String key) {
		if(cache.containsKey(key)) {

			String value = cache.get(key);
			cache.remove(key);
			cache.put(key, value);
			display();
		}
		else {
			String value = dMap.get(key);
			
			put(key, value);
			display();
		}
	}

	public static void main(String[] args)
	{
		LRUCache ca = new LRUCache(4);
		Scanner sc = new Scanner(System.in);
		
		
		String key = sc.next();
		while(true) {
			
			ca.getFromDetailedMap(key);
			key = sc.next();
		}
	}
	
}
