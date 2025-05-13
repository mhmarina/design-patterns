package ducks;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	// abstract to be implemented in subclass
	public abstract void display();

	// functions delegates to behavior interfaces
	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}

	// dynamically set fly behavior in runtime
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior = fb;
	}
}
