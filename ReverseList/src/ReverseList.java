import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) { 
    	val = x; 
    }
}


public class ReverseList {
	public static void printList(ListNode head) {
		System.out.println("The List contains..");
		while(head.next!=null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(head.val);
	}
	
	public static ListNode revList(ListNode head) {		
		//Reverse Logic:
		ListNode temp = new ListNode(0);
		Integer x = null;
		if(head==null)
			return head;
		if(head.next==null) {
            return head;
		}
		
        ListNode prevNode, futureNode, currNode;
        currNode = head.next;
        head.next=null;
        prevNode = head;
        while(currNode.next!=null){
            futureNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = futureNode;
        }
        //last node
        currNode.next = prevNode;
        printList(currNode);
        return currNode;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(3);
		n1=null;
//		ListNode n1 = new ListNode(5);
//		n1.next = new ListNode(6);
//		n1.next.next = new ListNode(7);
//		n1.next.next.next = new ListNode(8);
//		printList(n1);
		ListNode res = revList(n1);
		
	}
}
