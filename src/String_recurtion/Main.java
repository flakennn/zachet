package String_recurtion;

public class Main {
    public static void find(char[] text, char[] pattern, int pos)
    {
        if(pos <= text.length - pattern.length) {
            int k = 0;
            for (int i = 0; i < pattern.length; i++) {
                if (text[pos + i] == pattern[i]) k++;
            }
            if (k == pattern.length){
                System.out.println("true");
                return;
            }
            find(text, pattern, ++pos);
        }
        else System.out.println("false");
    }

    public static void main(String[] args) {
        String str = "testString";
        char[] charArray = str.toCharArray();
        String str1 = "east";
        char[] charArray1 = str1.toCharArray();
        find(charArray,charArray1,0);
    }
}
