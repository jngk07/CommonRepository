package commonProj.commonProj;

import java.util.*;
import java.util.Map.Entry;

public class Anagram {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        
        for(int i=0; i<n; i++){
            String s = scan.next();
            findAnagram(s);
        }
    }
    
    static void findAnagram(String str){
            
            int length = str.length();
            
            int div = length / 2;
            String s1 =  str.substring(0, div);
            String s2 = str.substring(div, length);
            
            //System.out.println(s1 + " " +s2);
            
            if(s1.length() != s2.length()){
                System.out.println("-1");
                return;
            }
            Map<Character, Integer> map1 = new HashMap<Character, Integer>();
            Map<Character, Integer> map2 = new HashMap<Character, Integer>();
            
            int c=1;
            for(int i=0; i<s2.length(); i++){
                 
                if(!map1.containsKey(s2.charAt(i))){
                    map1.put(s2.charAt(i), c);
                }else{
                    map1.put(s2.charAt(i), map1.get(s2.charAt(i)) + 1);
                }
                
            }
            
            //System.out.println(map1);
            
            for(int i=0; i<s1.length(); i++){
                
                if(!map2.containsKey(s1.charAt(i))){
                    map2.put(s1.charAt(i), c);
                }else{
                    map2.put(s1.charAt(i), map2.get(s1.charAt(i)) + 1);
                }
                
            }
            
           // System.out.println(map2);
            int sum =0;
            Integer diff =0;
            int v1, v2;
            for(Entry e : map1.entrySet()){
                
                    v1 = (e.getValue() != null) ? (Integer)e.getValue() : 0;
                    v2 = map2.get(e.getKey()) !=null ? map2.get(e.getKey()) : 0;
                    
                    if(v1 > v2){
                        diff = v1- v2;
                        if(diff < 0)
                        {
                            diff = diff * -1;
                        }
                        sum = sum + diff;
                    }
                    
                  
                
                
            }
            
            System.out.println(sum);
    }

}
