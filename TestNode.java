package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class TestNode {

	public void given3NumbersWhenLinkedListShouldPassedLInkedListTest() {
	List<Integer> myFirstNode = new List<>(56);
	List<Integer> mySeconNode = new List<>(30);
	List<Integer> myThirdNode = new List<>(70);
	myFirstNode.setNext(mySecondNode);
	mySecondNode.setNext(myThirdNode);
	boolean result = myFirstNode.getNext().equals(mySecondNode) &&
					 mySecondNode.getNext().equals(myThirdNode);
	Assert.assertTrue(result);
		
}
}

