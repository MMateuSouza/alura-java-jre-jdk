
public class VariableScope {
	public static void main(String[] args) {
		System.out.println("Testando Escopo de Variáveis");

		int age = 18;
		int personsQuantity = 2;
		boolean accompanied = false;

		if (personsQuantity >= 2) {
			accompanied = true;
		}
		
		System.out.println("accompanied=" + accompanied);
		if (age >= 18 && accompanied) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}
}
