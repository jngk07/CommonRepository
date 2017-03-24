package algorithm.search;

import java.util.*;

public class IceCreamParlor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       
        for(int x_i=0; x_i < n; x_i++){
            int dollar = in.nextInt();
            int falvour = in.nextInt();
            int[] x = new int[falvour];
            
            for(int i=0; i< x.length; i++){
                x[i] = in.nextInt();
            }
            iceCreamParlor(dollar, x);
        }
        
       
    }
    
    static void iceCreamParlor(int dollar, int[] x){
        
        int sum =0;
        int count =0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<x.length;i++){
            
            
            for(int j=1; j<x.length;j++){
                if(i != j){
                   if(!list.contains(i) && !list.contains(j)){ 
                    sum = x[i] + x[j];
                    
                        if(sum == dollar){
                             
                             System.out.print(i+1 + " ");
                             System.out.println(j+1);
                         
                             list.add(i);
                             list.add(j);
                        }
                   }
                }
                    
               
            }
          
        }
    
         
    }

}
