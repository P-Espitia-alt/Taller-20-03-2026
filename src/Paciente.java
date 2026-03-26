public class Paciente {
    protected String nombre;
    protected int documento;
    protected double costoConsulta;

    public Paciente() {
    }

    public Paciente(String nombre, int documento, double costoConsulta) {
        this.nombre = nombre;
        this.documento = documento;
        this.costoConsulta = costoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }

    public double aplicarDescuento(double porcentaje){
        double percent=porcentaje/100;
        double calcularDescuento= (this.costoConsulta*percent);
        this.costoConsulta = (this.costoConsulta-calcularDescuento);
        return  this.costoConsulta;
    }

    public double aplicarRecargo(double porcentaje){
        double percent=porcentaje/100;
        double calcularRecargo= (this.costoConsulta*percent);
        this.costoConsulta= (this.costoConsulta+calcularRecargo);
        return this.costoConsulta;
    }
//revisar
    public boolean esConsultaCostosa(){

        if (this.costoConsulta>300000){
            return true;
        }else {
            return false;
        }
    }

    public double calcularCostoFinal(){
        double costoFinal = (this.costoConsulta);
        return 0;
    }

    public void mostrarInfo(double costoFinal){
        System.out.println( "Paciente{" +
                "Nombre:'" + nombre + '\'' +
                ", documento: " + documento +
                ", Costo Consulta: " + costoConsulta +
                ", Costo Final: "+ costoFinal
                );
    }

}
