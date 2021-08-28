package activations;

public class Sigmoid implements Activation {

	public double activationFunction(double x) {
		return 1 / (1 + Math.exp(-x));
	}

	public double derivative(double x) {
		double y = this.activationFunction(x);
		
		return y * (1 - y);
	}

	public double inverse(double y) {
		return Math.log(y / (1- y));
	}

}
