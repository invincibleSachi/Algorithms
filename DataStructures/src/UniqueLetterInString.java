public class UniqueLetterInString {
	public static void main(String[] args) {
		String s = "The quick lazy fox jumped on brown dog";
		StringBuilder sb=new StringBuilder(s);
		StringBuilder unique=new StringBuilder("");
		StringBuilder dups=new StringBuilder("");
		String ch,start,end;
		char c;
		int mid=0;
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			if(c!=' '){
			ch=c+"";
			if(dups.indexOf(ch)==-1){
				if((mid=unique.indexOf(ch))!=-1){
					start=unique.substring(0,mid);
					if(mid<unique.length()-1){
					end=unique.substring(mid+1, unique.length());}else{
						end="";
					}
					unique.setLength(0);
					unique.append(start);
					unique.append(end);
					dups.append(ch);
				}else{
					unique.append(ch);
				}
			}
		}
		}
		System.out.println("All unique: "+unique);
		System.out.println("All dups: " +dups);
	}
}
