package BinExpTree;

public class Addition extends Element{
	
	private Element _Left;
	private Element _Right;
	
	
	public Addition(Element l, Element r) {
		_Left = l;
		_Right = r;
	}
	
	public void Accept(Visitor v) {
		v.VisitAddition(this);
	}
	public boolean isLeaf() {
		return false;
	}
	public void SetLeft(Element e) {
		_Left = e;
	}
	public void SetRight(Element e) {
		_Right = e;
	}
	public Element GetRight() {
		return _Right;
	}
	public Element GetLeft() {
		return _Left;
	}
	
}
