// linear time solution
// O(n)

class Solution {
    public int firstUniqChar(String s) {

        char[] sArray = s.toCharArray();
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();

        for(int i=0; i< sArray.length; i++){
            if(!sMap.containsKey(sArray[i])){
                sMap.put(sArray[i], 1);

            }else{

                int count = sMap.get(sArray[i]) +1;
                sMap.put(sArray[i],count);
            }
        }

        for(int i=0; i< sArray.length; i++){
            int count = sMap.get(sArray[i]);
            if(count==1){
                return i;
            }
        }

        return -1;


    }
}