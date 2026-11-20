
public abstract class EstrategiaEnvio {

    protected double tarifaBase;

    public EstrategiaEnvio(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularCosto(double pesoKg, double distanciaKm);

    protected void validarDatos(double pesoKg, double distanciaKm) {

        if (pesoKg < 0) {
            throw new IllegalArgumentException("El peso no puede ser negativo.");
        }

        if (distanciaKm < 0) {
            throw new IllegalArgumentException("La distancia no puede ser negativa.");
        }
    }
}
