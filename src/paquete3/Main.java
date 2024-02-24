
package paquete3;


public class Main {

    public static void main(String[] args) {
        int acum = 0, numl = 1, num2= 2, i = 0, cant, acumpar = 0, buscar, marca = 0;
        System.out.println("Cuantos elemenos quiere");
        cant = Leer.datoInt();
        System.out.println("ingrese el numero a buscar");
        buscar = Leer.datoInt();
        System.out.println(numl);
        System.out.println(num2);
        acum = numl + num2;
        System.out.println(acum);
        for (i = 1; i < cant; i++) {
            acum = acum * 2;
            System.out.println(acum);
            if(acum == buscar) {
                marca = 7;
            }
            if (acum % 2 == 0) {
                acumpar = acumpar + acum;
            }
        }
        acumpar += 2;
        System.out.println("el acumulado par es " + acumpar );
        if (marca == 7 ) {
            System.out.println("si esta");
        } else {
            System.out.println("no esta");
        }
    }
}
