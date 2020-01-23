
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String s = "";
        char[] arr =  valueToBeReversed.toCharArray();
        for (int i = arr.length-1; i>=0 ; i--){
            s += arr[i];
        }
        
        return s;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        //assume input has odd length
        char[] arr = word.toCharArray();
        int mid = arr.length/2;
        return arr[mid];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char[] arr = value.toCharArray();
        String s = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != charToRemove){
                s += arr[i];
            }
        }
        return s;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
       String[] arr =  sentence.split(" ");
       return arr[(arr.length -1)];
    }
}
