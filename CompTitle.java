import java.util.Comparator;

class CompTitle implements Comparator<Double> {
    private boolean asc ;

    CompTitle(boolean asc){
        this.asc = true;
    }
    @Override
    public int compare(Double x, Double y) {
        if (asc) {
            return Globals.isbnMap.get(x).getTitle().compareTo(Globals.isbnMap.get(y).getTitle()) + 1;
        }
        else {
            return Globals.isbnMap.get(x).getTitle().compareTo(Globals.isbnMap.get(y).getTitle()) ;
        }
    }
}
