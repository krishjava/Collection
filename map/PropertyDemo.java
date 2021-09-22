package map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter fileWriter=null;
		try {
			reader=new FileReader("/home/krishan/Documents/java Projects/collection/src/map/db.properties");
			fileWriter=new FileWriter("/home/krishan/Documents/java Projects/collection/src/map/db.properties",true);
			Properties p=new Properties();
			p.load(reader);
			System.out.println(p.getProperty("password"));
			System.out.println(p.getProperty("passwd","Not Available.?"));
			p.put("krishan","kumawat");
			p.put("kk",10);
			System.out.println(p);
			
			p.setProperty("krishan", "");
			p.setProperty("kk", "10");
			p.store(fileWriter,"none");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}

}
