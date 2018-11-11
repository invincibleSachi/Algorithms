package com.inspire.assignments;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ValidateMathematicalExpr {

    public static void main(String[] args){
        String expr="[36/{4*(2+4)}]";
        String num1=null,num2=null;
        ArrayList<Character> operators=new ArrayList<Character>();
        operators.add('+');
        operators.add('-');
        operators.add('*');
        operators.add('/');
        ArrayList<Character> numeric=new ArrayList<Character>();
        numeric.add('0');
        numeric.add('1');
        numeric.add('2');
        numeric.add('3');
        numeric.add('4');
        numeric.add('5');
        numeric.add('6');
        numeric.add('7');
        numeric.add('8');
        numeric.add('9');
        ArrayList<Character> parenthesis=new ArrayList<Character>();
        parenthesis.add('}');
        parenthesis.add('{');
        parenthesis.add(')');
        parenthesis.add('(');
        parenthesis.add('[');
        parenthesis.add(']');

        HashMap<Character,Character> matchingParan=new HashMap<Character,Character>();
        matchingParan.put('[',']');
        matchingParan.put('(',')');
        matchingParan.put('{','}');

        char[] tokens=expr.toCharArray();
        Stack<Integer> in=new Stack<Integer>();
        Stack<Character> op=new Stack<Character>();
        Stack <Character> paran=new Stack<Character>();

        for (int i=0;i<tokens.length;i++){
            if(parenthesis.contains(tokens[i])) {
                if(!paran.isEmpty() && matchingParan.get(paran.peek())==tokens[i]){
                    paran.pop();
                }else {
                    paran.push(tokens[i]);
                }
            }else if(operators.contains(tokens[i])){
                op.push(tokens[i]);
            } else if(numeric.contains(tokens[i])){
                String num=tokens[i]+"";
                while (numeric.contains(tokens[++i])){
                    num=num+tokens[i];
                }
                i--;
                if(in.empty()){
                    in.push(Integer.parseInt(num));
                }else {
                    in.push(domath(in.pop(),op.pop(),Integer.parseInt(num)));
                }
            }else{
                System.out.println("Expression is not valid");
            }
        }
        if(paran.isEmpty() && op.isEmpty() && !in.isEmpty()){
            System.out.println("result is "+in.pop());
        }else {
            System.out.println("expression is invalid");
        }
        while (!paran.isEmpty()){
            System.out.println("paran "+paran.pop());
        }

        while (!op.isEmpty()){
            System.out.println("op "+op.pop());
        }
    }

    public static int domath(int a,char op, int b){
        switch (op){
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/':return a/b;
            default:return 0;
        }
    }
}
