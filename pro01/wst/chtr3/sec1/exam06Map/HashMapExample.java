package chtr3.sec1.exam06Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap <String, Integer>();
		
	    map.put("�ſ��",85);
	    map.put("ȫ�浿",90);
	    map.put("���屺",80);
	    map.put("ȫ�浿",95);
	    System.out.println("�� Entry ��: " + map.size());
	    
	    System.out.println("\tȫ�浿 : "+ map.get("ȫ�浿"));
	    System.out.println();
	    
	    Set<String> keyset = map.keySet();
	    Iterator<String> keyIterator = keyset.iterator();
	    while(keyIterator.hasNext()) {
	    	String key = keyIterator.next();
	    	Integer value = map.get(key);
	    	System.out.println("\t" + key +" : " + value);
	    }
	    System.out.println();
	    
	    map.remove("ȫ�浿");
	    System.out.println("�� Entry ��:" + map.size());
	    
	    Set<Map.Entry<String, Integer>> entrySet= map.entrySet();
	    Iterator<Map.Entry<String , Integer>> entryIterator = entrySet.iterator();
	    
	    while(entryIterator.hasNext()) {
	    	Map.Entry<String, Integer>entry = entryIterator.next();
	    	String key = entry.getKey();
	    	Integer value = entry.getValue();
	    	System.out.println("\t" + key +" : " + value);
	    }
	    System.out.println();
	    map.clear();
	    System.out.println("�� Entry ��:" + map.size());
	}
         
}
