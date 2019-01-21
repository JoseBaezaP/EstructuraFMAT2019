/*============================================================================
Name        : LinkedList.java
Author      : Eric Swanson
Date	    : Sep 7, 2011
Version     : 
Description : 
Copyright (C) 2011 netherwolfe
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.


  
  Some modifications added by Joel  2019-01-07
============================================================================*/

public class LinkedListDoble
{
	//Class variables for the Linked List
	private static NodeDoble head;
	private static int numNodes;
	
	public static void main(String [] args)
	{
		System.out.println("/=/=/=/= TESTING /=/=/=/=");
		LinkedListDoble ll = new LinkedListDoble(10);
		ll.addAtHead(11);
		ll.addAtHead(12);
		ll.addAtHead(13);
		ll.addAtTail(8);
		ll.addAtTail(7);
		//ll.addAtIndex(4,9);
		ll.printList();
		//ll.deleteAtIndex(4);
		//ll.printList();
	}
	
	public LinkedListDoble(Object dat)
	{
		head = new NodeDoble(dat);
	}
	
	public void addAtHead(Object dat)
	{
		NodeDoble temp = head; //It was the head
		head = new NodeDoble(dat);  //It is the new head
		temp.setPrevLink(head);
		head.setNextLink(temp);
		numNodes++;
	}
	
	public void addAtTail(Object xNode)
	{
		NodeDoble temp = head;
		NodeDoble newNode=new NodeDoble(xNode);
		while(temp.getNextLink() != null)
		{
			temp = temp.getNextLink();
		}
		temp.setNextLink(newNode);
		newNode.setPrevLink(temp);
		numNodes++;
	}
/*	
	public void addAtIndex(int index, Object xNode)
	{
		Node temp = head;
		Node holder;
		for(int i=0; i < index-1 && temp.getLink() != null; i++)
		{
			//temp = temp.next;
			temp = temp.getLink();
		}
		//holder = temp.next;
		//temp.next = new Node(dat);
		//temp.next.next = holder;
		holder = temp.getLink();
		temp.setLink(new Node(xNode));
		temp.getLink().setLink(holder);

		numNodes++;
	}
	
	public void deleteAtIndex(int index)
	{
		Node temp = head;
		for(int i=0; i< index - 1 && temp.getLink() != null; i++)
		{
			temp=temp.getLink();
			//temp = temp.next;
		}
		temp.setLink(temp.getLink().getLink());
		//temp.next = temp.next.next;
		numNodes--;
	}
	
	public static int find(Node n)
	{
		Node aux = head;
		int index = 0;
		while(aux != n)
		{
			index++;
			aux=aux.getLink();
			//t = t.next;
		}
		return index;
	}
	
	public static Node find(int index)
	{
		Node temp=head;
		for(int i=0; i<index; i++)
		{
			temp=temp.getLink();
			//temp = temp.next;
		}
		return temp;
	}
		*/
	public static void printList()
	{
		NodeDoble temp = head;
		while(temp != null)
		{
			System.out.println(temp.getData());
			//temp = temp.next;
			temp = temp.getNextLink();
		}
	}
	
	public static int getSize()
	{
		return numNodes;
	}
	
}