public class ArrayQueueTest{
	public static void main(String[] args) {
	
		
		ArrayQueue obj2 = new ArrayQueue(8);
		obj2.enqueue(6);
		obj2.enqueue(2);
		obj2.enqueue(3);
				
		System.out.println(obj2.isEmpty());
		System.out.println(obj2.len());
		System.out.println(obj2.first());
		System.out.println(obj2.dequeue());
		System.out.println(obj2.len());
		System.out.println("All test pass");
	}

}
