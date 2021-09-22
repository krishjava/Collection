package map;

import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyClass {

	public static void main(String[] args) throws Exception {
		
		
		
		FileReader reader =new FileReader("/home/krishan/Documents/java Projects/collection/src/map/propertclass.properties");
		File f=new File("/home/krishan/Documents/java Projects/collection/src/map/propertclass.properties");
		PrintStream fileWriter=new PrintStream(f);
		Properties p=new Properties();
		p.put("krishan", "kumawat");
		p.put("akash", "sharma");
		p.put("yoyo", "honey");
		p.list(fileWriter);
		p.load(reader);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		
	    Enumeration e=p.propertyNames();
	    while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
	    System.out.println("Check is empty "+p.isEmpty());
	    
//		System.out.println("sdf;lk");
			
	}

}
