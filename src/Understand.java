import java.lang.*;

public class Understand {

    public static String Find(String input, String lookingFor){

        String[] words = input.split(" ");

        for(int i=0; i != words.length ; i++){

            if(words[i].equalsIgnoreCase(lookingFor)){
                System.out.println(lookingFor+" mentioned, printing sentence: ");

                for(int y= i -5; y != i+5; y++){
                    try {
                        System.out.print(words[y] + " " );
                    } catch (Exception e){}

                }
                System.out.print("\n\n");
            }

        }
        return null;
    }

    public static String Birth(String input){

        StringBuilder sendBack = new StringBuilder();

        String[] words = input.split(" ");


        for(int i=0; i != words.length ; i++){
            if(words[i].equalsIgnoreCase("birthday")){
                for(int y= i -5; y != i+5; y++){
                    try {
                        if (words[y].equalsIgnoreCase("is")) {

                            for (int x = 0; x != 5; x++) {
                                sendBack.append(words[x+y]+ " ");
                            }
                            sendBack.append(": ");
                        }
                    }catch (Exception e){ System.out.println("Sentence Ended");}
                }
                System.out.print("\n\n");
            } else if (words[i].equalsIgnoreCase("Born")){
                //to be added to eventually
            }
        }
        return sendBack.toString();
    }
}
