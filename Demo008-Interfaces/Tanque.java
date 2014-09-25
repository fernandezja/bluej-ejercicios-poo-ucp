
public class Tanque
                extends Participante
{
    
    int largoCanion;
    public int getLargoCanion()
    {
       return this.largoCanion;
    }
    
    private void setLargoCanion(int valor)
    {
       this.largoCanion = valor;
    }
    
    
    public Tanque(String nombre)
    {
       super(nombre);
       this.setLargoCanion(3);
    }
    
    public Tanque(String nombre, int largoCanion)
    {
       super(nombre);
       this.setLargoCanion(largoCanion);
       
    }
    
    public String toString(){
        return super.toString() 
                + " (Lago cañon: " 
                + this.getLargoCanion() 
                + ")";
    }
    
    
}
