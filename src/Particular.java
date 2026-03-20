public class Particular extends Paciente{
    public Particular() {
    }

    public Particular(String nombre, int documento, double costoConsulta) {
        super(nombre, documento, costoConsulta);
    }
    @Override
    public double calcularCostoFinal(){
        double total;
        if(costoConsulta==400000) {
            return total=(costoConsulta*0.15);
        } else if (costoConsulta==200000) {
            return total=(costoConsulta*0.1);
        } else if (costoConsulta==50000) {
            return total=(costoConsulta*0.05);
        } else {
            return costoConsulta;
        }
    }

}
