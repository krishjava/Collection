package map;

import java.util.TreeMap;
class TestMap{
	int a;
	TestMap(int a){
		this.a=a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a+"";
	}
}
public class Test {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
//		t.put("1", "krisan");
//		t.put("3", "ak");
//		t.put("0", "lk");
//		t.put(2, 200);
		t.put("1", new TestMap(1));
		System.out.println(t);
	}

}
