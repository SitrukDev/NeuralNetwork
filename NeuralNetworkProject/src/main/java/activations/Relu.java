package activations;

public class Relu implements Activation {

	public double activationFunction(double x) {
		return Math.max(x, 0);
	}

	public double derivative(double x) {
		double dydx = 1;
		
		if (x == 0) {
			dydx = 0;
		}
		
		return dydx;
	}
	
	public double inverse(double y) {
		return y;
	}
}
