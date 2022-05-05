class LinkedList{
	Node head;
	Node head1;
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node linkedReverse(Node head){
		Node pointer =head;
		Node temp=head;
		Node p=null;
		Node n=null;
		while(temp!=null){
			n=temp.next;
			temp.next=p;
			p=temp;
			temp=n;
		}
		head=p;
		return head;
	}
	
	/*	void add(Node head,int data){
			Node temp=head;
			Node new1=new Node(data);
			if (head==null){
				head=new1;
				return;
			}
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new1;
			new1.next=null;
		}*/
		
		void display(Node head){
			Node n=head;
			while(n!=null){
	//			if(n.data==n.next.data){break;}
				System.out.print(n.data+" ");
				n=n.next;
			}
		}
		
	public static void main(String args[]){
		LinkedList ll =new LinkedList();
//		ll.add(ll.head,10);
//		ll.add(ll.head,60);
		ll.display(ll.head);
		ll.head=new Node(1);
		ll.head.next=new Node(5);
		ll.head.next.next=new Node(1);
		ll.head.next.next.next=new Node(2);
		ll.head.next.next.next.next=new Node(3);
		ll.head.next.next.next.next.next=new Node(4);
		ll.head.next.next.next.next.next.next=new Node(5);
		ll.display(ll.head);
		ll.head=ll.linkedReverse(ll.head);
		System.out.println();
		ll.display(ll.head);
		System.out.println();
		ll.head1=new Node(2);
		ll.head1=new Node(4);
		ll.head1.next=new Node(3);
		ll.head1.next.next=new Node(4);
		ll.head1.next.next.next=new Node(2);
		ll.head1.next.next.next.next=new Node(5);
		ll.display(ll.head1);
		ll.head1=ll.linkedReverse(ll.head1);
		System.out.println();
		ll.display(ll.head1);
	}
}