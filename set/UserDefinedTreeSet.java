package set;

import java.util.TreeSet;

class Employee implements Comparable{
	int id,age;
	String name;
	public Employee(int id, int age, String name) {
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		if(this.id>e.id) {
			return 1;
		}
		else if (this.id<e.id) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "id : "+id+" Age : "+age+" Name : "+name;
	}
	
}
public class UserDefinedTreeSet {

	public static void main(String[] args) {
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(new Employee(104,21,"krishan"));
		t.add(new Employee(101,22,"akash"));
		t.add(new Employee(102,23,"vikash"));
		System.out.println(t);
	}

}
