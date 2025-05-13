public abstract class BeverageDecorator extends Beverage{
    Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    public Double getCost(){
        return beverage.getCost() + cost;
    }
    public String getDescription(){
        return beverage.getDescription() + ", " + description;
    }
}