
// one map O(M) (time) O(k) (k=26 space)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] ransomNoteArray = ransomNote.toCharArray();

        char[] magazineArray = magazine.toCharArray();

        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(int i=0; i<magazineArray.length; i++){
            if(!hashMap.containsKey(magazineArray[i])){
                hashMap.put(magazineArray[i], 1);
            }else{
                int count = hashMap.get(magazineArray[i])+1;
                hashMap.put(magazineArray[i], count);
            }
        }

        for(int i=0; i< ransomNoteArray.length; i++){
            if(hashMap.containsKey(ransomNoteArray[i])){
                if(hashMap.get(ransomNoteArray[i])<=0){
                    return false;
                }else{
                    int count = hashMap.get(ransomNoteArray[i]) -1;
                    hashMap.put(ransomNoteArray[i], count);
                }

            }else{
                return false;
            }
        }



        return true;

    }
}