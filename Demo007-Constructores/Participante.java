
public class Participante
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
    
    
    
   //Constructor
    public Participante(String nombre)
    {
       this.setNombre(nombre);
    }

    public String toString(){
        return "NOMBRE:" + this.getNombre();
    }
    
    
    
}
