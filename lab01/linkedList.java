public class linkedList{
	Node head;
	Node tail;
	int size;

	public linkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	//size function
	//this function will give the size of the linkedlist
	public int size(){
		return size;
	}
	//isempty function will return turn if the size is 0 and it will return false if there is element in the linkedlist
	public boolean isEmpty(){
		//
		if(size==0){
			return true;
		}
		return false;
	}
	//First() function will give the first element of the linkedlist
	public int first(){
		return head.getElement();

	}
	//First() function will give the first element of the linkedlist
	public int last(){
		return tail.getElement();
	}
	//addFirst() function will add node at first of the linkedlist
	public void addFirst(int n){
		//create newest node to add first
		Node newest = new Node(n,null);

		if (size==0){
			head = newest;
			tail= newest;
		}
		else{
			newest.setNext(head);
			head=newest;
		}
		size = size+1;
	}
	//addLast() function will add the node at last of the linkedlist
	public void addLast(int n){
		//create newest node to add last
		Node newest = new Node(n,null);

		if (size==0){
			head = newest;
			tail= newest;
		}
		else{
			tail.setNext(newest);
			tail=newest;
		}
		size = size+1;
	}
	//removeFirst() is to remove node from the first of the linkedlist and will display the deleted element
	public int removeFirst(){
		//this is to capture the deleted element before we remove
		int deletedElement = head.getElement();
		if(size==0){
			return 0;
		}
		else{
			head=head.getNext();
			size = size-1;
		}
		return deletedElement;
	}

}
class Node{
	private int element;
	private Node next;
	//Constructor
	public Node(int element,Node next){
		this.element=element;
		this.next=next;
	}
	//getElement is to get the element from privatization of the element
	public int getElement(){
		return element;
	}
	//getNext is to get the address from privatization of next
	public Node getNext(){
		return next;
	}
	//setElement 
	public void setElement(int n){
		element = n;
	}
	//setNext
	public void setNext(Node n){
		next = n;
	}

}