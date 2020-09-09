class Solution {
    public List<String> generatePossibleNextMoves(String s) {
         Set<String> resSet = new HashSet<String>();

     


        for(int i=0; i<s.length()-1; i++){
            char[] charArray = s.toCharArray();
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i+1);
            if(currentChar == nextChar && currentChar == '+'){
                
                    charArray[i] ='-';
                    charArray[i+1] ='-';

                resSet.add(new String(charArray));
            }
        }

        return new ArrayList<String>(resSet);
        
    }
}