
public class EnvioMaritimo extends EstrategiaEnvio {

    public EnvioMaritimo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesoKg, double distanciaKm) {

        validarDatos(pesoKg, distanciaKm);

        return tarifaBase + (pesoKg * 80) + (distanciaKm * 3);
    }
}
