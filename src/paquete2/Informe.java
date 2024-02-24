
package paquete2;

public class Informe {
    public void salida () {
        Auto obj1 = new Auto();
        Comparendos obj2 = new Comparendos();
        Propietario obj3 = new Propietario();
        
        System.out.println("ingrese el nuemrro de la placa");
        obj1.Placa = Leer.dato();
        
        System.out.println("ingrese el modelo" );
        obj1.setModelo(Leer.datoInt());
        
        System.out.println("ingrese la marca ");
        obj1.setMarca(Leer.dato());
        
        System.out.println("ingrese el nombre del propietario");
        obj3.Nombre = Leer.dato();
        
        System.out.println("ingrese la direccion ");
        obj3.setDireccion(Leer.dato());
        
        System.out.println("ingrese causa ");
        obj2.Causa = Leer.dato();
        
        System.out.println("ingrese la informacion de la multa");
        obj2.setMulta(Leer.datoInt());
        
        System.out.println("El numero de placa es  " + obj1.Placa);
        System.out.println("El modelo es " + obj1.getModelo());
        System.out.println("la marca es " + obj1.getModelo());
        
        System.out.println("El nombre del propietario es " + obj3.Nombre);
        System.out.println("La direccion es " + obj3.getDireccion());
        
        System.out.println("La causa es " + obj2.Causa);
        System.out.println("La multa es" + obj2.getMulta());
        
    }
    
}
