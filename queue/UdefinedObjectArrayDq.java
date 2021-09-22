package queue;

import java.util.ArrayDeque;
class Teacher{
	int id;
	String name;
	Teacher(String name,int id){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return id+" "+name;
	}
}
public class UdefinedObjectArrayDq {

	public static void main(String[] args) {
		ArrayDeque<Teacher> aq=new ArrayDeque<Teacher>();
		aq.add(new Teacher("krishhan",1));
		aq.add(new Teacher("akash",9));
		System.out.println(aq);
	}

}
