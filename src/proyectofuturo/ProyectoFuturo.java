package proyectofuturo;
public class ProyectoFuturo {

    public static void main(String[] args) {
        int valor1 = Integer.parseInt(args[1]);
        int valor2 = Integer.parseInt(args[2]);
        //Mi nombre es francisco javier riquelme sanchez
        System.out.println("Estudiante " + args[0] + " : ");
        System.out.println(veredicto(valor1,valor2));
    }
    private static String veredicto (int valor1, int valor2) {
        if (valor1==(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
