package map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

class Animal{
	String animal;
	Animal(String a){
		animal=a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return animal;
	}
}
public class FailSafeHashTable {
	public static void main(String[] args) {
//		ArrayList l=new ArrayList();
//		l.add("kk");l.add("kk");l.add("kk");l.add("kk");l.add("kk");
			HashSet hs=new HashSet();
			hs.add("set");
		Hashtable<Animal, String> table = new Hashtable<Animal, String>();
		Hashtable table1 = new Hashtable();
		table.put(new Animal("cat"), "an animal");
		table.put(new Animal("dog"), "another animal");
		Enumeration<Animal> e=table.keys();
		while (e.hasMoreElements()) {
			Animal word = (Animal) e.nextElement();
			table.put(new Animal("cow"), "bhoooooou");
			System.out.println(word);
		}
//		table1.put("list", l);
//		System.out.println(table1.get("list"));
		System.out.println(hs);
		table1.put("set", hs);
		System.err.println(table1);
	}
}
