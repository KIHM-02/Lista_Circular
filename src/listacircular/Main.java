package listacircular;
/**
 * @author Kevin Huerta 22310411
 */

public class Main 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        
        lista.begin(1);
        lista.begin(2);
        lista.begin(3);
        lista.begin(4);
        
        lista.showBegin();
        lista.deleteBegin();
        
        System.out.println("----");
        
        lista.showBegin();
    }
}

