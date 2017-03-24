package algorithm.search;

import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        
        int x_A[] = new int[A];
        
        for(int i=0; i<A;i++){
            x_A[i] = sc.nextInt();
            
        }
        
        int B = sc.nextInt();
        
        int x_B[] = new int[B];
        
        for(int i=0; i<B;i++){
            x_B[i] = sc.nextInt();
            
        }
         
        findMissingNumber(x_A, x_B);
    }
    
    static void findMissingNumber(int[] x_A, int[] x_B){
        int a_length = x_A.length;
        int b_length = x_B.length;
        
        Arrays.sort(x_A);
        Arrays.sort(x_B);
        int aLast = x_A[a_length-1];
        int bLast = x_B[b_length-1];
        
        int[] aArr = new int[aLast+1];
        int[] bArr = new int[bLast+1];
        
        for(int i=0; i<x_A.length;i++){
            aArr[x_A[i]]++;
        }
       
        
        for(int i=0; i<x_B.length;i++){
            bArr[x_B[i]]++;
        }
        
        for(int i=0; i<aArr.length;i++){
            
            if(aArr[i] != bArr[i]){
                System.out.print(i + " ");
            }
        }
    }

}
