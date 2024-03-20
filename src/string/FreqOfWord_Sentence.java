package string;

public class FreqOfWord_Sentence {
    public static void main(String[] args) {
        String sentence="Hello world hello World";
        String word="hello";
        int frequency=(sentence.toLowerCase().split(word.toLowerCase(),-1).length-1);
        System.out.println(frequency);
    }
}
