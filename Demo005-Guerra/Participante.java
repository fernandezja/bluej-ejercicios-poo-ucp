

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
    //Disparar, metodo asbtracto (de clase) 
    //para ser implementado en cada subclase
    public abstract void disparar(Participante enemigo);
        
    
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
