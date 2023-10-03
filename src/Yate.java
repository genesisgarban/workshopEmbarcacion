class Yate extends Embarcacion implements Validacion {
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public double calcularMontoAlquiler() {
        return super.calcularMontoAlquiler();
    }

    @Override
    public boolean validar() {
        return cantidadCamarotes > 7;
    }

}