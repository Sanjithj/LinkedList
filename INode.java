package com.bridgelabz;

public interface INode<K> {
	
	K getKey();
	void setKey(K key);
	
	INOde getNext();
	void setNext(Inode next);
}
