package ducks;

public class SuperDuck extends Duck{
	public SuperDuck(){
		flyBehavior = new FlyRockets();
		quackBehavior = new Quack();
	}

	//@override
	public void display(){
		System.out.println("Woo I'm a super cool jetpack duck");
	}
}
