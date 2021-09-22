package set;

import java.util.TreeSet;

class EmployeeTest implements Comparable{
	int id,age;
	String name;
	public EmployeeTest(int id, int age, String name) {
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(Object o) {
		System.out.println("For this "+this.id);
		EmployeeTest e=(EmployeeTest)o;
		System.out.println("For emp "+e.id);
		if(this.id>e.id) {
			return 1;
		}
		else if (this.id<e.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "id : "+id+" Age : "+age+" Name : "+name;
	}
	
}
public class Test {

	public static void main(String[] args) {
		TreeSet<EmployeeTest> t=new TreeSet<EmployeeTest>();
		t.add(new EmployeeTest(104,21,"krishan"));
		t.add(new EmployeeTest(101,22,"akash"));
		t.add(new EmployeeTest(102,23,"vikash"));
		System.out.println(t);
	}

}
