import java.util.*;


public class DataInitializer {

    public DataInitializer(Map < String, ArrayList < Double >> map1 ,Map < Double, Book > map2,ArrayList<Double> mlist) {
        this.initializeTitleMap(map1);
        this.intializeDataset(map2);
        this.initializeList(mlist);
    }

    private void initializeTitleMap (Map < String, ArrayList < Double >> map1){
        map1.put("Quichotte", new ArrayList<Double>(Arrays.asList((double) 123456789, (double) 123456788)));
        map1.put("The Testaments", new ArrayList<Double>(Arrays.asList((double) 123456779, (double) 123456778, (double) 123456777)));
        map1.put("The Anarchy", new ArrayList<Double>(Arrays.asList((double) 123456769, (double) 123456768)));
        map1.put("City Of Girls", new ArrayList<Double>(Arrays.asList((double) 123456759)));
        map1.put("Red Wolf", new ArrayList<Double>(Arrays.asList((double) 123456749)));
        map1.put("Rules for Visiting: A Novel", new ArrayList<Double>(Arrays.asList((double) 123456739)));
    }

    private void intializeDataset (Map < Double, Book > map2){
        map2.put((double) 123456789, new Book("Quichotte", "Salman Rushdie", 123456789, "JKL", "English", 1996, "PAPERBACK", 999, 100));
        map2.put((double) 123456788, new Book("Quichotte", "Salman Rushdie", 123456788, "JKL", "English", 1997, "HARDBOUND", 999, 100));
        map2.put((double) 123456779, new Book("The Testaments", "Margaret", 123456779, "KL", "English", 1996, "PAPERBACK", 999, 100));
        map2.put((double) 123456778, new Book("The Testaments", "Margaret", 123456778, "KL", "English", 1997, "DIGITAL", 999.99, 100));
        map2.put((double) 123456777, new Book("The Testaments", "Margaret", 123456777, "KL", "English", 1998, "HARDBOUND", 999, 100));
        map2.put((double) 123456769, new Book("The Anarchy", "William Dalrymple", 123456769, "KL", "English", 1996, "DIGITAL", 999, 100));
        map2.put((double) 123456768, new Book("The Anarchy", "William Dalrymple", 123456768, "KL", "English", 1996, "HARDBOUND", 999, 100));
        map2.put((double) 123456759, new Book("City Of Girls", "Elizabeth Gilbert", 123456759, "JKL", "English", 1996, "HARDBOUND", 999, 100));
        map2.put((double) 123456749, new Book("Red Wolf", "Marlon James", 123456749, "JKL", "English", 1996, "HARDBOUND", 999, 100));
        map2.put((double) 123456739, new Book("Rules for Visiting: A Novel", "Jessica Francis Kane", 123456739, "JKL", "English", 1996, "HARDBOUND", 999, 100));
            /*map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));
            map2.put("", new Book(ABC,DEF,123456789,JKL,"English",1996,STU,999));*/
    }

    private void initializeList(ArrayList<Double> mlist){
        mlist.add((double) 123456789);
        mlist.add((double) 123456788);
        mlist.add((double) 123456779);
        mlist.add((double) 123456778);
        mlist.add((double) 123456777);
        mlist.add((double) 123456769);
        mlist.add((double) 123456768);
        mlist.add((double) 123456759);
        mlist.add((double) 123456749);
        mlist.add((double) 123456739);

    }
}
