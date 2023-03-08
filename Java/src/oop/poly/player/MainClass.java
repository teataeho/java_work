package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("타락파워전사");
		Mage m1 = new Mage("법사야");
		Hunter h1 = new Hunter("번개의신");
		Warrior w2 = new Warrior("전짱맨");
		
		w1.rush(w2);
		w2.rush(h1);
		w1.rush(m1);
		w2.rush(w1);
		w2.rush(w2);
		w1.rush(m1);
	}

}
