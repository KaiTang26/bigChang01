public class Solution {
   
    public void max_secondMax(int[] intArray) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i: intArray){
            if(i>=max){
                sMax = max;
                max = i;
            }else if( sMax<=i){
                sMax = i;
            }
        }

        System.out.println("Max: "+ max);

        System.out.println("SMax: "+ sMax);
       
    }
}
