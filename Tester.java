
public class Tester {

	public static void main(String[] args) {
		MonteCarlo mc1 = new MCLinear(0, 1, 0, 1);
		for (int i = 0; i < 100000; i++) {
			mc1.simulate();
		}
		System.out.println(mc1.getHitRatio()); // ~ .5

		MonteCarlo mc2 = new MCSquared(0, 1, 0, 1);
		for (int i = 0; i < 100000; i++) {
			mc2.simulate();
		}
		System.out.println(mc2.getHitRatio()); // ~ .3333

		MonteCarlo mc3 = new MCCubed(0, 1, 0, 1);
		for (int i = 0; i < 100000; i++) {
			mc3.simulate();
		}
		System.out.println(mc3.getHitRatio()); // ~ .25

		MonteCarlo mcPi = new MCPi(0, 1, 0, 1);
		for (int i = 0; i < 100000; i++) {
			mcPi.simulate();
		}
		System.out.println("Ratio of inscribed circle to enclosing square " + mcPi.getHitRatio()); // ~ 3.14159/4
		System.out.println("Resulting estimate of pi: "+mcPi.getHitRatio()*4);
	}

}
