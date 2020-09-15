class Solution {
    public String countAndSay(int n) {




        String a = "1";



        for(int i=1; i<n; i++){
            a = helper(a);
        }

        return a;

    }

    public String helper(String a){

        //String a = "111221";

        String result = "";

        char[] charArray = a.toCharArray();


        int left = 0;
        int right = 0;

        while(left < charArray.length && right< charArray.length){
            int count = 0;
            while(left < charArray.length && right< charArray.length && charArray[left] == charArray[right]){
                count++;
                right++;
            }
            result = result+count+charArray[left];
            left=right;
        }
        return result;
    }
}