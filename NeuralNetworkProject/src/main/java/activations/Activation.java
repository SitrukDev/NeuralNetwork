package activations;

public interface Activation {
	public double activationFunction(double x);
	
	 public double derivative(double x);
	 
	 public double inverse(double y);
}
