
public class MathExprEval {

	public static void main(String[] args) {
		ExprEval expr=new ExprEval("2+3*6");
		expr.evaluate();
		System.out.println(expr.result);

	}

}
