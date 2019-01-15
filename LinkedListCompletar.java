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

public class LinkedListCompletar
{
	//Class variables for the Linked List
	private static Node head;
	private static int numNodes;
	
	public static void main(String [] args)
	{
		System.out.println("/=/=/=/= TESTING /=/=/=/=");
		LinkedListCompletar ll = new LinkedListCompletar(10);
		ll.addAtHead(11);
		ll.addAtHead(12);
		ll.addAtHead(13);
		ll.addAtTail(8);
		ll.addAtTail(7);
		//ll.addAtIndex(4,9);
		ll.printList();
		//ll.deleteAtIndex(4);
		ll.printList();
	}
	
	public LinkedListCompletar(Object dat)
	{
		head = new Node(dat);
		numNodes=1;
	}
	
	public void addAtHead(Object dat)
	{
		Node temp = head;
		head = new Node(dat);
		head.setLink(temp);
		numNodes++;
	}
	
	public void addAtTail(Object xNode)
	{
		Node temp = head;
		while(temp.getLink() != null)
		{
			//temp = temp.next;
			temp = temp.getLink();
		}
		temp.setLink(new Node(xNode));
		//temp.next = new Node(dat);
		numNodes++;
	}
	
	public void addAtIndex(int index, Object xNode)
	{

	}
	
	public void deleteAtIndex(int index)
	{

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
		
	public static void printList()
	{
		System.out.println("Number of elements:"+getSize());
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.getData());
			//temp = temp.next;
			temp = temp.getLink();
		}
	}
	
	public static int getSize()
	{
		return numNodes;
	}
	
}