public class Particular extends Paciente{
    public Particular() {
    }

    public Particular(String nombre, int documento, double costoConsulta) {
        super(nombre, documento, costoConsulta);
    }

    @Override
    public String toString() {
        return "Particular{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }

    @Override
    public void mostrarInfo(double costoFinal) {
        super.mostrarInfo(costoFinal);
    }

    @Override
    public double calcularCostoFinal(){
        double total;
        if(this.costoConsulta==400000) {
            return total=(this.costoConsulta*0.15);
        } else if (this.costoConsulta==200000) {
            return total=(this.costoConsulta*0.1);
        } else if (this.costoConsulta==50000) {
            return total=(this.costoConsulta*0.05);
        } else {
            return this.costoConsulta;
        }
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return super.aplicarDescuento(porcentaje);
    }
}
