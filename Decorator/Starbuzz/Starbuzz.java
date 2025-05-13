public class Starbuzz{
    public static void main(String[] args){
        // let's make a Caramel Frapp with whipped cream:
        Beverage b = new Frappe();
        b = new Caramel(b);
        b = new Whip(b);
        System.out.println(b.getDescription());
        System.out.println(b.getCost());
    }
}