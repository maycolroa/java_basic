package paquete4;

public class Main {

    public static void main(String[] args) {
        
        int opcion, ciclo = 5, i = 4;

        while (ciclo == 5) {
            System.out.println("Menu Principal");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. salir");

            System.out.println("Ingrese la opcion");
            opcion = Leer.datoInt();
            
            switch (opcion) {
                
                case 1:
                    Ejercicio1 obj1 = new Ejercicio1();
                    obj1.uno();
                    break;
                case 2:
                    Ejercicio2 obj2 = new Ejercicio2();
                    obj2.dos();
                    break;
                case 3:
                    Ejercicio3 obj3 = new Ejercicio3();
                    obj3.tres();
                    break;
                case 4:
                    System.out.println("selecciono la opcion 4");
                    ciclo=7;
                    break;
                default:
                    i--;
                    System.out.println("Le quedan" + " " + i + " " + "oportunidades ");
                    
                    if (i == 0) {
                        ciclo = 7;
                        System.out.println("gracias.....");
                    }
            }

        }

    }
}
