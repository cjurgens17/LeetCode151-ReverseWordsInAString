import java.util.ArrayList;
import java.util.List;

public class LC151 {

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    //151. Reverse Words in a String
    //Medium
    //Given an input string s, reverse the order of the words.
    //
    //A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
    //
    //Return a string of the words in reverse order concatenated by a single space.
    //
    //Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "the sky is blue"
    //Output: "blue is sky the"
    //Example 2:
    //
    //Input: s = "  hello world  "
    //Output: "world hello"
    //Explanation: Your reversed string should not contain leading or trailing spaces.
    //Example 3:
    //
    //Input: s = "a good   example"
    //Output: "example good a"
    //Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
    //
    //
    //Constraints:
    //
    //1 <= s.length <= 104
    //s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    //There is at least one word in s.

    public static String reverseWords(String s){
        List<List<Character>> charList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = s.length()-1;i>=0;i--){
            List<Character> temp = new ArrayList<>();

            if(s.charAt(i)==' ') continue;

            while(s.charAt(i) != ' '){
                temp.add(s.charAt(i));
                i--;
                if(i<0) break;
            }
            charList.add(temp);
        }

        for(List<Character> word: charList){
            StringBuilder temp = new StringBuilder();
            for(char ch: word){
                temp.append(ch);
            }
            temp.reverse();
            sb.append(temp);
            sb.append(" ");
        }

        return sb.substring(0,sb.length()-1);
    }
}
