import java.util.*;
import java.util.LinkedList; 
import java.util.Queue; 
/*Implementation of Generic Binary search tree using iterative methods
line09 - created generic BinarySearchTree class with argument Key and value
line10 - declared root Node of BST as private
line11,12,13,14 - created a class Node declared key val and the left and right subtree
line  - created a constructer of class Node initialized key and value*/
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
    public BinarySearchTree() {
        root = null;
    }
    public boolean isEmpty(){
        return(root== null);

    }
    public int size() {
        return size(root);
    }
    //return size of tree (linear time operation)
   private int size(Node x) 
    { 
        if (root == null) 
            return 0; 
          
        // Using level order Traversal. 
        Queue<Node> queue = new LinkedList<Node>(); 
        queue.offer(root); 
          
        int size = 1;  
        while (!queue.isEmpty()) 
        { 
            x = queue.poll(); 
      
            // when the queue is empty: 
            // the poll() method returns null. 
            if (x != null) 
            { 
                if (x.left != null) 
                { 
                    // Increment count 
                    size++; 
                      
                    // Enqueue left child  
                    queue.offer(x.left); 
                } 
                if (x.right != null) 
                { 
                    // Increment count 
                    size++; 
                      
                    // Enqueue left child  
                    queue.offer(x.right); 
                } 
            } 
        }       
        return size; 
    } 
    // is the given key in the symbol table?
    public boolean contains(Key key) {
        if(key==null) throw new IllegalArgumentException("argument to contain is empty");
        return get(key) != null;
    }
    // is the given key in the symbol table?
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
                x = x.ripublic class BinarySearchTree<Key extends Comparable<Key>, Value> ght;
            else {
                x.val = val;
                return;
            }  
        }
        int res = key.compareTo(parent.key);
        if (res < 0) parent.left  = z;
        else         parent.right = z;
    }

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
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("called min() with empty symbol table");
       
        return (min(root).key);
    } 

    private Node min(Node x) { 
            Node temp =x;;

            while(temp.left != null){
                temp = temp.left;
            }
            return temp;
    } 

    
    public Key floor(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to floor() is null");
        if (isEmpty()) throw new NoSuchElementException("called floor() with empty symbol table");
        Node x = floor(root, key);
        if (x == null) 
            return null;
        else 
            return x.key;
    } 

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
    public Key select(int k) {
       
        if (k < 0 || k >= size()) {
            throw new IllegalArgumentException("called select() with invalid argument: " + k);
        }
        Node x = select(root, k);
        return x.key;
    }

    // Return key of rank k. 
    private Node select(Node x, int k) {
        int count = -1;
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
    
    public void keys() { 
    // create an empty stack
    Stack<Node> stack = new Stack<Node>();
 
    // start from root node (set current node to root node)
    Node curr = root;
 
    // if current node is null and stack is also empty, we're done
        while (!stack.empty() || curr != null)
        {
            // if current node is not null, push it to the stack (defer it)
            // and move to its left child
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                // else if current node is null, we pop an element from stack,
                // print it and finally set current node to its right child
                curr = stack.pop();
                System.out.print(curr.key + " ");
     
                curr = curr.right;
            }
        }
    }
}

    