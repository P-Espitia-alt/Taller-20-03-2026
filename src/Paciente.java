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
        double calcularDescuento= (getCostoConsulta()*porcentaje);
        costoConsulta = (getCostoConsulta()-porcentaje);
        return  costoConsulta;
    }

    public double aplicarRecargo(double porcentaje){
        double calcularRecargo= (getCostoConsulta()*porcentaje);
         costoConsulta= (getCostoConsulta()+calcularRecargo);
        return costoConsulta;
    }
//revisar
    public boolean esConsultaCostosa(){

        if (costoConsulta>300000){
            return true;
        }else {
            return false;
        }
    }

    public double calcularCostoFinal(){
        double costoFinal = ();
        return 0;
    }

    public void mostrarInfo(){
        System.out.println( "Paciente{" +
                "Nombre:'" + nombre + '\'' +
                ", documento: " + documento +
                ", Costo Consulta: " + costoConsulta +
                ", Costo Final: "+ this.costoConsulta
                );
    }

}
