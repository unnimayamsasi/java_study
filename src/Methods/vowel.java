package Methods;

public class vowel {
    public static void main(String[] args) {
        char ch='e';
        boolean isVowel = isVowel(ch);
        if (isVowel){
            System.out.println("is vowel");
        }else {
            System.out.println("is not a vowel");
        }
    }

    public static boolean isVowel(char ch) {
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
