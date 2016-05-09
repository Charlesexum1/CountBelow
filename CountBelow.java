import java.util.Scanner;

public class CountBelow {
	
	
	private double total;
	private int counter = 0;
	private double[] count = new double[10];
	
	private void getCount() {
		Scanner keys = new Scanner(System.in);
		for (int x = 0; x < count.length; x++) {
			count[x] = keys.nextDouble();
			total += count[x];
			}
		for (int y = 0; y < count.length; y++) {
			if (count[y] <= (.1 * total)) {
				counter++;
				}
			}
		System.out.println("The total is: " + total);
		System.out.println("Count below 10% total is: " + counter);		
		}
	
	public static void main(String[] args) {
		
		CountBelow demo = new CountBelow();
		demo.getCount();
		
		}		
	
	}
