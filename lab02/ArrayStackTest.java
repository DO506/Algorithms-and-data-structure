public class ArrayStackTest{
	public static void main(String[] args) {
	
		
		ArrayStack obj1 = new ArrayStack(5);
		obj1.push(6);
		obj1.push(2);
		obj1.push(3);
		obj1.pop();
		assert(obj1.size()==5);
		assert(obj1.pop() ==2);
		assert(obj1.isEmpty() ==false);
	

		System.out.println("All test pass");
	}

}
