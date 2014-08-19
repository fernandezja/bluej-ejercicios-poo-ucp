

public abstract class Participante
{
    //Variables internas
    private String nombre;
    private int vida;
    
    //GEtters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    
   
    public int getVida(){
        return vida;
    }
    public void setVida(int valor){
        vida = valor;
    }
    
    
    //Comportamiento (Metodos)
    public void disparar(Participante enemigo){
        enemigo.danio(400);
    }
    
    public int danio(int valor){
        setVida(getVida() - valor);
        return getVida();
    }
    
    //Retorna si el participante se encuentra vivo
    //es decir si tiene vida
    public boolean estaVivo(){
        return (getVida()>0);
    }
    
    
    
    //Metodo "abstracto"
    public abstract String getNombreCompleto();
    
}
