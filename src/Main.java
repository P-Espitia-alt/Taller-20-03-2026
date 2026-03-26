import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        List<Paciente> pacienteList = new ArrayList<>();

        while (true){
            System.out.println("1. Registrar Paciente Particular "+'\n'+
                    "2. Registrar Paciente EPS "+'\n'+
                    "3. Registrar Paciente VIP"+'\n'+
                    "4. Buscar Paciente por documento"+'\n'+
                    "5. Mostrar Todos Los Pacientes"+'\n'+
                    "6. Mostrar Pacientes Por Tipo"+'\n'+
                    "7. Calcular Costo"+'\n'+
                    "8. Pacientes consulta costosa"+'\n'+
                    "9. Paciente que mas pago"+'\n'+
                    "10. Salir");
            System.out.println();
            int op0= tc.nextInt();
            if (op0==10){
                break;
            }
            switch (op0){
                case 1:
                    tc.nextLine();
                    System.out.println("Paciente Particular");
                    System.out.println("Nombre");
                    String n1=tc.nextLine();
                    System.out.println("Documento");
                    int doc=tc.nextInt();
                    System.out.println("Costo Consulta");
                    double cC= tc.nextDouble();
                    Paciente pP= new Particular(n1, doc, cC);
                    pacienteList.add(pP);

                    break;
                case 2:
                    tc.nextLine();
                    System.out.println("Paciente EPS");
                    System.out.println("Nombre");
                    String nE=tc.nextLine();
                    System.out.println("Documento");
                    int docE=tc.nextInt();
                    System.out.println("Costo Consulta");
                    double cCE= tc.nextDouble();
                    tc.nextLine();
                    System.out.println("Nombre de su EPS");
                    String nEPS=tc.nextLine();

                    Paciente pE= new EPS(nE, docE, cCE, nEPS);
                    pacienteList.add(pE);
                    break;
                case 3:
                    tc.nextLine();
                    System.out.println("Paciente VIP");
                    System.out.println("Nombre");
                    String nV=tc.nextLine();
                    System.out.println("Documento");;
                    int docv=tc.nextInt();
                    System.out.println("Costo Consulta");
                    double cCv= tc.nextDouble();
                    System.out.println("Años de Fidelidad");
                    int anF0 =tc.nextInt();
                    Paciente pV= new VIP(nV, docv, cCv, anF0);
                    pacienteList.add(pV);
                    break;
                case 4:
                    System.out.println("Documento del Paciente:");;
                    int buscar= tc.nextInt();
                    int c=0;
                    for(Paciente p : pacienteList){
                        if(p.getDocumento() == buscar){
                            System.out.println(p.toString());
                            c++;
                            break;
                        }
                    }
                    if (c==0){
                        System.out.println("No Encontrado :(");
                    }
                    break;
                case 5:

                    for(Paciente p : pacienteList){
                        System.out.println(p.toString());
                        System.out.println(p.calcularCostoFinal());
                    }
                    break;
                case 6:
                    while (true){
                        System.out.println("1. Paciente Particular "+'\n'+
                                "2. Paciente EPS "+'\n'+
                                "3. Paciente VIP"+'\n'+
                                "0. Salir");
                        int op1= tc.nextInt();
                        if (op1==0){
                            System.out.println("Volviendo al menu principal...");
                            break;
                        }
                        switch (op1){
                            case 1:
                                System.out.println("1. Paciente Particular ");
                                    for(Paciente p : pacienteList){
                                        if(p instanceof Particular){
                                            System.out.println(p);

                                        }
                                    }
                                break;
                            case 2:
                                System.out.println("2. Paciente EPS ");
                                    for(Paciente p : pacienteList){
                                        if(p instanceof EPS){
                                            System.out.println(p.toString());
                                            break;
                                        }
                                    }
                                break;
                            case 3:
                                System.out.println("3. Paciente VIP");
                                    for(Paciente p : pacienteList){
                                        if(p instanceof VIP){
                                            System.out.println(p.toString());
                                            break;
                                        }
                                    }
                                break;
                            default:
                                System.out.println("Opcion invalida"+'\n'+
                                        "Intentelo mas tarde. Volviendo al menu principal...");
                                break;

                        }
                    }
                    break;
                case 7:
                    System.out.println("7. Calcular Costo");
                    System.out.println("Documento del Paciente:");
                    int ced= tc.nextInt();
                    for(Paciente p : pacienteList){
                        if(p.getDocumento()==ced){
                            System.out.println("Costo Final:"+p.calcularCostoFinal());
                            System.out.println(p.toString());
                        }
                    }
                    break;
                case 8:
                    System.out.println("Pacientes con consultas Costosas");
                    int j=0;
                    for(Paciente p : pacienteList){
                        if(p.esConsultaCostosa() == true){
                            System.out.println(p.toString());
                            j++;
                        }
                    }
                    if (j==0){
                        System.out.println("No hay pacientes que superen los 300000 de pago");
                    }
                    break;
                case 9:
                    double mayor=pacienteList.get(0).calcularCostoFinal();
                    int mayorValor=0;
                    for (int i = 0; i < pacienteList.size(); i++) {
                        double costoC=pacienteList.get(i).calcularCostoFinal();
                        if (costoC > mayor) {
                            mayor=costoC;
                            mayorValor=i;
                        }
                    }
                    System.out.println("El paciente que mas paga es:");
                    System.out.println(pacienteList.get(mayorValor).toString());
                    break;
                default:
                    System.out.println("Opcion invalida"+'\n'+
                            "Intentelo de nuevo");
                    break;
            }
        }

    }
}