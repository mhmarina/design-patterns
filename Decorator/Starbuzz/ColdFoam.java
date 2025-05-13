public class ColdFoam extends BeverageDecorator{
    public ColdFoam(Beverage b){
        super(b);
        cost = 0.15;
        description = "Cold Foam";
    }
}