import java.util.*;
import java.util.LinkedList; 
import java.util.Queue; 
/*Implementation of Generic Binary search tree using iterative methods
line10 - created generic BinarySearchTree class with argument Key and value
line11 - declared root Node of BST as private
line12,13,14,15 - created a class Node declared key val and the left and right subtree
line17,18,19  - created a constructer of class Node initialized key and value 
constructer is created mainly to initialize the values and esp. here to access the private files*/
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private Node root;     // root of BST
    private class Node {
        private Key key;            // sorted by key    
        private Value val;         
        private Node left, right;   // left and right subtrees
                
        public Node(Key key, Value val) {
            this.key = key;     
            this.val = val;   
        }
    }
    /*line24- constructer of class BinarySearchtree
    line25 - initailized the root Note as null*/
    public BinarySearchTree() {
        root = null;
    }
    /*line29 - create the isEmpty method to check whether the symbol table is empty or not
    line30 - if the symbol table is empty it will return true otherwise false since the data type is boolean */
    public boolean isEmpty(){
        return(root== null);

    }
    /*line35 - create method size
    line36 - it will call the size method by passing root */
    public int size() {
        return size(root);
    }
    //return size of tree )
    /*line42 - private class size() created receiving root as Node as which is called in public class size() 
    line 44,45- return zero if root itself is null
    line48 - create queue to store the node for easy traversal and count */
    private int size(Node x) 
    { 
        if (root == null) 
            return 0; 
          
        // Using level order Traversal. 
        Queue<Node> queue = new LinkedList<Node>(); 
        //enqueue root and declare and initailize size as 1
        queue.offer(root); 
        int size = 1; 
        /*if queue is not empty then
        line60 -  the poll() method returns null.when the queue is empty
        line63,64,65,66 - if left node is not null then size is incremented by by 1 and inserted left child in the queue
        line68,69,70,71 - if right node is not null then size is incremented by 1 and inserted right child in the queue
        line75 - else is returns size*/ 

        while (!queue.isEmpty()) 
        { 
            x = queue.poll();   
            if (x != null) 
            { 
                if (x.left != null) 
                { 
                    size++; 
                    queue.offer(x.left); 
                } 
                if (x.right != null) 
                {
                    size++; 
                    queue.offer(x.right); 
                } 
            } 
        }       
        return size; 
    } 
    /*it returns true if the given key is in the symbol table
    line 81- throws IllegalArgumentException if the key is null
    line 82- return true if the key is not null by checking in get method*/
    public boolean contains(Key key) {
        if(key==null) throw new IllegalArgumentException("argument to contain is empty");
        return get(key) != null;
    }
    /*put method will insert the key and value in the symbol table
    line 93- create new node z
    line 95,96- if root is null assign root as node z and return
    line 98- declare and initialize parent node as null and assign Node x to root 
    line 99-108 -  while x is not null assign x as parent node and compare the keys 
    if the key is less than the root insert x node in left 
    if the key is greater than the root insert x node in right 
    else two values are same replace with new value*/
    public void put(Key key, Value val) {
        Node z = new Node(key, val);
        if (root == null) {
            root = z;
            return;
        }
        Node parent = null, x = root;
        while (x != null) {
            parent = x;
            int cmp = key.compareTo(x.key);
            if (cmp < 0) 
                x = x.left;
            else if (cmp > 0) 
                x = x.right;
            else {
                x.val = val;
                return;
            }  
        }
        int res = key.compareTo(parent.key); //compare given key and and parent key
        if (res < 0) parent.left  = z;//if given key is less than parent key then left node becomes root
        else         parent.right = z;//else right node becomes root
    }
    /*get() will return given key from the symbol table
    line125 - assign node x as root
    line126 - if root or node x is null throws exception
    line 127-136 - while x is not null  them it compares given key with the x nodes key 
    if given key is less than root value goes to left subtree of the node
    if given key is graeter than root value goes to right subtree of the node
    if two keys are equal then returns the root value;
    */

    public Value get(Key key) {
        Node x = root;
        if (x == null) throw new IllegalArgumentException("get() is null");
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) 
                x = x.left;
            else if (cmp > 0) 
                x = x.right;
            else 
                return x.val;
        }
        return null;
    }
    /*min() will returns the minimum value from the symbol table
    line142 - if symbol table is empty throws the exception
    */
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("called min() with empty symbol table");
       
        return (min(root).key);
    } 
    /*create temp node and it will traversal through the left nodes until 
    it becomes null and its return the key of last node*/

    private Node min(Node x) { 
            Node temp =x;;

            while(temp.left != null){
                temp = temp.left;
            }
            return temp;
    } 
    /*floor() will return the key which is smaller than the given key
    line164 - throws excetion if the key is null
    line165 - throws NoSuchElementException if the symbol table is empty
    line166 - declared node x and floor method id called 
    line167 - if x null it returns null
    line 170- else returns value of x.*/
    public Key floor(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to floor() is null");
        if (isEmpty()) throw new NoSuchElementException("called floor() with empty symbol table");
        Node x = floor(root, key);
        if (x == null) 
            return null;
        else 
            return x.key;
    } 
    /*node small is assigned as null 
    while x  is not null compare the given key and the key of x 
    if the given key is equals to the key of x then it will x
    if the given key is greater than key of x the x becomes small and x will move to right subtree 
    else x will move to left subtree */

    private Node floor(Node x, Key key) {
        Node small = null;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp == 0) return x;
            if (cmp > 0) {
                small = x;
                x = x.right;
            } else {
                x = x.left;
            }
        }
        return small;
    } 
    /*select() will give the key of rank k
    line 198,199- of size is less than  0 or greater than size it will trhow exception
    line201 - declared node x and select method is called 
    line 202 - returns key of x*/
    public Key select(int k) {
       
        if (k < 0 || k >= size()) {
            throw new IllegalArgumentException("called select() with invalid argument: " + k);
        }
        Node x = select(root, k);
        return x.key;
    }

    // Return key of rank k.
    /*line216 - declared count
    line217 - created new stack 
    line218 - create curr node and initialize it as root
    line219-233 - while stack is not empty or curr node is not null then
    if curr node is not null push the curr node in the stack amd move curr to left
    else pop the curr node and increment the size and if curr node is equal to k then
     break the statment and move curr node to right 
    else return the curr node;
    */
    private Node select(Node x, int k) {
        int count = -1; //count is initailized as -1 since the rank starts from 0
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while (!stack.empty() || curr != null)
        {
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                curr = stack.pop();
                count++;
                if(count == k)
                    break;
                curr = curr.right;
            }
        }
        return curr;
    }
    /*create an empty stack
    start from root node (set current node to root node)
     if current node is null and stack is also empty, we're done
    if current node is not null, push it to the stack (defer it)
    and move to its left child
    else if current node is null, we pop an element from stack,
    print it and finally set current node to its right child*/
    public void keys() { 
    
    Stack<Node> stack = new Stack<Node>();
 
    
    Node curr = root;
 
   
        while (!stack.empty() || curr != null)
        {
            
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                
                curr = stack.pop();
                System.out.print(curr.key + " ");
     
                curr = curr.right;
            }
        }
    }
}

    