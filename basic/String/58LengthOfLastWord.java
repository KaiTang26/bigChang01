
class Solution {
    public int lengthOfLastWord(String s) {


        String[] words =s.split("\\W+");

        if(words.length==0){
            return 0;
        }

        String last = words[words.length-1];

        return last.length();

    }
}