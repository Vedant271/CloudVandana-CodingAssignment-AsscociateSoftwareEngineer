import java.util.Scanner;

public class AnagramCheck {
    // Most Optimal Solution
    // Time Complexity - O(n) where n is the length of string
    // Space Complexity - O(1)
    public Boolean AnagramCheckFun(String stringA, String stringB){
        int[] letterFrequency = new int[26];
        for(int i=0;i<stringA.length();i++){
            letterFrequency[stringA.charAt(i)-'a']++;
        }
        for(int i=0;i<stringB.length();i++){
            letterFrequency[stringB.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(letterFrequency[i]>0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nConstraints:");
            System.out.println("• Input String A and String B must consist of lowercase English letters.\n");
            System.out.print("String A: ");
            String stringA = scanner.nextLine();
            System.out.print("String B: ");
            String stringB = scanner.nextLine();
            AnagramCheck anagramCheck = new AnagramCheck();
            Boolean result = anagramCheck.AnagramCheckFun(stringA, stringB);
            if(result){
                System.out.println("\nString B is AN ANAGRAM of String A");
            }else{
                System.out.println("\nString B is NOT AN ANAGRAM of String A");
            }
        }catch(Exception e){
            System.out.println("\nInput strings must consist of values from a to z only");
        }
    }
}
