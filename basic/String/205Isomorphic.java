class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++){

            boolean isInS = sMap.containsKey(s.charAt(i));
            boolean isInT = tMap.containsKey(t.charAt(i));
            if( (isInS && !isInT) || (isInT && !isInS)  ){
                return false;
            }

            if(isInS && isInT){
                if(sMap.get(s.charAt(i)) !=tMap.get(t.charAt(i))){
                    return false;
                }
            }

            if(!isInS && !isInT){
                sMap.put(s.charAt(i), i);
                tMap.put(t.charAt(i), i);
            }

        }

        return true;

    }
}

// t: O(n)
// s: O(n)?