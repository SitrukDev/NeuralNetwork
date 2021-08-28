import org.ejml.simple.SimpleMatrix;

public class Main {

	public static void main(String[] args) {
		SimpleMatrix firstMatrix = new SimpleMatrix(
				new double[][] { new double[] { 1d }, new double[] { 2d }, new double[] { 1d }, new double[] { 5d } });

		SimpleMatrix secondMatrix = new SimpleMatrix(
				new double[][] { new double[] { 1d, 2d, 3d, 7d }, new double[] { 5d, 2d, 8d, 1d } });
		
		secondMatrix.mult(firstMatrix).print();
		
		firstMatrix.print();
		secondMatrix.print();
	}

}
