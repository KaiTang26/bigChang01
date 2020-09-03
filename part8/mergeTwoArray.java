class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] newMerged = new int[A.length + B.length];
        int pointerA = 0;
        int pointerB = 0;
        int indexC = 0;

        while(pointerA<A.length && pointerB <B.length){
            if(A[pointerA]<B[pointerB]){
                newMerged[indexC] = A[pointerA];
                pointerA++;
            }else{
                newMerged[indexC] = B[pointerB];
                pointerB++;
            }
            indexC++;
        }

        while(pointerA<A.length){
            newMerged[indexC] = A[pointerA];
            pointerA++;
            indexC++;
        }

        while(pointerB <B.length){
            newMerged[indexC] = B[pointerB];
            pointerB++;
            indexC++;
        }

        return newMerged;
    }
}