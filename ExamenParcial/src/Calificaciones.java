import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        int[] notas = new int[5]; 
        int[] intervalos = new int[5];

        System.out.print("Ingrese la cantidad de notas: "); 
        int cantidadNotas = lector.nextInt();
         
        while (cantidadNotas <= 0){
          System.out.println("No puede ingresar valores menores o iguales a cero"); 
          System.out.print("Cantidad de notas:");
          cantidadNotas = lector.nextInt(); 
        }
         int[] block =  new int[cantidadNotas];
         
         for (int i = 0; i < block.length ; i++){
            System.out.print("Estudiante["+(i+1)+ "]");
            System.out.println("");
            System.out.println("Ingrese la nota de cada estudiante: ");
            notas[i] = lector.nextInt();
            if(notas[i] >=0 && notas[i] <= 59){
                intervalos[0]++;
            }else if (notas[i] >= 60 && notas[i] <= 69){
                intervalos[1]++;
            }else if (notas[i] >= 70 && notas[i] <= 79){
                intervalos[2]++;
            }else if (notas[i] >= 80 && notas[i] <= 89){
                intervalos[3]++;
            }else if (notas[i] >= 90 && notas[i] <= 100){
                intervalos[4]++;
            }
        }
          System.out.println("intervalos de puntuacion y número de estudiantes.");
          System.out.println("0-59: " +intervalos[0]+  " Estudiantes.");
          System.out.println("60-69: " +intervalos[1]+ " Estudiantes.");
          System.out.println("70-79: " +intervalos[2]+ " Estudiantes.");
          System.out.println("80-89: " +intervalos[3]+ " Estudiantes.");
          System.out.println("90-100: "+intervalos[4]+ " Estudiantes.");

          lector.close();
    }    
}
