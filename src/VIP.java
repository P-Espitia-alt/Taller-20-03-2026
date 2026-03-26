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

    @Override
    public String toString() {
        return "VIP{" +
                "Años de Fidelidad=" + aniosFidelidad +
                ", nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }
    public void mostrarInfo(double costoFinal) {
        System.out.println("Paciente{" +
                "Años de Fidelidad=" + aniosFidelidad +
                "Nombre:'" + nombre + '\'' +
                ", documento: " + documento +
                ", Costo Consulta: " + costoConsulta +
                ", Costo Final: " + costoFinal
        );
    }
    public double calcularCostoFinal(){
        double descuento;
        double total;
        if(this.aniosFidelidad==10) {
            descuento=(0.4);
        } else if (this.aniosFidelidad==5) {
            descuento=(0.3);
        } else {
            descuento=(0.2);
        }
        if (this.costoConsulta>300000) {
            return this.costoConsulta=300000;
        }
        total = this.costoConsulta-(this.costoConsulta*descuento);
        return total;
    }
}
