// recursion version -- time exceeded
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return helper(1, n);
    }

    public int helper(int start, int end){

        int mid = (start + end)/2;

        boolean isBad = isBadVersion(mid);

        if(isBad){

            if(!isBadVersion(mid-1)){
                return mid;
            }else{
                return helper(start, mid);
            }
        }else{
            return helper(mid+1, end);
        }
    }
}




public class Solution2 extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left = 1;
    int right = n;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
        
        
        
        
        
    }
    
   
}