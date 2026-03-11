public class TrianguloRetangulo {
        
        //Atributos
        private double c1;
        private double c2;
        private double h;


        //Métodos
        public void setCateto1(double c1){
                this.c1 = c1;
        }

        public void setCateto2(double c2){
                this.c2 = c2;
        }

        public double getCateto1(){
                return c1;
        }

        public double getCateto2(){
                return c2;
        }


        public double calcularHipotenusa(){
               
                h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
                return h;
                
        }

        public double calcularArea(){

                return (c1 * c2)/2;

        }





}
