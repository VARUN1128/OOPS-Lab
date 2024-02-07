import java.util.Scanner;


class Node {
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}


class DoublyLinkedList{
	Node head = null;
	
	Node createNode(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Data :");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		return newNode; 
	}
	
	void insertFront(){
		Node newNode = createNode();
		if(head != null){
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}else{
			head = newNode;
		}
	}	
	
	void insertRear(){
		Node newNode = createNode();
		if(head != null){
			Node temp = head;
			while(temp.next != null ){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
			
		}else{
			head = newNode;
		}
	}
	
	void deleteFront(){
		if(head != null){
			if(head.next == null){
				head = null;
				return;
			}
			head = head.next;
			head.prev = null;
		}else{
			System.out.println("Empty list");
		}
	}
	
	void deleteSpecific(){
		
		if(head != null){
			System.out.print("Enter Node To Delete :");
			Scanner sc = new Scanner(System.in);
			int tosearch  = sc.nextInt();
			
			
			Node temp = head;
			Node prev  = null;
			boolean found = false;
			while(temp != null){
				
				if(temp.data == tosearch){
					if(prev == null){
						//first element
						deleteFront();
						return;
					}
					
					if(temp.next == null){
						//last element
						deleteRear();
						return;
					}
					prev.next = temp.next;
					temp.next.prev = prev;
					found = true;
					break;
				}
				prev = temp;
				temp = temp.next;
			}
			if(found == false){
				System.out.println("\nElement not found\n");
			}
			
		}
	}
	
	
	void deleteRear(){
		if(head != null){
			if(head.next == null){
				head = null;
				return;
			}
			Node temp = head;
			Node prev = null;
			while(temp.next != null){
				prev = temp;
				temp = temp.next;
			}
			temp = null;
			prev.next = null;
		}else{
			System.out.println("Empty list");		
		}
	}
	
	void displayForward(){
		Node temp = head;
		if(head == null){
			System.out.println("\nEmpty List\n");
			return;			
		}
		System.out.println("\nLinked List :");
		while(temp.next != null){
		System.out.print(temp.data+" <==> ");
			temp = temp.next;
			
		}
		System.out.println(temp.data+"\n");
	}

	
	void displayReverse(){
		Node temp = head;
		if(head == null){
			System.out.println("\nEmpty List\n");
			return;
		}
		while(temp.next != null){
			temp = temp.next;
			
		}
		
		System.out.println("\nReversed Linked List :");
		while(temp.prev != null){
			System.out.print(temp.data+" <==> ");
			temp = temp.prev;
			
		}
		System.out.println(temp.data+"\n");
	}
}




class DoublyLL{
	public static void main(String args[]){
		DoublyLinkedList dll = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop){
			System.out.println("1.Insert Front\n2.Insert Rear\n3.Delete Front\n4.Delete Specific");
			System.out.println("5.Display Forward\n6.Display Reverse");
			System.out.print("Enter Choice :");
			switch(sc.nextInt()){
				case 1:
					dll.insertFront();
					break;
				case 2:
					dll.insertRear();
					break;
				case 3:
					dll.deleteFront();
					break;
				case 4:
					dll.deleteSpecific();
					break;
				case 5:
					dll.displayForward();
					break;
				case 6:
					dll.displayReverse();
					break;
				case 7:
					loop = false;
					break;
				default:
					System.out.println("Invalid");
					
			}
		}
	}
}
