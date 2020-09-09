class Solution {
    public String reverseWords(String s) {

        s=s.trim();

        String[] words =s.split("\\s+");

        System.out.println(words.length);

        int left =0;
        int right = words.length-1;

        while(left<=right){
            String temp = words[left];
            words[left] = words[right];
            words[right] =temp;
            left++;
            right--;
        }

        String str = String.join(" ", words);
        return str;

    }
}