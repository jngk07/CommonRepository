package algorithm.strings;

import java.util.*;
public class HackerRankStringFinding {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            findHacker(s);
          //  System.out.println();
        }
    }
    
      static void findHacker(String str){
        
        char[] cArr = "hackerrank".toCharArray();
         
        String concat ="";
        int count =0;
        for(int i=0; i<str.length();i++){
            
            
                if(str.charAt(i) == cArr[count]){
                      str = str.substring(i);
                      
                      System.out.println(str);
                         i=0;
                     concat = concat +cArr[count];
                     if(!concat.equals("hackerrank")){
                             count++;
                         }else{
                             break;
                         }
                       
                }
             
        }
     
        if(concat.equals("hackerrank") && !concat.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
        
      
        
    }
}
