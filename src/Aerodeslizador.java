class Aerodeslizador implements VehiculoTierra, VehiculoAgua {
    private String nombre;
    private short maxPasajeros;
    private int maxVelocidad;
    private int numeroRuedas;
    private String tipoAmarras;

    // Constructor por defecto
    public Aerodeslizador() {
        this("Aerodeslizador Predeterminado", (short) 6, 150, 2, "Amarras Predeterminadas");
    }

    // Constructor con parámetros
    public Aerodeslizador(String nombre, short maxPasajeros, int maxVelocidad, int numeroRuedas, String tipoAmarras) {
        this.nombre = nombre;
        this.maxPasajeros = maxPasajeros;
        this.maxVelocidad = maxVelocidad;
        this.numeroRuedas = numeroRuedas;
        this.tipoAmarras = tipoAmarras;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    @Override
    public int getMaxVelocidad() {
        return maxVelocidad;
    }

    @Override
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    @Override
    public void agregarRuedas(int numeroRuedas) {
        this.numeroRuedas += numeroRuedas;
    }

    @Override
    public String conducir() {
        return "Conduce el Aerodeslizador: " + nombre;
    }

    @Override
    public String soltarAmarras() {
        return "Amarras sueltas: " + tipoAmarras;
    }
}
