package layers;

import org.ejml.simple.SimpleMatrix;

public abstract class Layer {

	private SimpleMatrix bias;
	private SimpleMatrix weights;
	private SimpleMatrix weightsGrad;
	private SimpleMatrix biasGrad;
	private SimpleMatrix inputs;
	
	public Layer(int inputs, int outputs) { 
		this.changeBias(new SimpleMatrix(new double[inputs][1]));
		this.changeBiasGrad(new SimpleMatrix(new double[inputs][1]));
		this.changeInputs(new SimpleMatrix(new double[inputs][outputs]));
		this.changeWeights(new SimpleMatrix(new double[inputs][outputs]));
		this.changeWeightsGrad(new SimpleMatrix(new double[inputs][outputs]));
		
	}
	
	public int inputFeatures() {
		return this.weights.numRows();
	}

	public int outputFeatures() {
		return this.weights.numCols();
	}

	public SimpleMatrix bias() {
		return this.bias;
	}

	public void changeBias(SimpleMatrix bias) {
		this.bias = bias;
	}

	public SimpleMatrix weights() {
		return this.weights;
	}

	public void changeWeights(SimpleMatrix weights) {
		this.weights = weights;
	}

	public SimpleMatrix weightsGrad() {
		return this.weightsGrad;
	}

	public void changeWeightsGrad(SimpleMatrix weightsGrad) {
		this.weightsGrad = weightsGrad;
	}

	public SimpleMatrix biasGrad() {
		return this.biasGrad;
	}

	public void changeBiasGrad(SimpleMatrix biasGrad) {
		this.biasGrad = biasGrad;
	}

	public SimpleMatrix inputs() {
		return this.inputs;
	}

	public void changeInputs(SimpleMatrix inputs) {
		this.inputs = inputs;
	}

}
