
public class If {

	public static void main(String[] args) {
		int loop = 0;
		while (true) {
			System.out.println("Looping " + loop);
			if (loop == 3) {
				break;
			}
			loop++;
			System.out.println("Running");
		}
	}

}
