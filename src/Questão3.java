import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("Este programa verifica o número de pares de anagramas.");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String anagrama = teclado.nextLine();

        //Método substring usado para determinar os pares
        HashMap<String, Integer> map= new HashMap<>();

        //organizando o anagrama como array
        for(int i = 0; i < anagrama.length(); i++) {
            for(int j = i; j < anagrama.length(); j++) {
                char[] caracteres = anagrama.substring(i, j+1).toCharArray();
                Arrays.sort(caracteres);

                String valor = new String(caracteres);
                if (map.containsKey(valor))
                    map.put(valor, map.get(valor)+1);
                else
                    map.put(valor, 1);
            }
        }

        //contagem de anagramas
        int totalAnagramas = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            totalAnagramas += (n * (n-1))/2;
        }

        System.out.println("==================================================================");
        System.out.printf("O número de anagramas identificados na palavra %s foi igual a %d.", anagrama, totalAnagramas);
    }
}
