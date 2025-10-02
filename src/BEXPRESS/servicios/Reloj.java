package BEXPRESS.servicios;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Reloj {
    private static final Locale ES = new Locale("es", "ES");

    public static String ahoraFechaHora() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", ES);
        return LocalDateTime.now().format(fmt);
    }
}
