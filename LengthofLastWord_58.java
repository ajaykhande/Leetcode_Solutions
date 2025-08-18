public class LengthofLastWord_58 {
    
    public static int lengthOfLastWord_1(String s) {
        // Step 1: Trim spaces from end (ignore trailing spaces)
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count length of last word
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
    
     /// another approach  /////
    
      public static int  lengthOfLastWord_2(String s) {

          int n = s.length();
           char charr ;
           int lenght =0 ;
           int first =0 ;

             // Step 1: Count all spaces
              for(int i = n-1; i>=0; i--){
             charr = s.charAt(i);

              if(charr==' ')   first++;
               else break;
             }

             // Step 2: Count length of last word
          for(int i = n-1-first; i>=0; i--){
             charr = s.charAt(i);

              if(charr!=' ') lenght++;
             else  return lenght;
          }
          return lenght;
            }
    public static void main(String[] args) { 
        String s = "   fly me   to   the moooon            ";
         
         System.out.println(lengthOfLastWord_2(s));
      
    }
}


