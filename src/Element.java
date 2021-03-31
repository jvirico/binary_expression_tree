package BinExpTree;

abstract class Element {
	abstract void Accept(Visitor v);
	abstract boolean isLeaf();
}
