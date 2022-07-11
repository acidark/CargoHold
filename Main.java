
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!

        Item vodka = new Item("vodka", 10);
        Suitcase paris = new Suitcase(11);
        paris.addItem(vodka);
        paris.addItem(new Item("jabon", 1));
        System.out.println(paris);

        paris.addItem(new Item("calzon", 2));
        System.out.println(paris);
        paris.printItems();
        System.out.println(vodka);
        System.out.println("total is:");
        System.out.println(paris.totalWeight());

        System.out.println("Heaviest item :"+paris.heaviestItem());
        Suitcase madrid = new Suitcase(20);
        madrid.addItem(vodka);
        madrid.addItem(vodka);
        Hold europa = new Hold(20);
        europa.addSuitcase(paris);
        System.out.println(europa);
        europa.printItems();

    }

}
