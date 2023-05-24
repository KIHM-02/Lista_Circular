package listacircular;
import java.util.Scanner;
/**
 * @author Kevin Huerta 22310411
 */

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Lista lista = new Lista();
        
        int opcion = 0, dato;
        
        while(opcion != 9)
        {
            System.out.println("==== Menu ====");
            System.out.println("1) Agregar datos al inicio: ");
            System.out.println("2) Agregar datos al final: ");
            System.out.println("3) Agregar datos en medio: ");
            System.out.println("4) Eliminar datos al inicio: ");
            System.out.println("5) Eliminar datos al final: ");
            System.out.println("6) Eliminar datos en medio: ");
            System.out.println("7) Mostrar datos ");
            System.out.println("8) Mostrar posicion de un dato ");
            System.out.println("9) Salir ");
            
            opcion = scan.nextInt();
            
            switch (opcion) 
            {
                case 1:
                    System.out.println("Ingrese el dato a agregar: ");
                        dato = scan.nextInt();
                    
                        lista.begin(dato);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el dato a agregar: ");
                        dato = scan.nextInt();
                        
                        lista.last(dato);
                    break;
                    
                case 3:
                    System.out.println("Ingrese el dato a agregar: ");
                        dato = scan.nextInt();
                        
                        lista.middle(dato);
                    break;
                    
                case 4:                       
                    lista.deleteBegin();
                    break;
                    
                case 5:
                    lista.deleteLast();
                    break;
                    
                case 6:
                    lista.deleteMiddle();
                    break;
                
                case 7:
                    lista.showData();
                    break;
                    
                case 8:
                    System.out.println("Ingrese el dato a buscar: ");
                        dato = scan.nextInt();
                    
                        lista.findData(dato);
                    break;    
                
                case 9:
                    System.out.println("Adios ...");
                    break;    
                
                default:
                    System.out.println("...No es una opcion valida...\n\n\n");
            }   
        }
    }
}

