import java.util.HashMap;
import java.util.Stack;

public class ExprEval {
	private String expr;
	private Stack<String> paranthesis=new Stack<String>();
	private Stack<String> operator=new Stack<String>();
	private Stack<Integer> operands=new Stack<Integer>();
	public String prev;
	public int result;
	private HashMap<String,String> parenthesisMatcher=new HashMap<String,String>();

public ExprEval(String expr){
		this.expr=expr;
		parenthesisMatcher.put(")", "(");
		parenthesisMatcher.put("}", "{");
		parenthesisMatcher.put("]", "[");
}
public void evaluate(){
	String c;
	String matchParan;
	String Desiredoperator;
	int a,b;
	for(int i=0;i<expr.length();i++){
		c=expr.charAt(i)+"";
		if(isNumeric("c")==true){
			IntegerBuilder(c);
		}else if(isParanthesis("c")){
			
			if(c.equals("(")|c.equals("{")|c.equals("[)")){
				paranthesis.push(c);
			}else{
				matchParan=paranthesis.pop();
				if(parenthesisMatcher.get(matchParan)!=c){
					System.out.println("The Mathematical expression is not correct, please check parenthesis order");
					break;
				}else{
					Desiredoperator=operator.pop();
					b=operands.pop();
					a=operands.pop();
					result=calculate(Desiredoperator,a,b);
					operands.push(result);
				}
			}
			
		}else if(isOperator(c)){
			operator.push(c);
		}
		
		
	}
	System.out.println("asdfasfasd");
	while(!operator.isEmpty()){
		Desiredoperator=operator.pop();
		b=operands.pop();
		a=operands.pop();
		result=calculate(Desiredoperator,a,b);
		operands.push(result);
	}
}
	
private boolean isNumeric(String c){
	if(c.matches("[0-9]+")){
		return true;
	}else{
		return false;
	}
	
}

private boolean isParanthesis(String c){
	if(c.equals("(")|c.equals(")")|c.equals("{")|c.equals("}")|c.equals("[")|c.equals("]")){
		return true;
	}else{
		return false;
	}
}

private boolean isOperator(String c){
	if(c.equals("+")|c.equals("-")|c.equals("*")|c.equals("/")|c.equals("^")){
		return true;
	}else{
		return false;
	}
}

public String IntegerBuilder(String current){
	String oldprev;
	System.out.println("prev: " +prev);
	System.out.println("Curr: " +current);
	if(isNumeric(prev)==true && isNumeric(current)==true){
		oldprev=prev;
		prev=prev+current;
		return oldprev + current;
	}else{
		operands.push(new Integer(Integer.parseInt(prev)));
		prev="0";
		return prev;
	}
	
}
private int calculate(String op, int a, int b){
	switch(op){
	case "+": return a+b;
	case "-": return a-b;
	case "*": return a*b;
	case "/": return a/b;
	case "^": return a^b;
	default: return 0;
	}
	
}

	
}
