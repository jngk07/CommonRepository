package firstProject;

import java.util.*;

public class one {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int count =0;
        for(int i=0;i <k;i++)
        {
              int temp = a[0]; // 1

              for(int j=1; j< n; j++){

                  a[count]= a[j]; 
                  count++;
           
              }
             a[n-1]= temp;
             count=0;
         }
       return a;
   }
   
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int k = in.nextInt();
       int a[] = new int[n];
       for(int a_i=0; a_i < n; a_i++){
           a[a_i] = in.nextInt();
       }
     
       int[] output = new int[n];
       output = arrayLeftRotation(a, n, k);
       for(int i = 0; i < n; i++)
           System.out.print(output[i] + " ");
     
       System.out.println();
     
   }

}
