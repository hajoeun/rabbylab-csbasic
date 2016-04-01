package rabbylab.csbasic.coin.animalshelter;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	private class Node {
		private String name;
		private int id;
		//id 0 = Dog, id 1 = Cat
		private Node next;
		public Node(String animal, int num){
			this.name = animal;
			this.id = num;
			this.next = null;
		}
	}
	
	//둥물 넣기
	public void enqueue(String animal, int num){
		Node newNode = new Node(animal, num);
		if(size == 0){
			tail = head = newNode;
		} else{
			head.next = newNode;
			head = newNode;
		}
		size++;
	}
	
	public void dequeueAny(){
		System.out.println(tail.name);
		tail = tail.next;
		size--;
		return;
	}
	
	public void dequeueDog(){
		Node chaser_1 = tail;
		Node chaser_2 = tail;
		while(chaser_1.id != 0 && chaser_1.next != null){
			chaser_2 = chaser_1;
			chaser_1 = chaser_2.next;
		}
		//개가 첫번째 노드에 있었던 겨우
		if(chaser_1 == tail){
			dequeueAny();
		//개가 있었던 경우
		} else if(chaser_1.id == 0){
			System.out.println(chaser_1.name + ", Bye!\n");
			chaser_2.next = chaser_1.next;
		//개가 없는 경우 
		} else{
			System.out.println("No Dog...");
			return;
		}
		size--;
		return;
	}
	
	public void dequeueCat(){
		Node chaser_1 = tail;
		Node chaser_2 = tail;
		while(chaser_1.id != 1 && chaser_1.next != null){
			chaser_2 = chaser_1;
			chaser_1 = chaser_2.next;
		}
		if(chaser_1 == tail){
			dequeueAny();
		} else if(chaser_1.id == 1){
			System.out.println(chaser_1.name + ", Bye!\n");
			chaser_2.next = chaser_1.next;
		} else{
			System.out.println("No Cat...");
		}
		size--;
		return;
	}
	
	public String toString(){
		if(tail == null){
			return "[-No Animal-]";
		}
		Node temp = tail;
		String str = "=== Animal Shelter ===\n|| ";
		
		while(temp.next != null){
			str += temp.name;
			if(temp.id == 1){
				str += "(Cat), ";
			} else {
				str += "(Dog), ";
			}
			temp = temp.next;
		}
		
		str += temp.name;
		if(temp.id == 1){
			str += "(Cat)";
		} else {
			str += "(Dog)";
		}
		
		return str + " ||";
	}
}
