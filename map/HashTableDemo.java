package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class HashDemo{
	int n;
	HashDemo(int a){
		n=a;
	}
	@Override
	public String toString() {
		return ""+n;
	}
}
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		ht.put("krishan",100);	
		ht.put("akash", 200);
		ht.put("vikash", 3000);
		ht.put("gopal",1100);	
		ht.put("manu", 2020);
		ht.put("rahul", 330);
		ht.put("KK", 100);
		System.out.println("100 contains "+ht.contains(100));//check value contains or not
		System.out.println("\"Krishan\" contains "+ht.containsKey("krishan"));
		System.out.println(ht.containsValue(100));
		Set ks=ht.keySet(); // iterate the keys
		Iterator i=ks.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.print("HashCode of "+string+" "+string.hashCode()+" ");
		}
		System.out.println();
		System.out.println("*****************get values by enumeration************");
		Enumeration<Integer> e=ht.elements(); // this returns the enumeration of values
		while (e.hasMoreElements()) {
			Integer integer = (Integer) e.nextElement();
			System.out.print(integer+" ");
		}
		System.out.println();
		System.out.println("****************Entryset by entrySet()***********");
		Set es=ht.entrySet();
		Iterator ies =es.iterator();
		while(ies.hasNext()) {
			Map.Entry m=(Map.Entry) ies.next();
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		System.out.println("********Print by foreach*********");
		ht.forEach((k,v)->{
			System.out.println(k+" "+v);
        });
//		map.compute(key, (k, v) -> (v == null) ? msg : v.concat(msg))
		ht.compute("krishan",(key,val)->val+10);
		ht.computeIfAbsent("vk",key->10);
		System.out.println(""+ht.remove("vk"));
		System.out.println(""+ht.remove("KK"));
		ht.computeIfPresent("manu",(key, val) -> val + 100);
		
		System.out.println(ht);		
	}

}
