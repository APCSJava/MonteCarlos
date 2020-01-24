
public class Tester {

	public static void main(String[] args) {
		MonteCarlo mc = new MonteCarlo(0, 1, 0, 1);
		for (int i = 0; i < 100000; i++) {
			mc.simulate();
		}
		System.out.println(mc.getHitRatio());
	}

}
