
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

    public void disparar(Tanque enemigo){
        int vidaParaQuitar = 10;
        if ((enemigo.getVida()-vidaParaQuitar) < 0)
            return;
            
        enemigo.setVida(enemigo.getVida()-vidaParaQuitar);
        return;
        
    }
    
    public boolean estaVivo2(){
           return (getVida() > 0);
    }
    
    public boolean estaVivo(){
           return (getVida() > 0);
    }
   
}
