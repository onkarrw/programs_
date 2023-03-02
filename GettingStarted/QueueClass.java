
public class QueueClass {
	

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
	
	static class Queue
	{
		
		public Node tail = null;
		public Node head = null;
		

		public boolean isEmpty()
		{
			return tail == null && head == null;
		}
		
		public void push(int data)
		{
			Node newNode = new Node(data);
			
			if (isEmpty())
			{
				tail = head = newNode;
				return;
			}
			
			tail.next = newNode;
			tail = newNode;
			
		}
		
		public int pop()
		{
			if (isEmpty())
			{
				System.out.println("null");
				return -1;
			}
			
			int front = head.data;
			
			if (head == tail)
			{
				tail= null;
			}
			head = head.next;
			
			return front;
			

		}
	}
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		q.push(5);
		q.push(8);
		
		q.pop(); 
		q.pop();
					
	}
}