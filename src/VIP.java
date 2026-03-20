public class VIP extends Paciente{
    private int aniosFidelidad;

    public VIP() {
    }

    public VIP(int aniosFidelidad) {
        this.aniosFidelidad = aniosFidelidad;
    }

    public VIP(String nombre, int documento, double costoConsulta, int aniosFidelidad) {
        super(nombre, documento, costoConsulta);
        this.aniosFidelidad = aniosFidelidad;
    }

    public int getAniosFidelidad() {
        return aniosFidelidad;
    }

    public void setAniosFidelidad(int aniosFidelidad) {
        this.aniosFidelidad = aniosFidelidad;
    }


}
