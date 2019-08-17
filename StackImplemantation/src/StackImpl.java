import java.util.*;

public class StackImpl {
	
	private int array[];
	private int top;
	private int capacity;
	
	public StackImpl(int capacity)  
	{
		
		this.array = new int[capacity];
		this.top = -1;
		this.capacity = capacity;
	}
	
	public int size()
	{
		return top + 1 ;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == capacity - 1 ;
	}
	
	public void push(int item)
	{
		if(isFull())
		{
			throw new RuntimeException("Stack is full");
		}
		array[++top] = item;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Stack is empty");
		}
		return array[top--];
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Stack is empty");
		}
		return array[top];
	}
	
	public static void main(String []args)
	{
		StackImpl s = new StackImpl(5);
		s.push(1);
		s.push(2);
		s.pop();
		s.pop();
		s.push(3);
		System.out.println("Top element is : " + s.peek());
		System.out.println("Stack size is : " + s.size());
		
		s.pop();
		
	}

}
