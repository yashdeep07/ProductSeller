import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public static void main(String args[]){
        /*Map< String, ArrayList< Double >> map1 = new HashMap<String, ArrayList< Double >>();
        Map <Double, Book> map2  = new Map <Double, Book>();*/

        DataInitializer data = new DataInitializer(Globals.bookTitleMap, Globals.isbnMap ,Globals.isbnList );
        User usr = new User("yashdeep");

        // Interface for app
        Scanner in  = new Scanner(System.in);
        String userInput = "0";
        double isbn ;
        while(userInput.equals("0") ){
            System.out.print("To Search a Book type '1'\nTo Order directly using ISBN type '2' \nTo Add a Book type '3' \nTo Show All Books type '4'\n");
            userInput = in.nextLine();

            switch (userInput){
                case "1" :
                    System.out.println("Type Book Title");
                    userInput = in.nextLine();
                    usr.searchBook(userInput);
                    System.out.print("To order one of these type that book's ISBN \nElse type '0'\n");
                    userInput = in.nextLine();
                    if(userInput.equals("0")) break;
                    isbn = Double.parseDouble(userInput);
                    usr.orderBook(isbn);
                    break;

                case "2" :
                    System.out.println("Type ISBN number");
                    isbn = Double.parseDouble(in.nextLine());
                    usr.orderBook(isbn);
                    break;

                case "3" :
                    usr.addBook();
                    break;

                case "4" :
                    System.out.println("show books!");
                    break;

                case "5" :
                    //usr.sortByField(Globals.isbnList);
            }

            System.out.println("To Continue type '0'");
            userInput = in.nextLine();


        }



    }
}
