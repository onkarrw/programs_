public class LinkedList {
	
	Node head; 
	
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		
		if (head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;	
		}
		
		Node currNode = head;
		while(currNode.next !=null)
		{
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	
	public void printlist()
	{
		
		if (head == null )
		{
			System.out.println("list is empty");
		}
		Node currNode = head;
		
		while (true)
		{
			if(currNode!= null) {
				System.out.print(currNode.data +" -> ");
				currNode = currNode.next;
				
			}
			else
				break;
		}
		
		System.out.println("NUll");
	
	}
	
	
	public void deleteFirst()
	{
		if (head == null)
		{
			System.out.println("the list is empty");
			return;
		}
		head = head.next;
		
	}
	
	public void deleteLast()
	{
		if (head == null)
		{
			System.out.println("the list is empty");
			return;
		}
		
		if (head.next == null)
		{
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null)
		{
			lastNode= lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	public void size()
	{	int siz=0;
		if (head == null)
		{
			siz =0;
		}
		else 
		{
			Node currNode = head;
			
			while (true)
			{
				if(currNode.next != null) {
					siz++;
					currNode = currNode.next;
					
				}
				else
				{
					siz++;
					break;
					
				}
			}
		}
		System.out.println("size of ll is "+ siz);
	}
	
	public static void main(String[] args) {
	
		LinkedList list = new LinkedList();
	
		list.addFirst("onkar");
		list.addFirst("am");
		list.addFirst("i");
		list.addLast("last");
		list.addFirst("first");
		
		list.printlist();
		
		list.deleteFirst();
		list.deleteLast();
		
		list.printlist();
		
		list.size();
		
	}
}
