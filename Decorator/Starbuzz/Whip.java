public class Whip extends BeverageDecorator{
    public Whip(Beverage b){
        super(b);
        cost = 0.20;
        description = "Whip";
    }
}