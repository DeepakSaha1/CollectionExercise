// Write a method that takes a string and print the number of
// occurrence of each character characters in the string.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringCharOccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        char s[] = sc.nextLine().toLowerCase().toCharArray();

        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<s.length; i++){
            int count = 0;
            for(int j=0; j<s.length; j++){
                if (s[i] == s[j]){
                    ++count;
                }
            }
            freq.put(s[i], count);
        }
        System.out.println("Frequency of each character in the string is: ");
        for(char chars: freq.keySet()){
            System.out.println(chars + ": " + freq.get(chars));
        }
    }
}
