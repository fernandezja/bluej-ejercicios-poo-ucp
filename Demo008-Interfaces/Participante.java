
public class Participante
        implements IParticipanteQueDispara, IParticipanteConEscudo
{
    //variable
    private String nombre;
    
    public String getNombre()
    {
       return this.nombre;
    }
    
    private void setNombre(String valor)
    {
       this.nombre = valor;
    }
    
    
    public int disparar(Participante enemigo){
        return 0;
    }
    
    public int dispararAQuemarropa(IParticipanteConEscudo enemigo){
        return 0;
    }
    
    public int protegerse(){
        return 0;
    }
    
    
    
   //Constructor
    public Participante(String nombre)
    {
       this.setNombre(nombre);
    }

    public String toString(){
        return "NOMBRE:" + this.getNombre();
    }
    
    
    
}
