package ducks;

public class Ducks{
	public static void main(String[] args){
		System.out.println("Hello World!");
		Duck superDuck = new SuperDuck();
		superDuck.display();
		superDuck.performQuack();
		superDuck.performFly();

		//change flight behvior dynamically
		System.out.println("Oh no... what's happening to me?");
		superDuck.setFlyBehavior(new Fly());
		superDuck.performFly();
	}
}

//notes on java:
//package files together by having the same package name on top of each file
//compile all files using javac *.java -d . 
//the -d option allows us to put all our class files in one dir
//to run, run java ducks.Duck (PackageName.ClassContainingMain)
