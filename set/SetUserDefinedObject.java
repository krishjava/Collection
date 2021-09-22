package set;

import java.util.HashSet;

class Emp{
	int id,age;
	String name;
	public Emp(int id, int age, String name) {
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Emp e=(Emp)obj;
		if(this.id==e.id) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "id : "+id+" Age : "+age+" Name : "+name;
	}
	
}

public class SetUserDefinedObject {
	

	public static void main(String[] args) {
		HashSet<Emp> h=new HashSet<Emp>();
		h.add(new Emp(101,21,"krishan"));
		h.add(new Emp(101,21,"krishan"));
		h.add(new Emp(101,21,"krishan"));
		h.add(new Emp(102,22,"Akash"));
		System.out.println(h);
	}

}
