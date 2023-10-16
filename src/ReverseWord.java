 import java.util.Scanner;

public class ReverseWord {
    public static String reverseEachWord(String word) {
        if (word == null || word.isEmpty()){
            return word;
        }
        StringBuilder result = new StringBuilder();
        String[] arr = word.split(" ");

        for (int i = 0; i < arr.length; i++){
            result.append(reverse(arr[i]));
            if (i != arr.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String reverse(String word){

        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user input
        System.out.println("Input a sentence: ");
        String word = scanner.nextLine();
        String reverse = reverseEachWord(word);

        System.out.println("Your sentence in reverse is: " + reverse);


    }
}

