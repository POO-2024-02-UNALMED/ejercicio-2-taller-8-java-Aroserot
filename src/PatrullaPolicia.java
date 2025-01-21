class PatrullaPolicia extends Sedan implements Emergencia {
    // Constructor
    public PatrullaPolicia(String nombre, short maxPasajeros, int maxVelocidad) {
        super(nombre, maxPasajeros, maxVelocidad);
    }

    @Override
    public String sonarSirena() {
        return "Sirena sonando...";
    }

    @Override
    public int getVolumen() {
        return VOLUMEN;
    }

    @Override
    public void setVolumen() {
        Emergencia.VOLUMEN++; // Esto genera un error porque VOLUMEN es una constante (final).
    }

    @Override
    public String toString() {
        return "PatrullaPolicia{" + "nombre='" + getNombre() + '\'' +
                ", maxPasajeros=" + getMaxPasajeros() +
                ", maxVelocidad=" + getMaxVelocidad() +
                ", numeroRuedas=" + getNumeroRuedas() + '}';
    }
}
