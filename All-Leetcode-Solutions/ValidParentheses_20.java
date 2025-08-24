import java.util.Stack;

public class ValidParentheses_20 {
     public static boolean  isValid(String str){

    Stack<Character> st = new Stack<>();
       int n = str.length();

       for(int i = 0; i < n; i++){
           char ch = str.charAt(i);

           // Push opening brackets
           if(ch == '(' || ch == '[' || ch == '{'){ 
               st.push(ch);
           }
           // Handle closing brackets
           else if(ch == ')' || ch == ']' || ch == '}'){  
               if(st.isEmpty()) return false;

               char top = st.peek();
               if((top == '(' && ch == ')') || 
                  (top == '[' && ch == ']') || 
                  (top == '{' && ch == '}')) {
                   st.pop();
               } else {
                   return false; // mismatch
               }
           }
       }

       return st.isEmpty(); // true if no unmatched opening brackets
   }

    public static void main(String[] args) { 
          String s = "([)]";
        System.out.println(isValid(s));

     }
}
