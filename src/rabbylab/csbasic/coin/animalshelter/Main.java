package rabbylab.csbasic.coin.animalshelter;

public class Main {

	public static void main(String[] args) {
		LinkedList animals = new LinkedList();
		
		animals.enqueue("±Í¿è",1);
		animals.enqueue("°³¶Ë",0);
		animals.enqueue("È²¹¦",1);
		animals.enqueue("¹é±¸",0);
		
		System.out.println(animals);
		
		animals.dequeueDog();
		
		System.out.println(animals);
	}

}
