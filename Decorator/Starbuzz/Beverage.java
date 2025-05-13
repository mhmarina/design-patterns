public abstract class Beverage{
    protected Double cost;
    protected String description;

    public String getDescription(){
        return description;
    };
    public Double getCost(){
        return cost;
    };
    public void setCost(Double c){
        cost = c;
    }
}