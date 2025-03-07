
public abstract Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	// constructor
	public Duck(){
	}

	// abstract to be implemented in subclass
	public abstract void display();

	// functions delegates to behavior interfaces
	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}
}
