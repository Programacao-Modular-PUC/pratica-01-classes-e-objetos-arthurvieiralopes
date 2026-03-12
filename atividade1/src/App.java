import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome da pessoa: ");
            String nome = sc.nextLine();

            System.out.println("Digite o sobrenome da pessoa: ");
            String sobrenome = sc.nextLine();

            System.out.println("Digite a idade da pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Digite a altura da pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("Digite o peso da pessoa: ");
            double peso = sc.nextDouble();
            sc.nextLine(); 

            Pessoa p1 = new Pessoa(nome, sobrenome, idade, altura, peso);

            System.out.println("Nome completo: " + p1.getNome() + " " + p1.getSobrenome());
            System.out.println("Idade: " + p1.getIdade());
            System.out.println("Altura: " + p1.getAltura());
            System.out.println("Peso: " + p1.getPeso());
            System.out.println("IMC: " + p1.calculaIMC(peso, altura));
            System.out.println("Nivel Gordura: " + p1.informaObesidade());



    }
}
