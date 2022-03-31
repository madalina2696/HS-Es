public class Differenzieren {
    
    public static void main(String[] args) {

		String[] numbers = args[0].split(",");
		int counter = numbers.length - 1;

		if (numbers.length == 1) {
			System.out.println(0);

		} else {

			for (int i = 0; i < numbers.length -1; i++) {
				int zahl = Integer.parseInt(numbers[i]);
				System.out.print(zahl * counter);
				counter--;
				
                if (counter != 0) {
					System.out.print(",");
				}
			}
		}
	} 
}