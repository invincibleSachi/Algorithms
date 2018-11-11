
public class NthNuminFibo {

	public static void main(String[] args) {
		//fib 0,1,1,2,3,5,8,13,21,34
		
		//get nth number in this fibnoacci series i.e. if I give input 4 ouput should be 3
		// input 7 output is 8
	int a=-1;
	int b=1;
	int n=5;
		
		System.out.println(getFact(9));
	}
	
	public static int getFact(int n){
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return getFact(n-1)+getFact(n-2);
		}
	}
	
	

}
