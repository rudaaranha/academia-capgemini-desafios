import java.util.Arrays;

public class Questão1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos degraus a escada possui? ");
        String escada = teclado.nextLine();
        int n = Integer.parseInt(escada);
        char espaco = ' ';
        char ast = '*';

        for (int i = 1; i <= n; i++) {
            //Fazendo um array de chars para os espaços em branco e para os asteriscos
            char[] escadaEspaco = new char[n-i];
            char[] escadaAsterisco = new char[i];

            //método para preencher todos os valores do array com um valor estático
            Arrays.fill(escadaEspaco, espaco);
            Arrays.fill(escadaAsterisco, ast);

            String stringEspacos = new String(escadaEspaco);
            String stringAsteriscos = new String(escadaAsterisco);

            System.out.print(stringEspacos);
            System.out.println(stringAsteriscos);
        }
    }
}
