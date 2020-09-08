
/*
    find prefix between first and second element
        if there is prefix: strs[i].indexOf(prefix)==0
    
    tested for all element and change length
**/
class Solution1 {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length ==0){
            return "";
        }
        String prefix = strs[0];

        for(int i=1; i<strs.length; i++){

            while(strs[i].indexOf(prefix)!=0){

                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;

    }
}

// Divide and conquer
class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix = divider(strs, 0, strs.length);

        return prefix;

    }


    public String divider( String[] strs, int start, int end){

        if(start==end){
            return strs[start];
        }
        
        int mid = ((start+end)/2);
        String leftString = divider(strs, start, mid);
        String rightString = divider(strs, mid+1, end);
        return commonPrefix(leftString, rightString);
    }


    public String commonPrefix(String str1, String str2){
        int minLen = Math.min(str1.length(), str2.length());
        for(int i=0; i<minLen; i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return str1.substring(0, i);
            }
        }
        return str2.substring(0, minLen);
    }


}


