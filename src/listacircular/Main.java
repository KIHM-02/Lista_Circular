package listacircular;
/**
 * @author Kevin Huerta 22310411
 */

public class Main 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        
        /*
        lista.begin(1);
        lista.begin(2);
        lista.begin(3);
        lista.begin(4);
        
        lista.showData();
        
        System.out.println("--");
        
        //lista.deleteBegin();
        
        lista.showData();
        
        System.out.println("--");
        */
        
        /*
        lista.last(1);
        lista.last(2);
        lista.last(3);
        lista.last(4);
        
        lista.showData();
        
        System.out.println("--");
        
        lista.begin(0);
        lista.last(5);
        
        System.out.println("--");
        
        lista.showData();
        
        System.out.println("---");
        
        lista.deleteLast();
        lista.last(6);                                                          //comprobamos que la lista sigue funcionando
        lista.begin(-1); 
        
        lista.showData();
        
        */
        
        
        lista.last(1);
        lista.last(2);
        lista.last(3);
        lista.last(4);
        
        lista.showData();
        
        System.out.println("--");
        
        lista.middle(0);
        
        System.out.println("--");
        
        lista.showData();
        lista.deleteMiddle();
        lista.begin(-1);                                                        //Aqui compruebo que siga funcionando los demás
        lista.last(10);
        
        System.out.println("--");
        
        lista.showData();
    }
}

