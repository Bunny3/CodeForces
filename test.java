import java.util.Arrays;
import java.util.Scanner;

class StringUtils
{
	// Read multi-line input from console in Java by using Scanner class
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			//String[] tokens = scanner.nextLine().split("\\s");
			System.out.println(scanner.nextLine());
		}

		scanner.close();
	}
}
