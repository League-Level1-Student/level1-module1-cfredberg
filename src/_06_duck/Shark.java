package _06_duck;

public class Shark {
	int fishEaten = 0;
	String favoriteFish = "";
	
	Shark(int fishEaten, String favoritefish) {
        this.fishEaten = fishEaten;
        this.favoriteFish = favoriteFish;
	}
	
	void Eat() {
		System.out.println("Munch");
	}
	
	void Swim() {
		System.out.println("I'm swimming!");
	}
}
