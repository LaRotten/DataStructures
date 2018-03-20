package StackR;


public class St1 {
	public static void main(String []args) {
		SLL1 as=new SLL1();
		as.add(15);
		as.add("fnsalfsam");
		as.add('9');
		as.print();
	}	


}

class Node1{
	Object data;
	Node1 next;
	Node1(Object d){
		data =d;
		next=null;
	}
}
class SLL1{
	private Node1 head;
	private int size;
	SLL1(){
		head=null;
		size=0;
	}
	void add(Object o) {
		Node1 temp=head;
		if(head==null)	head=new Node1(o);
		else {
			while(temp.next != null) 		temp=temp.next;
				
			temp.next=new Node1(o);
			
		}
	}
	void print() {
		Node1 temp=head;
		if(head==null)	System.out.println("Stack is empty");
		else {
			while(temp!=null) {
				System.out.print(temp.data + "--->");
				temp=temp.next;
			}
		}
	}
}