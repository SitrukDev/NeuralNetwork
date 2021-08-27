package layers;

import org.ejml.simple.SimpleMatrix;

public abstract class Layer {
	
	private SimpleMatrix bias;
	private SimpleMatrix weights;
	private SimpleMatrix weightsGrad;
	private SimpleMatrix biasGrad;
	private SimpleMatrix input;
	
	private SimpleMatrix inputs;
}
