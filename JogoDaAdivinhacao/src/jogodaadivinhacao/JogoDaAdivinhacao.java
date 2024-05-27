package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

    public static void main(String[] args) {
       do {
            Scanner obj = new Scanner(System.in);
            Random random = new Random();

            String nome;
            int numero = 0;
            int tentativas = 0;
            int aleatorio = random.nextInt(10);
            int afirmacao;

            System.out.println("Digite o nome do jogador:");
            nome = obj.nextLine();
            System.out.println("Olá, " + nome);
            System.out.println("Você realmente quer jogar? Digite 1 para SIM e 2 para NÃO");
            afirmacao = obj.nextInt();

            if (afirmacao == 1) {
                System.out.println("Vamos começar!");

            } else if (afirmacao == 2) {
                System.out.println("Obrigada, tchau!");
                break;
            }
            while (numero != aleatorio) {

                tentativas++;
                System.out.println("Digite um número de 1 a 15");
                numero = obj.nextInt();

                System.out.println(" ");
                
                if (numero == aleatorio) {
                    System.out.println("Você acertou! Parabéns");
                    
                    System.out.println(" ");
                    
                } else if (numero < aleatorio) {
                    System.out.println("Dica: Tente um número maior");

                    System.out.println(" ");
                    
                } else if (numero > aleatorio) {
                    System.out.println("Dica: Tente um número menor");
                    
                    System.out.println(" ");
                }
                System.out.println("Você tentou " + tentativas + " vezes");
                
                System.out.println(" ");
            }
            System.out.println("Deseja continuar? Digite 1 para SIM e 2 para NÃO");
            afirmacao = obj.nextInt();

            if (afirmacao == 1) {
                System.out.println("Vamos Recomeçar!");

            } else if (afirmacao == 2) {
                 System.out.println("Obrigada, tchau " + nome + "!");
                break;
            
            }
               
        }while (true);
       
    }
        


    
}
