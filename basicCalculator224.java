import java.util.Stack;

public class basicCalculator224 {
    public static void main(String[] args) {
        String s="(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
    public static int calculate(String s) {
        int value = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();
        char[] expression = s.toCharArray();
        for(int i = 0; i < expression.length; i++){
            if(Character.isDigit(expression[i])){
                int val = 0;
                while(i < expression.length && Character.isDigit(expression[i])){
                    val = val * 10 + (expression[i] - '0');
                    i++;
                }
                i--;
                val = val * sign;
                sign = 1;
                value += val;   
            }
            else if(expression[i] == '('){
                stack.push(value);
                stack.push(sign);
                value = 0;
                sign = 1;
            }
            else if(expression[i] == ')'){
                value *= stack.pop();
                value += stack.pop();
            }
            else if(expression[i] == '-'){
                sign *= -1;
            }
        }
        return value;
    }
}
