
public class Tester {

	public static void main(String[] args) {
		// MCPi mc = new MCPi(0, 1, 0, 1);
		// for (int i = 0; i<100000; i++) {
		// mc.simulate();
		// }
		// System.out.println("Results: "+mc.getEstimatedArea()*4);
		MonteCarlo mc = new MCCubed(0, 1, 0, 1);
		for (int i = 0; i < 100000; i++) {
			mc.simulate();
		}
		System.out.println(mc.getHitRatio());
	}

}
