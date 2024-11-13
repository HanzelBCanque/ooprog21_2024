import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        return scanner.nextLine().toLowerCase();
    }

       public static int vowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;             }
        }
        return -1;   
          }

       public static String[] swapConsonants(String word1, String word2) {
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == -1 || vowelIndex2 == -1) {
            return new String[] {"", ""};
        }

        String part1 = word1.substring(0, vowelIndex1);        
        String part2 = word2.substring(0, vowelIndex2);  
        
        String newWord1 = part2 + word1.substring(vowelIndex1); 
        String newWord2 = part1 + word2.substring(vowelIndex2);

        return new String[] {newWord1, newWord2};
    }

        public static void run() {
        
        String word1 = getWord();
        String word2 = getWord();

        
        if (vowelIndex(word1) == -1 || vowelIndex(word2) == -1 || word1.charAt(0) == 'a' || word1.charAt(0) == 'e' || word1.charAt(0) == 'i' || word1.charAt(0) == 'o' || word1.charAt(0) == 'u' || word2.charAt(0) == 'a' || word2.charAt(0) == 'e' || word2.charAt(0) == 'i' || word2.charAt(0) == 'o' || word2.charAt(0) == 'u') {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            
            String[] spoonerizedWords = swapConsonants(word1, word2);

            if (spoonerizedWords[0].isEmpty() || spoonerizedWords[1].isEmpty()) {
                System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            } else {
                System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWords[0] + " " + spoonerizedWords[1]);
            }
        }
    }

   
    public static void main(String[] args) {
        run(); 
    }
}
