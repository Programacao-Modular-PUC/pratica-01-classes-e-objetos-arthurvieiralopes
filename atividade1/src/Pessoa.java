public class Pessoa {

        // Atributos

        private String nome;
        private String sobrenome;
        private int idade;
        private double altura;
        private double peso;
        private double IMC;

        // Métodos

        public double calculaIMC(double peso, double altura){

                this.peso = peso;
                this.altura = altura;
                IMC = peso / Math.pow(altura, 2);
                return IMC;

        }

        public String informaObesidade(){

                if(IMC < 18.5)
                        return "Abaixo do peso";
                
                if(IMC >= 18.5 && IMC <= 24.9)
                        return "Peso normal";

                if(IMC >= 25 && IMC <= 29.9)
                        return "Sobrepeso";

                if(IMC >= 30 && IMC <= 34.9)
                        return "Obesidade grau 1";

                if(IMC >= 35 && IMC <= 39.9)
                        return "Obesidade grau 2";

                if(IMC >= 40)
                        return "Obesidade grau 3";
      

        }


        
        

       





}
