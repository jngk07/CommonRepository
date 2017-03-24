package algorithm.strings;

import java.util.*;

public class HackerLandRadioTransmitter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        hackerHome(x, k);
    }
    
static void hackerHome(int[] x, int k){
        
        Arrays.sort(x);
        
             
        int i= x[0];
        int last = x[x.length-1];
        
        int house =0;
        List<Integer> list = new ArrayList<Integer>();
         
        for(;i < last ;i++){
            
              if(i != last){
                house = i + k;
                i= house+k;
                if(house > last){
                    System.out.println("break if");
                    break;
                }
                list.add(house);
             }else{
                 if(house > last){
                     System.out.println("break else");
                     break;
                 }
                   list.add(i);
              }
              
                
        }
        System.out.println(list.size());
    }

}
