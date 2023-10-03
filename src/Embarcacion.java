class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler() {
        double montoAlquiler = precioBase;
        if (anioFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }
}
