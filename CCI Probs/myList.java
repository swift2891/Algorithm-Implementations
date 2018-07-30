class Node<T>{
	T data;
	Node<T> next;
	public Node(T val){
		data = val;
	}
}

class SinglyLinked<T>{
	Node<T> root;
	public SinglyLinked(T val){
		root = new Node<T>(val);
	}
	
	public void addNode(T val){
		Node<T> endNode = this.root;
		while(endNode.next != null){ 
			endNode = endNode.next;
		}
		endNode.next = new Node<T>(val);
	}
	public void deleteNode(T val){
		
	}
	public void iterateNodes(){
		Node curr = this.root;	
		System.out.println("List of Elements:");
		while(curr!=null){
			System.out.println(curr.data);
			curr = curr.next;
		}	
	}

	public int findNode(T val){
		return 0;
	}
	
}

public class myList{		
	
	public static void main(String[] args){

		SinglyLinked<Character> list = new SinglyLinked<Character>('a');		
		
		//Add nodes
		list.addNode('b');
		list.addNode('c');
		list.addNode('d');
		list.addNode('e');
		list.addNode('f');
		//Search nodes

		//Iterate
		list.iterateNodes();
		//Delete a node
	}
}