import java.util.Comparator;

class CompAuthor implements Comparator<Double> {
    private boolean asc ;

    CompAuthor(boolean asc){
        this.asc = true;
    }
    @Override
    public int compare(Double x, Double y) {
        if (asc) {
            return (Globals.isbnMap.get(x).getAuthor().compareTo(Globals.isbnMap.get(y).getAuthor()));
        } else {
            return Globals.isbnMap.get(y).getAuthor().compareTo(Globals.isbnMap.get(x).getAuthor());
        }
    }
}