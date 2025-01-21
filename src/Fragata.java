class Fragata implements VehiculoAgua {
    private String nombre;
    private short maxPasajeros;
    private int maxVelocidad;
    private String tipoAmarras;

    // Constructor por defecto
    public Fragata() {
        this("Fragata Predeterminada", (short) 100, 50, "Amarras Predeterminadas");
    }

    // Constructor con parámetros
    public Fragata(String nombre, short maxPasajeros, int maxVelocidad, String tipoAmarras) {
        this.nombre = nombre;
        this.maxPasajeros = maxPasajeros;
        this.maxVelocidad = maxVelocidad;
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
    public String soltarAmarras() {
        return "Amarras sueltas: " + tipoAmarras;
    }
}
