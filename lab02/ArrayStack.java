public class ArrayStack{

	int size;
	int top;
	int[] arr;

	public ArrayStack(int n){
		size=n;
		top = -1;
		arr = new int[n];

	}
	// int[] arr = new int[n];
	//size()
	public int size(){
		return size();
	}
	//top()
	public int top(){
		if(size==0){
			return 0;
		}
		return top;
	}
	//push()
	public void push(int e) {
		if (size==0){
			System.out.println("null");
		
		}
 		else{
 			arr[top+1]=e;
 			top=top+1;
 			//System.out.println("push " +e);
 		}
 		size=size+1;
	}
	//pop()
	public int pop () 
	{   
	    if(size==0)   
	    {  
	    	return 0;  
	         
	    }  
	    else  
	    {  
	        top=top-1;
	        size=size-1;
	    	return arr[top+1]; 
	       
	    } 
	}
	//isempty
	public boolean isEmpty(){
		if (size==0){
			return true;
		}
		return false;
		
	}  
	
}

