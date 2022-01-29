
public class Conditional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int age = 16;
		int personsQuantity = 3;

		if (age >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		} else if (personsQuantity >= 2) {
			System.out.println("Você não tem 18 anos, mas pode entrar visto que está acompanhado!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}
}
