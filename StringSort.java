import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
			String s="8279251621";
//			System.out.println(a);
			int arr[]=new int[s.length()];
			for(int i=0;i<s.length();i++) {
				arr[i]=Integer.parseInt(s.valueOf(s.charAt(i)));
			}
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
	}

}
