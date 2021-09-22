package queue;

import java.util.PriorityQueue;

class Person implements Comparable{
	int id;
	String name;
	Person(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public int compareTo(Object o) {
		Person p=(Person) o;
		return this.name.compareTo(p.name);
	}
	@Override
	public String toString() {
		return "Id : "+id+" "+"Name : "+name;
	}
}
public class PriorityQUserDefObject {

	public static void main(String[] args) {
		PriorityQueue<Person> pq=new PriorityQueue<Person>();
		pq.add(new Person("krishan", 112));
		pq.add(new Person("krishan", 109));
		pq.add(new Person("krishan", 102));
		pq.add(new Person("krishan", 101));
		System.out.println(pq);
	}

}
