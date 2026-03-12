import java.util.Calendar;

public class Pessoa {

    private Data dataNascimento = new Data();
    

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
}
