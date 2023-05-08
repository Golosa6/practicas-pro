 import java.util.Scanner;
 class Nodo {
    String info;
    Nodo next;
    
       public Nodo (){
             next = null;
       }
             public Nodo (String info){
                 this.info = info;
                 next = null;
                 
             }
             public Nodo (String info, Nodo next){
                 this.info = info;
                 this.next = next;
                 
             }
       }
 class Lista {
    Nodo primero;
    int indice;
    
      public Lista (){
          primero = null;
          indice = -1;
      }

      public void insertar (String dato){
          Nodo temp = new Nodo (dato);
          temp.next = primero;
          primero = temp;
          indice ++;
      }
      
      public void buscar (int indice){
          Nodo temp = new Nodo ();
          Nodo n = primero;
            for(int i = 0; (i < indice)&&(n!=null) ;i++){
                 n=n.next;
                 temp=n;
                 
            }
              System.out.println (temp.info);
      }
      
       public void visualizar () {
            Nodo n;
            n = primero;
            while(n!=null){
                  System.out.println(n.info);
                  n = n.next;
            }
      }
}



 public class Main {
     public static void main ( String [] args){
         Lista list = new Lista ();
         String dato ="";
        Scanner scan = new Scanner(System.in);
         while (!dato.equalsIgnoreCase("fin")){
           
              dato =  scan.nextLine();
             if(!dato.equalsIgnoreCase("fin"))
               list.insertar(dato);
         }
         list.visualizar();
     }
}