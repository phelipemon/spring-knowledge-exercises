import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHorario {

    public static void main(String[] args) {
        LocalDateTime hoje = LocalDateTime.now();
        System.out.println(hoje);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(hoje.format(formatador));
    }
}