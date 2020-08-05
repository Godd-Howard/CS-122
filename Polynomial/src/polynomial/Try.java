package polynomial;

public class Try {

	public static void main(String[] args) throws InvalidDegreeException
	{
		
		Polynomial myPoly = new Polynomial(4);
		myPoly.setCoefficient(4, 3);
		myPoly.setCoefficient(2, 7);
		myPoly.setCoefficient(1, -3);
		myPoly.setCoefficient(0, 6);
		System.out.println(myPoly.toString());
		System.out.println(myPoly.evaluate(4));
		
	}

}
