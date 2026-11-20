
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EstrategiaEnvio estandar = new EnvioEstandar(500);
        EstrategiaEnvio aereo = new EnvioExpresoAereo(1000);
        EstrategiaEnvio maritimo = new EnvioMaritimo(700);

        List<Envio> envios = new ArrayList<>();

        envios.add(new Envio(10, 100, estandar));
        envios.add(new Envio(10, 100, aereo));
        envios.add(new Envio(100, 500, maritimo));

        System.out.println("=== COSTOS DE ENVIO ===");

        for (int i = 0; i < envios.size(); i++) {

            double costo = envios.get(i).calcularCosto();

            System.out.println("Envio " + (i + 1) + ": $" + costo);
        }
    }
}
