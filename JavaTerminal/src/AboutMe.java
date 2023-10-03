import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
	public static void main(String[] args) {
/** first version */
//		String name = args [0];
//		String lastName = args [1];
//		int age = Integer.parseInt(args[2]);
//		double height = Double.parseDouble(args[3]);

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Type your name: ");
		String name = scanner.next();

		System.out.println("Type your last name: ");
		String lastName = scanner.next();

		System.out.println("Type your age: ");
		int age = scanner.nextInt();

		System.out.println("Type your height: ");
		double height = scanner.nextDouble();

		System.out.println("Hello! My name is " + name + " " + lastName + ".");
		System.out.println("I am " + age + " years old.");
		System.out.println("My height is " + height + " cm.");

	}
}
