
public class Principal
{
   public static void main(String[] args){
    
       Tanque t1;
       Tanque t2;

       //t1 = new Tanque(); //error de constructor
              
       t2 = new Tanque("Tanque 2");
       
       Tanque t3 = new Tanque("Tanque 3", 10);
       
       
       //System.out.println(t1.toString());
       System.out.println(t2.toString());
       System.out.println(t3.toString());
    
    }
}
