import java.util.Comparator;

class CompPubYear implements Comparator<Double> {
    private boolean asc ;
    CompPubYear(boolean asc){
        this.asc = true;
    }
    @Override
    public int compare(Double x, Double y) {
        if (asc) {
            if(Globals.isbnMap.get(x).getPublishedYear() >= Globals.isbnMap.get(y).getPublishedYear())
                return 1;
            else return 0;
        } else {
            if(Globals.isbnMap.get(x).getPublishedYear() < Globals.isbnMap.get(y).getPublishedYear())
                return 0;
            else
                return 1;
        }
    }
}