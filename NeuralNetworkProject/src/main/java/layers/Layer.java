package layers;

import org.ejml.simple.SimpleMatrix;

import activations.Activation;
import activations.Relu;

public abstract class Layer {

	private SimpleMatrix bias;
	private SimpleMatrix weights;
	private SimpleMatrix weightsGrad;
	private SimpleMatrix biasGrad;
	private SimpleMatrix inputs;
	
	private Activation activation;
	
	public Layer(int inputs, int outputs) { 
		this.changeBias(new SimpleMatrix(inputs, 1));
		this.changeBiasGrad(new SimpleMatrix(inputs, 1));
		this.changeInputs(new SimpleMatrix(inputs, outputs));
		this.changeWeights(new SimpleMatrix(inputs, outputs));
		this.changeWeightsGrad(new SimpleMatrix(inputs, outputs));
		
		this.changeActivation(new Relu());
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

	public Activation activation() {
		return this.activation;
	}
	
	public void changeActivation(Activation activation) {
		this.activation = activation;
	}
	
	public SimpleMatrix feedforward(SimpleMatrix inputs) {
		this.changeInputs(inputs);
		
		SimpleMatrix outputs = this.weights().mult(inputs);

		for (int outputRow = 0; outputRow < outputs.numRows(); outputRow++) {
			outputs.set(outputRow,  0, outputs.get(outputRow, 0) + this.bias().get(outputRow, 0));
			
			outputs.set(outputRow,  0, this.activation().activationFunction(outputs.get(outputRow, 0)));
		}
		
		return outputs;
	}
	
	 public SimpleMatrix backPropagation(SimpleMatrix errors, int learningRate) { 
		 SimpleMatrix outputs = this.feedforward(this.inputs());
		 
		 
	 }
}
