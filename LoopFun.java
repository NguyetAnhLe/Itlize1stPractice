 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int num = 1;
          if(number > 1){
               for(int i = number; i > 0; i--){
                   num *=i;
            }
        }
          return num;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          phrase = phrase.toUpperCase();
          String[] stringArr = phrase.split(" ");
          String acronym = "";
          for(String s : stringArr){
              char[] arr = s.toCharArray();
              acronym += arr[0];
            }
          return acronym;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          //assume that input is only char
          char[] arr = word.toCharArray();
          String s = "";
          for(int i = 0 ; i < arr.length ; i++){
             int n = (int)arr[i];
             if(n < 88 || n < 120){
                 n = n+3;
                 char c = (char)n;
                 s += c;
               }
             else{
                n = n-23;
                char c = (char)n;
                s += c;
                }
            }
          return s;
      }
}
