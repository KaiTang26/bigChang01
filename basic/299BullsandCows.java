class Solution {
    public String getHint(String secret, String guess) {

        Map<Integer, Integer> secretMap = new HashMap<Integer, Integer>();

        char[] secretArray =secret.toCharArray();

        char[] guessArray = guess.toCharArray();

        Set<Integer> guessSet = new HashSet<Integer>();

        int numberOfBulls = 0;
        int numberOfCows = 0;

        for(int i=0; i<secretArray.length; i++){
            secretMap.put(i, (int)secretArray[i]);
        }

        for(int i=0; i<guessArray.length; i++){

            if(secretMap.containsValue((int) guessArray[i])){

               int value = (int) guessArray[i];
               if(secretMap.get(i) == value){
                   numberOfBulls++;
               }else{
                   if(!guessSet.contains(value)){
                       numberOfCows++;
                       guessSet.add(value);
                   }
               }
            }
        }

        return numberOfBulls+"A"+numberOfCows+"B";

    }
}
