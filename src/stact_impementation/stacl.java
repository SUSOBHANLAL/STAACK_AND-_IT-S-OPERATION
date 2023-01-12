package stact_impementation;

import java.io.*;

class node{
	node next;
	int data;
	node(int d){
		data= d;
		next = null;
		
	}
}


class mystack{
	node head;
	int size ;
	
	mystack(){
		head= null;
		size = 0;
		
	}
	
	
	void push( int x,mystack list)
	{
		node temp = new node(x);
		temp.next = list.head;
		list.head = temp;
		size = size+1;
		
	}
	
	
	int pop(mystack list) {
		if(list.head== null) {
			System.out.print("head is null");
			return 0;
		}
		// there is an error when we try to pop data when the stack is already null;
		// at that case res putting exception error  
		else {
			int res= list.head.data;
			node temp=  list.head;
			list.head= temp.next;
			size--;
			return res;
			
			
		}
		
		
		
	}
	
	
	int size() {
		return size;
		
	}
	
	
	int peekI(mystack list)
	{
		
		if(list.head==null)
		{
			System.out.print("0it is null");
			
		}
		
			return list.head.data;
			
		
		
	}
	
	
	boolean isEmpty(mystack list) {
		return list.head==null;
		
	}

	public static  void PrintList(mystack list) {
		node current= list.head;
		System.out.print("stack");
		
		while(current!=null)
		{
			
			System.out.print(current.data+" ");
			current = current.next;
			
			
		}
	}
	
	
	
	
	
	
	
}



public class stacl {
	
	
	
	public static void main(String [] args) {
		
		
		mystack list = new mystack();
		
	    list.push(20,list);
		list.push(30,list);
		list.push(40,list);
		list.push(50,list);
		list.push(60,list);
		list.push(70,list);
		System.out.println("the pop element is the:"+list.pop(list));
		System.out.println("the pop element is the:"+list.pop(list));
		System.out.println("the pop element is the:"+list.size());
		System.out.println("the pop element is the:"+list.isEmpty(list));
		list.PrintList(list);
		


		
		
	}
	
	
	

}
