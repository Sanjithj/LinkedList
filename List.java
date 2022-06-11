package com.bridgelabz;

public class List<K> Implements INode<K> {
	private K key;
	private INOde next;
	
	public  INOde(K key) {
		this.key = null;
		this.setNext(null);
	}
    public K getKey() {
    	return key;
    }
    public void setKey(K key) {
    	this.key = key;
    }
	public  INOde getNext() {
		return next;
	}
    @Override
	public void setNext( INOde next) {
		this.next = next;
	}

}
