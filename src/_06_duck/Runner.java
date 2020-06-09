package _06_duck;

public class Runner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		daffy.waddle();
		
		Shark shark = new Shark(1000000, "The orange one");
		shark.Swim();
		shark.Eat();
	}
}
