import java.util.LinkedHashSet;

public class Qone {

    // Remove duplicate characters in a String
    // Step 1 - Convert String to an array of characters
    // Step 2 - Store each character of the array in a linked hash set becqause it does not allow duplicates and it is sequential since it is linked
    // Step 3 - User String builder to build a string from the linked hash set
    // Step 4 - convert string builder to a string - this is the output.

    public String removeDuplicateChar(String string){
        char[] in = string.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c: in) set.add(c);
        StringBuilder out = new StringBuilder();
        for(char c: set) out.append(c);
        return out.toString();
    }

    // Check if a string is a Pangram
    // Pangram  string that contains all alphabets atleast once.
    // Step 1 - Convert the string to lowercase (and no need to remove blank space, since we are checking if a char is present in string to get index, 
    // if it is not present, it will not return any index)
    // Step 2 - Check if the length of the string is less than 26 - since the min has to be 16 to contain all alphabets.
    // Step 3 - in a loop, looped from a to z, check if the char is present in the string using indexOf method, if the value is less than 0 return false
    // Step 4 - outside the loop, return true.

    public boolean isPanagram(String string){
        String input = string.toLowerCase();
        if(input.length() < 26) {
             return false;
            }
        for (char alp = 'a'; alp <= 'z'; alp++) {
            if (input.indexOf(alp) < 0) {
                return false;
            }
        }
        return true;
    }

    // Lexicographic ordering is when strings alpha char in a string are compared. like names ordering in attendance register in school.
    // compateTo() of string compares the strings Lexicographically
    public void randomTester() {
        String in = "abcdefghijk lm no p";
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(in.indexOf(c));
            System.out.println(" " + c);
        }
        System.out.println(in.indexOf("$"));
    }
    
}
