import java.util.Calendar;

public class Pessoa {

    private Data dataNascimento = new Data();
    private String nome;
    private double peso, altura, IMC;
    
    public Pessoa(){

    }

    public Pessoa(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public double getPeso(){
        return peso;
    }
    
    public double getAltura(){
        return altura;
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void setDataNascimento(int dia, int mes, int ano){

        dataNascimento.setDia(dia);
        dataNascimento.setMes(mes);
        dataNascimento.setAno(ano);

    }

    public Data getDataNascimento(){
        return dataNascimento;

    }
    
    public int calcularIdade(){

        Calendar hoje = Calendar.getInstance();

    
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH);
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        int anoNascimento = dataNascimento.getAno();
        int mesNascimento = dataNascimento.getMes();
        int diaNascimento = dataNascimento.getDia();

        int idade =  anoAtual - anoNascimento;

        if(mesAtual + 1 < mesNascimento){
            idade--;
            return idade;
        }else if(mesAtual + 1 == mesNascimento && diaAtual < diaNascimento){
            idade--;
            return idade;
        }else{
            return idade;
        }

    }

    public double calcularIMC(){

        IMC = peso/(Math.pow(altura, 2));
        return peso/(Math.pow(altura, 2));

    }

    public String informaObesidade(){

        if(IMC < 18.5){
                
            return "Abaixo do peso";

        }else if(IMC >= 18.5 && IMC <= 24.9){

            return "Peso normal";
        
        }else if(IMC >= 25 && IMC <= 29.9){

            return "Sobrepeso";
        
        }else if(IMC >= 30 && IMC <= 34.9){

            return "Obesidade grau 1";
        
        }else if(IMC >= 35 && IMC <= 39.9){

            return "Obesidade grau 2";
        
        }else{
            
            return "Obesidade grau 3";
        
        }

    }
}
