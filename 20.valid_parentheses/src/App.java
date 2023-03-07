import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isValid("(){}"));
    }
    public static boolean isValid(String s){
        Stack<Character> stk = new Stack<>();
        int length = s.length();

        if(length > 0){
            stk.push(s.charAt(0));
        }
        else{
            return false;
        }

        for(int i = 1; i < length; i++){
            if(stk.isEmpty()){
                stk.push(s.charAt(i));
                continue;
            }
            switch(stk.peek()){
                case('('):
                    if(s.charAt(i) == ')'){
                        stk.pop();
                    }
                    else{
                        stk.push(s.charAt(i));
                    }
                    break;
                case('{'):
                    if(s.charAt(i) == '}'){
                        stk.pop();
                    }
                    else{
                        stk.push(s.charAt(i));
                    }
                    break;
                case('['):
                    if(s.charAt(i) == ']'){
                        stk.pop();
                    }
                    else{
                        stk.push(s.charAt(i));
                    }
                    break;
            }
        }
        if(stk.isEmpty()){
            return true;
        }
        return false;
    }
}
