package BinExpTree;

public interface Visitor {
	public void VisitNumber(Number n);
	public void VisitAddition(Addition a);
	public void VisitProduct(Product p);
}
