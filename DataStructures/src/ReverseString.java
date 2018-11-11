
/**
 * @author Sachchidanand Singh
 * Reverse String using String builder
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		String s="This is my String";
	//expected String="siht si ym gnirtS"
		System.out.println("Final After Reverse--" +reverseStr(s));

	}
	
	public static String reverseStr(String str){
		int w=0;
		int x=0;
		StringBuilder s=new StringBuilder(str);
		for (int i=0;i<s.length();i++){
			if(s.charAt(i)==' '||i==s.length()-1){
				x=i-1;
				if(i==s.length()-1){
					x=i;
				}else{
					x=i-1;
				}
				s=swap(s,w,x);
				w=i+1;
			}
		}
		return s.toString();
	}

	private static StringBuilder swap(StringBuilder str, int w, int x) {
		char start,end;
		for(int i=w;i<=w+(x-w)/2;i++){
			start=str.charAt(i);
			end=str.charAt(w+x-i);
			str.setCharAt(i, end);
			str.setCharAt(w+x-i, start);
		}
		
		System.out.println("intermediate " +str);
		return str;
		
	}

}
