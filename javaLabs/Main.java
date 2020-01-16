public class Main {
	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void WhileOutput(int[] array) {
		int i = 0;
		while(i < array.length) {
			System.out.print(array[i] + " ");
			i++;
		}
		System.out.println();
	}

	public static void DoWhileOutput(int[] array) {
		if(array.length == 0) {
			System.out.println("Массив пуст");
		} else {
			int i = 0;
			do {
				System.out.print(array[i] + " ");
				i++;
			} while(i < array.length);
			System.out.println();
		}
	}

	public static void ForOutput(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static void HarmonicRow(int n) {
		double total = 0.0d;
		for(int i = 1; i <= n; i++) {
			total += 1.0/i;
			System.out.print(total + " ");
		}
		System.out.println();
	}

	static int[] generateRandomArray(final int size) {
		int[] array = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = (int)(Math.random() * 1000);
		}
		return array;
	}

	static void sortArray(int[] array) {
		boolean is_sorted = false;
		while(!is_sorted) {
			is_sorted = true;
			for(int i=0; i<(array.length - 1); i++) {
				if(array[i] < array[i+1]) {
					int temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					is_sorted=false;
				}
			}
		}
	}

	static long factorial(int n) {
		if(n < 0) {
			System.out.println("Неправильный ввод. Число должно быть больше нуля");
			return 0;
		} else if(n == 0 || n == 1) { 
			return 1;
		}
		int result = 1;
		for(int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7,8,9,10};

		// Первое задание
		WhileOutput(myArray);
		DoWhileOutput(myArray);
		ForOutput(myArray);

		// Второе задание
		for(int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		// Третье задание
		HarmonicRow(10);

		// Четвёртое задание
		int[] array = generateRandomArray(10);
		printArray(array);
		sortArray(array);
		printArray(array);
		// Пятое задание
		System.out.println(factorial(10));
	}
}