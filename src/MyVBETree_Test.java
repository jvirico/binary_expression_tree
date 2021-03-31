package BinExpTree;

public class MyVBETree_Test {

	public static void main(String[] args) {
		
		//We create expression 3+(5*6)
		Number three = new Number(3);
		Number five = new Number(5);
		Number six = new Number(6);
		
		//We create product Composite
		Product p = new Product(five,six);
		//We create addition Composite
		Addition a = new Addition(three, p);
		
		Print myPrint = new Print();
		Evaluate myEvaluation = new Evaluate();
		
		System.out.println(myPrint.DoPrint(a));
		System.out.println(myEvaluation.DoEvaluate(a));
		
		
		//We create expression 2*(3+(5*6)+1)
		Number two = new Number(2);
		Number one = new Number(1);
		
		Product _p = new Product(five,six);//p = (5*6)
		Addition _a = new Addition(three, _p);//a = 3+p
		Addition _a2 = new Addition(_a,one);//a2 = p+1
		Product _p2 = new Product(two,_a2);//_p2 = 2*(a2)
		
		System.out.println(myPrint.DoPrint(_p2));
		System.out.println(myEvaluation.DoEvaluate(_p2));
	}

}
