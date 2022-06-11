package com.bridgelabz;
import org.junit.Test;

public class MyLinkedList {

	public void  given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(key 70);
		MyLinkedList<Integer> mySeconNode = new MyLinkedList<>(key 30);
		MyLinkedList<Integer> myThirdNode = new MyLinkedList<>(key 56);
		MyTest myTest =new MyTest();
		MyTest.add(myFirstNode);
		MyTest.add(mySecondNode);
		MyTest.add(myThirdNode);
		MyTest.printMyNodes();
		
	}
}
