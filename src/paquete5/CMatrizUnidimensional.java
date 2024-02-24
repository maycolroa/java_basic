
package paquete5;

public class CMatrizUnidimensional 
{
  // Creación de una matriz unidimensional
  public static void main(String[] args)
  {
    int nNotas, acum = 0, notasFinal = 0;
    System.out.print("Número de notas del estudiante: ");
    nNotas = Leer.datoInt();
    int[] m = new int[nNotas]; // crear la matriz m
    int i = 0; // subíndice
    
    System.out.println("Introducir los valores de la matriz.");
    for (i = 0; i < nNotas; i++)
    {
      System.out.print("m[" + i + "] = ");
      m[i] = Leer.datoInt();
      if (m[i] > 0 && m[i] < 11) {
          System.out.println("si esta");
          i--;
      }
    }
    
    // Visualizar los elementos de la matriz
    System.out.println();
    for (i = 0; i < nNotas; i++){
      System.out.print(m[i] + " ");
    }
    notasFinal = acum / nNotas;
    System.out.println("\n\nFin del proceso.");
  }
}
