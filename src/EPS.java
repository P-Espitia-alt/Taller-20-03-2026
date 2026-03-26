public class EPS extends Paciente{
    private String nombreEPS;

    public EPS() {
    }

    public EPS(String nombre, int documento, double costoConsulta, String nombreEPS) {
        super(nombre, documento, costoConsulta);
        this.nombreEPS = nombreEPS;
    }

    public String getNombreEPS() {
        return nombreEPS;
    }

    public void setNombreEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    @Override
    public String toString() {
        return "EPS{" +
                "nombreEPS='" + nombreEPS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }
    public void mostrarInfo(double costoFinal) {
        System.out.println("Paciente{" +
                "EPS='" + nombreEPS + '\'' +
                "Nombre:'" + nombre + '\'' +
                ", documento: " + documento +
                ", Costo Consulta: " + costoConsulta +
                ", Costo Final: " + costoFinal
        );
    }
    @Override
    public double calcularCostoFinal(){
        double porcentaje=0;
        if(this.costoConsulta==300000 ) {
            porcentaje=(0.25);
        } else if (this.costoConsulta==80000) {
            porcentaje=(0.2);
        }else {
            porcentaje=(0.3);
        }
        double copago= (this.costoConsulta*porcentaje);
        if(esConsultaCostosa()==true){
            double descuento = copago*0.05;
            copago=copago-descuento;
        }

        return copago;
    }



}
