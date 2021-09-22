package queue;

public class TestUtils {
	public static int  getAscii(String str) {
		int sum=0; 
		for(int i=0; i<str.length(); i++)
	    {
	      int asciiValue = str.charAt(i);
	      sum = sum+ asciiValue;
	      //System.out.println(str.charAt(i) + "=" + asciiValue);
	    }
		return sum;
	}
}
