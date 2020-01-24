/***
 * Estimates the area under a curve or function using a Monte Carlo approach.
 * 
 * @author kentcollins
 *
 */
public class MonteCarlo {

	private double minX, minY, maxX, maxY;
	private int totalThrows;
	private int totalHits;

	public MonteCarlo(double minX, double maxX, double minY,
			double maxY) {
		super();
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;
		this.totalThrows = 0;
		this.totalHits = 0;
	}

	public void simulate() {
		double[] rand = getRandomLocation(); // [x,y]
		boolean hit = checkHit(rand);
		if (hit)
			totalHits++;
		totalThrows++;
	}

	private double[] getRandomLocation() {
		double x = Math.random() * (maxX - minX) + minX;
		double y = Math.random() * (maxY - minY) + minY;
		return new double[] { x, y };
	}

	public boolean checkHit(double[] xy) {
		return false; // for students -- why is this the default?
	}

	public double getHitRatio() {
		if (totalThrows == 0)
			throw new UnsupportedOperationException(
					"Attempted division by zero -- no throws yet!");
		return (double) totalHits / totalThrows;
	}

	public double getEstimatedArea() {
		double totalArea = (maxY - minY) * (maxX - minX);
		return totalArea * getHitRatio();
	}

}
