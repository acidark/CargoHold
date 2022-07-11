import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maximum;
    public Suitcase(int maximum){
        this.suitcase = new ArrayList<>();
        this.maximum = maximum;
    } 
    public void addItem(Item item){
        
        //weight += item.getWeigth();
        int i = 0;
        int weight = 0;
        this.suitcase.add(item);
        while (i < this.suitcase.size()){
            weight += this.suitcase.get(i).getWeight();
            i++;
        }
        if (weight > maximum){
            this.suitcase.remove(item);
        }
        
    }

    /*public printItems(){
        int i = 0;
        while (i < this.suitcase.size()){
            System.out.println(this.suitcase.get(i).getName());
            i++;
        }
    }*/

    public String toString(){
        int weigth =0;
        if (this.suitcase.isEmpty()){
            return "no items ("+weigth+" kg)";
        }
        if (this.suitcase.size() == 1){
            return "1 item ("+this.suitcase.get(0).getWeight()+" kg)";
        }
        for (Item i  : this.suitcase){
            weigth += i.getWeight();
        }
        return suitcase.size()+" items ("+weigth+" kg)";
    }
    public void printItems(){
        int i =0;
        //String items = "";
        //System.out.println("This suitcase contains the following items:");
        while(i<this.suitcase.size()){
            //System.out.println(this.suitcase.get(i).getName());
            System.out.println(this.suitcase.get(i));
            i++;
        }
        //System.out.println("This suitcase contains the following items: "+items);
    }
    public int totalWeight(){
        int i=0;
        int totalWeight=0;
        while(i < this.suitcase.size()){
            totalWeight+=this.suitcase.get(i).getWeight();
            i++;
        }
        return totalWeight;
    }
    public Item heaviestItem(){
        if (this.suitcase.isEmpty()){
            return null;
        }
        int i = 0;
        Item heaviestItem = this.suitcase.get(i);
        while(i<this.suitcase.size()){
            if(this.suitcase.get(i).getWeight() > heaviestItem.getWeight()){
                heaviestItem = this.suitcase.get(i);
                //i++;
            }
            i++;          
        }
        return heaviestItem;
    }
}
