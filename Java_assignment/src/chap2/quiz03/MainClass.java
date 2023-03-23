package chap2.quiz03;

public class MainClass {

	public static void main(String[] args) {
		
		Product computer = new Computer();
		Product radio = new Radio();
		Product tv = new Tv();
		
		MyCart cart = new MyCart(5000);
		cart.buy(computer);
		cart.buy(tv);
		cart.buy(computer);
		cart.buy(computer);
		cart.buy(radio);
		
		

	}

}
