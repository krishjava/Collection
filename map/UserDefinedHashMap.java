package map;

import java.util.HashMap;
class EmpName{
	String name;

	public EmpName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}class EmpId{
	int id;

	public EmpId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EmpId) {
			EmpId e=(EmpId)obj;
			if(this.id==e.id) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return id+" " ;
	}
}
public class UserDefinedHashMap {

	public static void main(String[] args) {
		HashMap<EmpId, EmpName> m=new HashMap<EmpId,EmpName>();
		m.put(new EmpId(4), new EmpName("krishan"));
		m.put(new EmpId(2), new EmpName("akash"));
		m.put(new EmpId(1), new EmpName("sanjay"));
		m.put(new EmpId(1), new EmpName("sanjay"));
		System.out.println(m);
	}

}
