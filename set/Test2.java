package set;

import java.util.TreeMap;
import java.util.TreeSet;

import javax.script.Compilable;

class Testing implements Comparable{
	int a;
	public Testing(int a) {
		this.a=a;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Test2 {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
//		t.put(new Testing(11), null);
		t.put(1,new Testing(0));
		t.put(11,new Testing(10));
		System.out.println(t);
	}

}
