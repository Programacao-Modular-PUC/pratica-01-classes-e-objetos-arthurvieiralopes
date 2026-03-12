import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

                double c1, c2;
        
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o valor dos catetos: ");
                
                c1 = sc.nextDouble();
                c2 = sc.nextDouble();

                TrianguloRetangulo triangulo = new TrianguloRetangulo(c1, c2);

                System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
                System.out.println("Area: " + triangulo.calcularArea());



    }
}
