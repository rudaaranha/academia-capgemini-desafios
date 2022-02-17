import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Questão2 {
    public static void main(String[] args) {
        int tamanhoSenha = 6;
        boolean letraMinuscula = false, letraMaiuscula = false, digitos = false, caractereEspecial = false;
        Set<Character> set = new HashSet<Character>( //determinando os caracteres especiais
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("==================================================================");
            System.out.print("Para que seu cadastro seja concluído, por favor, digite uma senha: ");
            String senha = teclado.nextLine();

            int num = tamanhoSenha - senha.length();

            //transformando os caracteres em array e verificando as condições de para senha
            for (char c : senha.toCharArray()) {
                if (Character.isLowerCase(c))
                    letraMinuscula = true;
                if (Character.isUpperCase(c))
                    letraMaiuscula = true;
                if (Character.isDigit(c))
                    digitos = true;
                if (set.contains(c))
                    caractereEspecial = true;
            }

            //condiçõea para que a senha seja aceita
            System.out.println("==================================================================");
            if (senha.length() < tamanhoSenha) {
                System.out.println("Senha inválida. Por favor, Digite uma senha que tenha pelo menos 6 caracteres.");
                System.out.printf("Faltam %d caracteres para que sua senha seja considerada segura!\n", num);
            } else {
                if (letraMinuscula && letraMaiuscula && digitos && caractereEspecial) {
                    System.out.println("Sua senha foi salva com sucesso!");
                    break;
                } else {
                    System.out.println("Senha inválida!\nSua senha deve ter pelo menos: ");
                    System.out.println("1 letra minúscula, 1 letra maiúscula, 1 digito e 1 caractere especial.\nPor favor, tente novamente.");
                }
            }

            //Fazendo o os caracteres retornarem falso ao fim do código para que o loop continue pedindo uma nova senha, caso a digitada seja inválida.
            for (char c : senha.toCharArray()) {
                if (Character.isLowerCase(c))
                    letraMinuscula = false;
                if (Character.isUpperCase(c))
                    letraMaiuscula = false;
                if (Character.isDigit(c))
                    digitos = false;
                if (set.contains(c))
                    caractereEspecial = false;
            }
        } while (letraMinuscula == false || letraMaiuscula == false || digitos == false || caractereEspecial == false);
    }
}