package map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String, String>();
		tm.put("*", "***");
		tm.put("1", "11111");
		tm.put("4", "4444");
		tm.put("03", "3333");
		tm.put("#", "###");
		tm.put("&", "&&&");
		tm.put("a","aaa");
		System.out.println(tm);
		TreeMap<String,Integer> t=new TreeMap<String, Integer>();
		t.put("sa",(int)'a');
		System.out.println(t);
	}

}
