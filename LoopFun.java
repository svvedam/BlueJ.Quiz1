 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int factResult = 1;
          for(int i = 1; i <= number; i++){
              factResult = factResult * i;
          }
          return factResult;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          StringBuilder sbr = new StringBuilder();
          String str="";
          String [] strArray = phrase.split(" ");
          
          for(int i = 0; i<strArray.length; i++){
              strArray[i] = strArray[i].toUpperCase();
          }
          for(int j = 0; j<strArray.length; j++){
              char [] chars = strArray[j].toCharArray();
              sbr.append(chars[0]);
          }
          
          return sbr.toString();
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
          int keyLength = 3;
          String encrypted = "";
          for(int i=0; i<word.length();i++){
              int storeAscii = word.charAt(i);
              storeAscii = storeAscii + (keyLength%26);
              
              if(storeAscii >'z'){
                 storeAscii = storeAscii - 26;
              }
              encrypted = encrypted + (char)storeAscii;
          }
          return encrypted;
      }
}
