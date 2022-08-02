package test;

import java.util.*;

public class LRUCache {
	
	Map<String, String> cacheMap;
	int size;
	
	Map<String, String> detailMap;
	
	public LRUCache(int size) {
		this.cacheMap = new LinkedHashMap<>(size);
		this.size = size;
		this.detailMap = new HashMap<>();
		
		detailMap.put("ABCD", "ABCD");
		detailMap.put("EFGH", "EFGH");
		detailMap.put("IJKL", "IJKL");
		detailMap.put("MNOP", "MNOP");
		detailMap.put("1234", "1234");
		detailMap.put("QRST", "QRST");
		detailMap.put("UVWX", "UVWX");
		detailMap.put("YZAB", "YZAB");
		detailMap.put("5678", "5678");
		detailMap.put("1234", "1234");
		detailMap.put("CDEF", "CDEF");
		detailMap.put("GHIJ", "GHIJ");
		detailMap.put("KLMN", "KLMN");
		detailMap.put("OPQR", "OPQR");
		detailMap.put("STUV", "STUV");
		detailMap.put("WXYZ", "WXYZ");
		detailMap.put("CDEF", "CDEF");
		detailMap.put("3040", "3040");
		
	}
	
	public void displayCache() {
		System.out.println("LRU cache is " + cacheMap);
	}
	
	public boolean get(String key, String value) {
		if(!cacheMap.containsKey(key)) {
			return false;
		}
		cacheMap.remove(key);
		cacheMap.put(key, value);
		
		return true;
	}
	
	
	public void put(String key, String value) {
		if(cacheMap.size() == size) {
			String key1 = cacheMap.entrySet().iterator().next().getKey();
			cacheMap.remove(key1);
		}else {
			cacheMap.put(key, value);
		}
	}
	public void getFromDetailedMap(String key) {
		if(cacheMap.containsKey(key)) {
			String value = cacheMap.get(key);
			cacheMap.remove(key);
			cacheMap.put(key, value);
			displayCache();
		}else {
			String value = detailMap.get(key);
			put(key, value);
			displayCache();
		}
	}
	
	
	public static void main(String[] args) {
		//System.out.println("Hello World");
		LRUCache cache = new LRUCache(10);
		
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		while(true) {
			cache.getFromDetailedMap(key);
			key = sc.next();
		}
	
		
	}

}
