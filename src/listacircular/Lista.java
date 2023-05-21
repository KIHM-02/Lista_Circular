package listacircular;

/**
 * @author Kevin Huerta Montero 22310411
 */

public class Lista 
{
    public Nodo inicio;
    
    public Lista()
    {
        inicio = null;
    }
    
    public boolean isEmpty()
    {
        if(inicio == null)
            return true;
        
        return false;
    }
    
    public void begin(int dato)
    {
        Nodo nuevo;
        
        if(isEmpty())
        {
            nuevo = new Nodo(dato, null);
            inicio = nuevo;
            System.out.println("Se inserto el dato "+dato+" en Inicio");
        }
        else
        {
            nuevo = new Nodo(dato, inicio);
            inicio = nuevo;
            System.out.println("Se agrego el dato "+dato);
        }
    }
    
    public void showBegin()
    {
        Nodo temporal;
        
        if(isEmpty())
        {
            System.out.println("La lista está vacía");
        }
        else
        {
            temporal = inicio;
            while(temporal != null)
            {
                System.out.println(" "+temporal.getDato());
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public void deleteBegin()
    {
        Nodo temporal;
        
        if(isEmpty())
        {
            System.out.println("La lista está vacía");
        }
        else
        {
            inicio = inicio.getSiguiente();
        }
    }
    
}
