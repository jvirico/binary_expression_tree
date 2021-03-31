package BinExpTree;

public class Number extends Element {

	private double _value;
	
	public Number(double v) {
		_value = v;
	}
	
	public void Accept(Visitor v) {
		v.VisitNumber(this);
	}
	
	public boolean isLeaf() {
		return true;
	}
	
	public double GetValue() {
		return _value;
	}
	public void SetValue(double v) {
		_value = v;
	}
	
}
