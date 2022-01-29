
public class BooleanConditionals {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int age = 18;
		int personsQuantity = 2;
		boolean accompanied = (personsQuantity >= 2);

		System.out.println("accompanied=" + accompanied);
		if (age >= 18 && accompanied) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}
}
