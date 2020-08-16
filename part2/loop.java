public class Solution {
    /**
     * @param n: a number represent year
     * @return: whether year n is a leap year.
     */
    public void loop(int n, int m) {
        for(int i=0; i<=100; i++){
            System.out.println(i);
        }

        for(int i=0; i<=n; i++){
            System.out.println(i);
        }

        for(int i=n; i>=m; i--){
            System.out.println(i);
        }

        for(int i=m; i<=n; i++){
            System.out.println(i);
        }

        for(int i=m; i<=n; i+=2){
            System.out.println(i);
        }
        
    }
}