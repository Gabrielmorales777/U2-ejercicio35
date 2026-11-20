
public class Envio {

    private double pesoKg;
    private double distanciaKm;
    private EstrategiaEnvio estrategia;

    public Envio(double pesoKg, double distanciaKm, EstrategiaEnvio estrategia) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.estrategia = estrategia;
    }

    public double calcularCosto() {
        return estrategia.calcularCosto(pesoKg, distanciaKm);
    }
}
