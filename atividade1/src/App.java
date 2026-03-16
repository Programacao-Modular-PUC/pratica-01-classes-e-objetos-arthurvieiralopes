import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);

            int i = 0;
            String nomeAnterior = null;
            Pessoa[] pessoas = new Pessoa[10];

            while(i < 10){

                int dia, mes, ano;
                String nome;
                double peso, altura;

                System.out.println("Digite seu nome: ");
                nome = sc.next();
                

                System.out.println("Digite sua altura: ");
                altura = sc.nextDouble();

                System.out.println("Digite seu peso: ");
                peso = sc.nextDouble();

                System.out.println("Digite o dia, mes e ano respectivamente: ");
                dia = sc.nextInt();
                mes = sc.nextInt();
                ano = sc.nextInt();
                
                pessoas[i] = new Pessoa(nome, peso, altura);
                pessoas[i].setDataNascimento(dia, mes, ano);

                if(nomeAnterior != null && nomeAnterior.equals(nome)) {
                    break;
                }

                nomeAnterior = nome;
                
                i++;
            }

            for(i = 0; i < 10; i++){
                
                System.out.println("\nNome: " + pessoas[i].getNome());
                System.out.println("\nAltura: " + pessoas[i].getAltura());
                System.out.println("\nPeso: " + pessoas[i].getPeso());
                System.out.println("\nData de Nascimento: " + pessoas[i].getDataNascimento().getDia() + " / " + pessoas[i].getDataNascimento().getMes() + " / " + pessoas[i].getDataNascimento().getAno());
                System.out.println("\nIdade: " + pessoas[i].calcularIdade());
                System.out.println("\nIMC: " + pessoas[i].calcularIMC());
                System.out.println("\nNivel Obesidade: " + pessoas[i].informaObesidade());


            }





    }
}
