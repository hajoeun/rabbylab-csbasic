package rabbylab.csbasic.coin.animalshelter;

public class Main {

	public static void main(String[] args) {
		LinkedList animals = new LinkedList();
		
		animals.enqueue("�Ϳ�",1);
		animals.enqueue("����",0);
		animals.enqueue("Ȳ��",1);
		animals.enqueue("�鱸",0);
		
		System.out.println(animals);
		
		animals.dequeueDog();
		
		System.out.println(animals);
	}

}
