import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;


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
    // Below function is unrelated to above statement.
    public void randomTester() {
        String in = "abcdefghijk lm no p";
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(in.indexOf(c));
            System.out.println(" " + c);
        }
        System.out.println(in.indexOf("$"));
    }

    // Finding the missing number in an unsorted array
    // Step 1 - sort the input array
    // Step 2 - add the elements in array to HasSet (use Arrays.asList(arrayInput) method to create hashset)
    // Step 3 - in a loop from 0 to highest element in input array (last element value in sorted array)
    // Step 4 - with in the loop check if hashset contains ith value, if not, print absent and ith value, else print ith value

    public void missingNumber(Integer[] inputIntegers){
        
        Arrays.sort(inputIntegers);
        HashSet<Integer> input = new HashSet<>(Arrays.asList(inputIntegers));
        int end = inputIntegers[inputIntegers.length - 1];

        for(int i = 0; i <= end; i++) {
            if (input.contains(i)) {
                System.out.println(i);
            }
            else System.out.println("missing number: " + i);
        }
    }

    // Finding the missing number in an unsorted array - with space complexity of N
    // Step 1 - sort the input array
    // Step 2 - Check for the first element and see if it is greater than 2, print Numbers missing from 0 to input[0]-1
    //          if it is greater than 0 but less than 2, print number missing 0 and print input[0]
    //          else print input[0] 
    // Step 3 - create an integer variable diff and initialise it with 0
    // Step 4 - In a loop spanning the size of the array (length-1), perform difference between nth element and (n-1)th element and store it in diff
    //          if diff is greater than 0, then print Numbers missing from input[i] - (diff-1) to input[i]-1 and print input[i]
    //          if diff is equal to 2, then pring Number missing input[i] - 1 and print input[i]
    //          else print input[i]
    public void missingNumberWithoutSet(Integer[] inputInteger){
        Arrays.sort(inputInteger);
        int size = inputInteger.length - 1;
        if (inputInteger[0] >= 2) {
            System.out.println("Numbers misisng from " + 0 + " to " + (inputInteger[0] - 1));
            System.out.println(inputInteger[0]);         
        } else if (inputInteger[0] > 0 && inputInteger[0] < 2) {
            System.out.println("Number missing: 0");
            System.out.println(inputInteger[0]);         
        } else System.out.println(inputInteger[0]);

        int diff = 0;

        for(int i = 1; i <= size; i++){
            diff = inputInteger[i] - inputInteger[i - 1];
            if (diff > 2) {
                System.out.println("Numbers misisng from " + (inputInteger[i] - (diff - 1)) + " to " + (inputInteger[i] - 1));   
                System.out.println(inputInteger[i]);             
            } else if (diff == 2){
                System.out.println("Number missing: " + (inputInteger[i]-1));
                System.out.println(inputInteger[i]);         
            } else System.out.println(inputInteger[i]);
        }
    }

    // Finding the missing number in an unsorted array - Without sorting
    // Step 1 - Find the max value in the array, in the same loop, add values of the array to a linkedlist
    // Step 2 - loop from 0 to max value found from the array, check if the current value is present in linkedlist
    //          If not present, add tje current value the same linkedlist.
    //          If present, remove the current value from the linkedlist.
    // NOTE - no sorting is choosen here but the output will be sorted.
    public void missingNumberUsingListWithoutSorting(Integer[] inputInteger) {
        int maxValue = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer integer : inputInteger) {
            if (maxValue < integer) maxValue = integer;
            list.add(integer);
        }

        for(int i = 0; i <= maxValue; i++){
            if (!list.contains(i)) {
                list.add(i);
            } else list.removeFirstOccurrence(i);
        }

        System.out.println(list.toString());


    }
    
}
