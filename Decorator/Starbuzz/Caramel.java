public class Caramel extends BeverageDecorator{
    public Caramel(Beverage b){
        super(b);
        cost = 0.10;
        description = "Caramel";
    }
}