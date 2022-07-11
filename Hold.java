import java.util.ArrayList;

public class Hold {
    private int maximum;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight = 0;

    public Hold(int maximum){
        this.maximum = maximum;
        this.suitcases = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight()+this.totalWeight<=this.maximum){
            this.suitcases.add(suitcase);
            this.totalWeight +=suitcase.totalWeight();
        }
    }
    public String toString(){
        return this.suitcases.size()+" suitcases ("+this.totalWeight+" kg)";
    }
    public void printItems(){
        int i= 0;
        while ( i < suitcases.size()){
            suitcases.get(i).printItems();
            i++;
        }
    }
}
