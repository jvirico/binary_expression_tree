package BinExpTree;

public class Product extends Element {
	
	private Element _Left;
	private Element _Right;
	
	public Product(Element l, Element r) {
		_Left = l;
		_Right = r;
	}
	
	public void Accept(Visitor v) {
		v.VisitProduct(this);
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
	public Element GetLeft() {
		return _Left;
	}
	public Element GetRight() {
		return _Right;
	}
}
