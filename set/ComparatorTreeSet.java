package set;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
	int id,age;
	String name;
	public Person(int id, int age, String name) {
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "id : "+id+" Age : "+age+" Name : "+name;
	}
	
}
public class ComparatorTreeSet {

	public static void main(String[] args) {
		Comparator c=new IdComp();
		TreeSet<Person> t=new TreeSet<Person>(c);
		t.add(new Person(11,20,"krishan"));
		t.add(new Person(9, 20, "aksh"));
		System.out.println(t);
	}

}
class NameComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		return p1.name.compareTo(p2.name);
	}
	
}
class IdComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		System.out.println("P1 "+p1.id);
		System.out.println("p2 "+p2.id);
		if(p1.id<p2.id) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
