
public class Tanque
{
    private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    
    private int vida;
    public int getVida(){
        return vida;
    }
    public void setVida(int valor){
        vida = valor;
    }
    
    public Tanque()
    { 
      
    }

    public boolean estaVivo(){
           return (getVida() > 0);
    }
   
}
