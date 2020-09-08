
// sliding window + substring
// since .equals is O(n)
// Time complexity: \mathcal{O}((N - L)L)O((N−L)L), where N is a length of haystack and L is a length of needle. We compute a substring of length L in a loop, which is executed (N - L) times.
class Solution {
    public int strStr(String haystack, String needle) {


        if(needle.equals(haystack)){
            return 0;
        }

        int needleLen = needle.length();
        int stringLen = haystack.length();

        for(int i=0; i<stringLen-needleLen+1; i++){
            String sub = haystack.substring(i, i+needleLen);

            if(needle.equals(sub)){
                return i;
            }

        }

        return -1;

    }
}

// Sliding window + two pointers

class Solution2 {
    public int strStr(String haystack, String needle) {

        if(haystack.equals(needle)){
            return 0;
        }
        if(needle.length()==0){
            return -1;
        }
        int n = haystack.length();
        int l = needle.length();
        int pn=0;

        while(pn<n-l+1){

            while(pn<n-l+1 && haystack.charAt(pn) != needle.charAt(0)){
                pn++;
            }

            int pl =0;
            int curr_len=0;

            while(pl<l && pn<n && haystack.charAt(pn) == needle.charAt(pl)){
                pl++;
                pn++;
                curr_len++;
            }

            if(curr_len == l){
                return pn-l;
            }

            pn = pn-curr_len+1;


        }

        return -1;

    }
}