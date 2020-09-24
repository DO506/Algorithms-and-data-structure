public class linkedListTest{
	public static void main(String[] args) {
		linkedList obj = new linkedList();
		obj.addFirst(1);
		obj.addLast(2);
		obj.addLast(3);

		assert(obj.isEmpty() == false);
		assert(obj.size()==3);
		assert(obj.first()==1);
		assert(obj.last()==3);
		assert(obj.removeFirst()==1);
		assert(obj.size()==2);
		assert(obj.first()==2);
		System.out.println("All test case passed");
	}
}














































































































