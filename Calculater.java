	

			import java.util.Scanner;
			class Calculater{

			public static void main(String [] args){



			for (int i = 1; i < 2; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Option 1= add");
			System.out.println("option 2= sub ");
			System.out.println("option 3= multi");
			System.out.println("option 4= div ");
			System.out.println("Enter the any option");
			int n = sc.nextInt();
			if (n != 5) {
				i = 0;
			}
			int a = 20;
			int b = 10;
			switch (n) {
			case 1:
				System.out.println(a + b);
				break;

			case 2:
				System.out.println(a - b);
				break;

			case 3:
				System.out.println(a * b);
				break;

			case 4:
				System.out.println(a / b);
				break;

			default:
				System.out.println("no option match");
				break;

			}

		}
}
}