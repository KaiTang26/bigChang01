public class Main {

    public static void main(String[] args) {

        Solution sl = new Solution();

        int[] testArray = new int[]{3, 2, 1, 4, 5};

        sl.sortIntegers2(testArray);





    }

}



class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers2(int[] A) {
        // write your code here
        int[] sortedArray = new int[A.length];
        divider(A, 0, A.length-1, sortedArray);

       for(int i=0; i<A.length; i++){
            System.out.println(A[i]);
       }
    }

    public void divider(int[] A, int start, int end, int[] sorted){

        if(start>=end){

            return;
        }

        int mid = (start+end)/2;
        divider(A, start, mid, sorted );
        divider(A, mid+1, end, sorted);
        merge(A, start, mid, end, sorted);


    }

    public void merge(int[] A, int start, int mid, int end, int[] sorted){

        int pointerA = start;
        int pointerB = mid+1;
        int index = start;

        while(pointerA<=mid && pointerB<=end){
            if(A[pointerA]<A[pointerB]){
                sorted[index]=A[pointerA];
                pointerA++;
            }else{
                sorted[index]=A[pointerB];
                pointerB++;
            }
            index++;
        }

        while(pointerA<=mid){
            sorted[index]=A[pointerA];
            pointerA++;
            index++;
        }

        while(pointerB<=end){
            sorted[index]=A[pointerB];
            pointerB++;
            index++;
        }

        for(int i=start; i<=end; i++){
            A[i] = sorted[i];
        }



    }
}