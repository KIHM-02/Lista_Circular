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
            
            System.out.println("Se ha eliminado el dato");
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
            
            System.out.println("Se ha eliminado el dato");
        }
    }
    
    // Seccion agregar en medio
    
    public void middle(int dato)                                                //Middle solo funciona si n > 3
    {
        Nodo walker, nuevo;
        int counter;
        
        counter = objects_in_list();
        
        if(counter < 3)
        {
            System.out.println("Primero agrega "+(3-counter)+" datos a la lista");
        }
        else
        {
            walker = inicio;
            counter = counter/2;
            
            for(int move_foward = 1; move_foward < counter; move_foward++)
                walker = walker.getSiguiente();
            
            nuevo = new Nodo(dato, walker.getSiguiente());
            walker.setSiguiente(nuevo);
            
            System.out.println("Se agrego el dato "+dato+" en medio");
        }
    }
    
    public int objects_in_list()                                                //Este metodo cuenta cuantos objetos hay en la lista
    {
        Nodo walker = inicio; 
        int contador = 0;
        
        if(inicioIsEmpty())
        {
            return contador;
        }
        else
        {
            contador = 1;

            while(walker != ultimo)
            {
                contador++;
                walker = walker.getSiguiente();
            }
            
            return contador;
        }
    }
    
    public void deleteMiddle()
    {
        Nodo walker, temporal;
        int counter;
        
        counter = objects_in_list();
        
        if(counter < 3)
        {
            System.out.println("No puedo borrar menos de 3 datos");
        }
        else
        {
            walker = inicio;
            counter = counter/2;
            
            for(int move_foward = 1; move_foward < counter; move_foward++)
                walker = walker.getSiguiente();
            
            temporal = walker.getSiguiente();
            
            walker.setSiguiente(temporal.getSiguiente());
            temporal.setSiguiente(null);
            
            System.out.println("Se ha eliminado el dato");
        }
    }
    
    // Buscar datos especificos
    
    public void findData(int dato)
    {
        Nodo temporal;
        int posicion = 1;
        
        if(inicioIsEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            temporal = inicio;
            
            while(temporal.getDato() != dato)
            {
                posicion++;
                temporal = temporal.getSiguiente();
                
                if(temporal == null)
                    break;
            }
            
            if(posicion == 0)
            {
                System.out.println("El dato no se encuentra en la lista");
            }
            else
            {
                System.out.println("La posicion del dato "+dato+" es "+posicion);
            }
        }
        
    }
    
}
