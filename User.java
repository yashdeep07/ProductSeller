import java.util.*;

public class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    /*
        To Get name of the User
    */
    public String getName() {
        return this.name;
    }

    /*
        To Add Book in the database
    */
    public void addBook() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type Title");
        String title = in.nextLine();
        System.out.println("Type Author");
        String author = in.nextLine();
        System.out.println("Type ISBN");
        double isbn = in.nextDouble();
        Book b = new Book(title, author, isbn);
        Globals.isbnMap.put(isbn, b);
        if (Globals.bookTitleMap.containsKey(title)) {
            Globals.bookTitleMap.get(title).add(isbn);

        } else {
            Globals.bookTitleMap.put(title, new ArrayList<Double>());
            Globals.bookTitleMap.get(title).add(isbn);
        }
        

        System.out.println("Book has been added to the Database");
    }

    public void searchBook(String userInput) {
        if (Globals.bookTitleMap.containsKey(userInput)) {
            ArrayList<Double> arrList = Globals.bookTitleMap.get(userInput);
            for (int i = 0; i < arrList.size(); i++) {
                Book b = Globals.isbnMap.get(arrList.get(i));
                b.showInfo();
            }
        } else {
            System.out.println("Book is not Available");
            return;
        }
    }


    public void orderBook(double isbn){
        if(Globals.isbnMap.containsKey(isbn)){
            Book b = Globals.isbnMap.get(isbn);
            if(b.count <= 0){
                System.out.println("Book is outof stock!");
            }
            else{
                b.count -= 1;
                System.out.println("Order has been Placed!");
            }
        }
        else{
            System.out.println("Book with this ISBN is not present!");
        }
    }

    public void showAllBooks(Map<Double,Book> map){
        Iterator<Map.Entry<Double, Book>> itr = map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Double, Book> entry = itr.next();
            System.out.println("Key = " + entry.getKey());
            entry.getValue().showInfo();
        }
    }
/*
    public static void sortByField(ArrayList<Double> arr) {
        System.out.println("Ye field to h hi nahi haha!!");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        String field = userInput;
        userInput = in.nextLine();
        boolean asc;
        if(userInput.equals("a")){ asc = true;}
        else {asc = false;}


        TreeSet<Double> ts1 ;

        if(field.equals("Book Title")) ts1 = new TreeSet<Double>(new CompTitle(asc));
        else if(field.equals("Author")){
            ts1 = new TreeSet<Double>(new CompAuthor(asc));
        }
        else{
            ts1 = new TreeSet<Double>(new CompPubYear(asc));
        }

        for(Double isbn : arr){
            ts1.add(isbn);
        }
        
        Book.showBooks(ts1);
    }



    public void showAllBooks(){
        int size = Globals.isbnMap.size();

    }
*/


}

