package com.bridgelabz;

public class MyTest {
       public INode head;
       public INode tail;
       
       public MyTest() {
    	   this.head = null;
    	   this.tail = null;
    	}
       public void add[INode myNode] {
    	  if(this.tail = myNode){
    	  this.tail = myNode;
    	  }
    	  if(this.head = myNode) {
    		  this.head = myNode;
    	  }else {
    		  INode tempNode = this.head;
    		  this.head = myNode;
    		  this.head.setNext(tempNode);
    	  }
    	   
       }
       public void append(INode myNode) {
    	   if(this.head == null) {
    		   this.head = myNode;
    	   }
    	   if(this.tail == null) {
    		   this.tail = myNode;
    	   }else
    	   {
    		   this.tail.setNext(myNode);
    		   this.tail = myNode;
    	   }
       }
       public void insert(INode myNode, INode newNode) {
    	   INode tempNode = myNode.getNext();
    	   myNode.setNext(newNode);
    	   newNode.setNext(tempNode);
       }
       public INode pop() {
    	   INode tempNode =  this.head;
    	   this.head = head.getNext();
    	   return tempNode;
     	   
       }
    	   
    	   
    	   
       
       public void printMyNodes() {
    	   StringBuffer myNodes = new StringBuffer("My NOdes: ");
    	   INode tempNode = head;
    	   while (tempNode.getNext() != null) {
    		   myNodes.append(tempNode.getKey());
    		   if(!tempNode.equals(tail)) myNodes.append("->");
    		   }
    	   	myNodes.append(tempNode.getKey());
    	   	System.out.println(myNodes);
       }
      
}

