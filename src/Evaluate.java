package BinExpTree;

public class Evaluate implements Visitor{
	
	private double _value;
	
	
	public double DoEvaluate(Element root) {
		root.Accept(this);
		return _value;
	}
	
	public void VisitNumber(Number n) {
		_value = n.GetValue();
	}
	
	public void VisitAddition(Addition p) {
		if (p.GetRight().isLeaf() && p.GetLeft().isLeaf()){
			Number l = (Number)p.GetLeft();
			Number r = (Number)p.GetRight();

			_value = l.GetValue() + r.GetValue();
		}else {
			if (p.GetRight().isLeaf()) {
				p.GetLeft().Accept(this);
				
				Number r = (Number)p.GetRight();
				_value = r.GetValue() + _value;
			}else if(p.GetLeft().isLeaf()) {
				p.GetRight().Accept(this);
				
				Number r = (Number)p.GetLeft();
				_value = r.GetValue() + _value;
			}else {
				p.GetRight().Accept(this);
				p.GetLeft().Accept(this);
			}
		}
	}
	public void VisitProduct(Product p) {
		if (p.GetRight().isLeaf() && p.GetLeft().isLeaf()){
			Number l = (Number)p.GetLeft();
			Number r = (Number)p.GetRight();

			_value = l.GetValue() * r.GetValue();
		}else {
			if (p.GetRight().isLeaf()) {
				p.GetLeft().Accept(this);
				
				Number r = (Number)p.GetRight();
				_value = r.GetValue() * _value;
			}else if(p.GetLeft().isLeaf()) {
				p.GetRight().Accept(this);
				
				Number r = (Number)p.GetLeft();
				_value = r.GetValue() * _value;
			}else {
				p.GetRight().Accept(this);
				p.GetLeft().Accept(this);
			}
		}
	}
}
