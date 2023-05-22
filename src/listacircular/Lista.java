package listacircular;

/**
 * @author Kevin Huerta Montero 22310411
 */

public class Lista 
{
    public Nodo inicio;
    public Nodo ultimo;
    
    public Lista()
    {
        inicio = null;
        ultimo = null;
    }
    
    public boolean inicioIsEmpty()
    {
        if(inicio == null)
            return true;
        
        return false;
    }
    
    public boolean ultimoIsEmpty()
    {
        if(ultimo == null)
            return true;
        
        return false;
    }
    
    public void firstAdd(int dato)
    {
        Nodo nuevo = new Nodo(dato, null);
        inicio = nuevo;
        System.out.println("Se agrego el dato "+dato+" en Inicio");
    }
    
    public void begin(int dato)
    {
        Nodo nuevo;
        
        if(inicioIsEmpty())
        {
            firstAdd(dato);
        }
        else
        {
            if(ultimoIsEmpty())
            {
                nuevo = new Nodo(dato, inicio);
                inicio.setSiguiente(nuevo);                                     //aqui apunto a nuevo
                ultimo = inicio;                                                //indico el final del 
                inicio = nuevo;
                System.out.println("Se agrego el dato "+dato+" al nuevo inicio");
            }
            else
            {
                nuevo = new Nodo(dato, inicio);
                ultimo.setSiguiente(nuevo);                                     //aqui apunto a nuevo desde el ultimo, porque nunca cambia
                inicio = nuevo;                                                 //el nuevo valor será el inicio
                System.out.println("Se agrego el dato "+dato);
            }
        }
    }
    
    public void deleteBegin()
    {
        if(inicioIsEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            if(ultimoIsEmpty())
            {
                inicio = null;
            }
            else
            {
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            }
        }
    }
    
    public void showData()
    {
        Nodo temporal = inicio;
        
        if(inicioIsEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            if(ultimoIsEmpty())
            {
                System.out.println(" "+temporal.getDato());
            }
            else
            {
                while(temporal != ultimo)
                {
                    System.out.println(" "+temporal.getDato());
                    temporal = temporal.getSiguiente();
                }
                System.out.println(" "+ultimo.getDato());
            }
        }
    }
    
    // Seccion agregar al final
    
    public void last(int dato)
    {
        Nodo nuevo;
        
        if(inicioIsEmpty())
        {
            firstAdd(dato);
        }
        else
        {
            if(ultimoIsEmpty())
            {
                nuevo = new Nodo(dato, inicio);
                inicio.setSiguiente(nuevo);
                ultimo = nuevo;
                System.out.println("Se agrego el dato "+dato+" al final");
            }
            else
            {
                nuevo = new Nodo(dato, inicio);
                ultimo.setSiguiente(nuevo);
                ultimo = nuevo;
                System.out.println("Se agrego el dato "+dato+" al nuevo final");
            }
        }
    }
    
    public void deleteLast()
    {
        Nodo temporal, nuevo;
        
        if(inicioIsEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            if(ultimoIsEmpty())
            {
                inicio = null;
            }
            else
            {
                temporal = inicio;
                nuevo = inicio;
                
                while(temporal != ultimo)
                {
                    nuevo = temporal;
                    temporal = temporal.getSiguiente();
                }
                
                ultimo.setSiguiente(null);
                nuevo.setSiguiente(inicio);
                ultimo = nuevo;
            }
        }
    }
    
}
