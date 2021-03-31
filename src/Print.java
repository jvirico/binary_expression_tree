package BinExpTree;

import java.util.ArrayList;

public class Print implements Visitor{

	private ArrayList<String> _exp;

	public Print() {
		_exp = new ArrayList<String>();
	}	

	public String DoPrint(Element root) {
		
		_exp.clear();		
		root.Accept(this);

		String s_exp = "";
		for (String s : _exp)
		{
		    s_exp += s;
		}
		return s_exp;
	}
	
	public void VisitNumber(Number n) {
		_exp.add(Double.toString(n.GetValue()));
	}
	public void VisitAddition(Addition a) {
		_exp.add("(");
		a.GetLeft().Accept(this);
		_exp.add("+");
		a.GetRight().Accept(this);
		_exp.add(")");
	}
	public void VisitProduct(Product p) {
		_exp.add("(");
		p.GetLeft().Accept(this);
		_exp.add("*");
		p.GetRight().Accept(this);
		_exp.add(")");
	}
	public void Reset() {
		_exp.clear();
	}
}
