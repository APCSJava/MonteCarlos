
public class MCLinear extends MonteCarlo {

	public MCLinear(double minX, double maxX, double minY,
			double maxY) {
		super(minX, maxX, minY, maxY);
	}

	public boolean checkHit(double[] xy) {
		double x = xy[0];
		double y = xy[1];
		double fx = x;
		return y < fx;
	}

}
