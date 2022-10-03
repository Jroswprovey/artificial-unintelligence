import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the text to search: ");
        String searchText = input.nextLine();

        System.out.println("Please type in a keyword you are looking for: ");
        String keyword = input.nextLine();


       //System.out.println(Understand.Birth(searchText));
        //Understand.Find(searchText,keyword);
       System.out.println(Understand.Find(searchText,keyword,10,10));



    }
}
