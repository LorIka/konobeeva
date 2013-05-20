import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainclass {
	public static void display(String str) {
		System.out.println(str);
	}

	public static void select() throws IOException {
		System.out.print("Чей проект выхотите запустить? (Konobeeva = 1, Obydennova = 2, Sykhanova = 3)  ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int cons = Integer.parseInt(input.readLine());
		if (cons == 1) {
			konobeeva.konobeeva();
		}
	}

	public static void ext_sel() throws IOException {
		System.out.print("Вы хотите продолжить? (1/0) ");
		BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
		int cont = Integer.parseInt(input2.readLine());
		if (cont == 1) {
			select();
			ext_sel();
		}
		if (cont == 0) {
			BufferedReader input3 = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.print("Press any key to continue . . . ");
			input3.readLine();
		}
	}

	public static void main(String args[]) throws IOException {
		select();
	    ext_sel();
	}
}
