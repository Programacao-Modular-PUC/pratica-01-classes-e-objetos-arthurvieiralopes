public class Pessoa {

        // Atributos

        private String nome;
        private String sobrenome;
        private int idade;
        private double altura;
        private double peso;
        private double IMC;

        // Métodos
        public Pessoa() {
        
        }

        public Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
                this.nome = nome;
                this.sobrenome = sobrenome;
                this.idade = idade;
                this.altura = altura;
                this.peso = peso;
        }

        public String getNome(){
                return nome;
        }

        public String getSobrenome(){
                return sobrenome;
        }

        public int getIdade(){
                return idade;
        }

        public double getAltura(){
                return altura;
        }

        public double getPeso(){
                return peso;
        }

        public void setNome(String nome){
                this.nome = nome;
        }

        public void setSobrenome(String sobrenome){
                this.sobrenome = sobrenome;
        }

        public void setIdade(int idade){
                this.idade = idade;
        }

        public void setPeso(double peso){
                this.peso = peso;
        }

        public void setAltura(double altura){
                this.altura = altura;
        }

        public double calculaIMC(double peso, double altura){

                this.peso = peso;
                this.altura = altura;
                IMC = peso / Math.pow(altura, 2);
                return IMC;

        }

        public String informaObesidade() {

                if (IMC < 18.5) {
                        return "Abaixo do peso";
                } else if (IMC >= 18.5 && IMC <= 24.9) {
                        return "Peso normal";
                 } else if (IMC >= 25 && IMC <= 29.9) {
                        return "Sobrepeso";
                } else if (IMC >= 30 && IMC <= 34.9) {
                        return "Obesidade grau 1";
                } else if (IMC >= 35 && IMC <= 39.9) {
                        return "Obesidade grau 2";
                 } else { 
                        return "Obesidade grau 3";
                }
        }


        
        

       





}
