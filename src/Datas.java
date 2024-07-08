import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class Datas {

    public static void main(String[] args) {

        String pattern = "E, dd MMM yyyy HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        //LocalDate para criar a data atual, a de hoje:
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        //criar uma nova data para representar a data de um aniversário. pacote java.time.month
        LocalDate aniversarioAlice = LocalDate.of(2005, Month.SEPTEMBER, 15);
        System.out.println(aniversarioAlice);

        int idade =  hoje.getYear() - aniversarioAlice.getYear();
        System.out.println(idade);

        //descobrir a diferença de dias e meses. Utilizar a classe Period - a diferença entre duas datas podemos utilizar seu método between
        Period periodo = Period.between(hoje, aniversarioAlice);
        System.out.println(periodo);


    }
}
