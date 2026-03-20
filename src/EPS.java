public class EPS extends Paciente{
    public EPS() {
    }

    public EPS(String nombre, int documento, double costoConsulta) {
        super(nombre, documento, costoConsulta);
    }


    @Override
    public double calcularCostoFinal(){

        double porcentaje=0;
        if(costoConsulta==300000 ) {
            porcentaje=(0.15);
        } else if (costoConsulta==80000) {
            porcentaje=(0.1);
        } else if (costoConsulta<50000 && costoConsulta>300000) {
            porcentaje=(0.3);
        } else {
            if(esConsultaCostosa()==true){
                porcentaje= (0.05);
            }
        }
        double copago= (costoConsulta*porcentaje);

        return copago;
    }



}
