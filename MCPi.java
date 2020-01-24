
public class MCPi extends MonteCarlo {

	public MCPi(double minX, double maxX, double minY, double maxY) {
		super(minX, maxX, minY, maxY);
	}
	
	public boolean checkHit(double[] xy) {
		double x = xy[0];
		double y = xy[1];
		double fx = Math.sqrt(1-x*x); // quadrant 1 solution
		return y < fx;
	}

}
