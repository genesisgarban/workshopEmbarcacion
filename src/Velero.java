class Velero extends Embarcacion implements Validacion {
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public double calcularMontoAlquiler() {
        return super.calcularMontoAlquiler();
    }

    @Override
    public boolean validar() {
        return cantidadMastiles > 4;
    }
}
