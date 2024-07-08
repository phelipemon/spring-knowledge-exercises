import java.time.LocalTime;

public class Horarios {

    public static void main(String[] args) {
        LocalTime hoje = LocalTime.now();
        System.out.println(hoje);

        //Agora, vamos criar um novo horário para representar as horas em que Alice nasceu:
        LocalTime aniversarioHoraAlice = LocalTime.of(22, 33, 15);
        System.out.println(aniversarioHoraAlice);
    }
}