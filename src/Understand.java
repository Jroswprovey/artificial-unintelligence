import java.lang.*;

public class Understand {

    public static String Find(String input, String lookingFor, int rangeStart, int rangeEnd) {
        Integer wordNum = null;

        String[] words = input.split(" ");

        StringBuilder sendback = new StringBuilder();

        for (int i = 0; i != words.length; i++) {
            if (words[i].equalsIgnoreCase(lookingFor)) {
                wordNum = i;
                break;
            }
        }


            for (int i = rangeStart; i != 0; i--) {
                if(words.length >= i) {
                    sendback.append(words[wordNum - i] + " ");
                }
            }

            for (int i = 0; i != rangeEnd + 1; i++) {
                if(words.length >= i) {
                    sendback.append(words[wordNum + i] + " ");
                }
            }

        return sendback.toString();

    }


    public static int Find(String input, String lookingFor){ //Sends what number the word is based off what word/char is being looked for in the string supplied

        Integer sendBack = null;

        String[] words = input.split(" ");

        for(int i=0; i!= words.length+1; i++){
            if(words[i].equalsIgnoreCase(lookingFor)){
                sendBack = i;

                break;
            }
        }
        return sendBack;
    }



    public static String Date(String input){

        StringBuilder sendBack = new StringBuilder();

        String[] words = input.split(" ");

       return sendBack.toString();
    }
}
