

public class StackClass {
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	static class Stack
	{
		public Node head;
		
		public boolean isEmpty()
		{
			return head==null;
		}
		
		public void push(int data)
		{
			Node newNode = new Node(data);
			if (isEmpty())
			{
				
				head = newNode;
				return;
			}
			
			newNode.next = head;
			head = newNode;
			
		}
		
		public int pop()
		{
			if (isEmpty())
			{
				System.out.print("nullList --> ");
				return -1;
			}
			
			System.out.print(head.data + " --> ");
			int top = head.data;
			head = head.next;
			return top;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(4);
		s.push(3);
		s.pop();
		s.pop();
		s.pop();
		s.push(5);
		s.push(2);
		s.pop();
	
	}
}
