

public class Contacto
{
    private String nombre = "";
    private String email = "";
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    
    
     public String getEmail(){
        return email;
    }
    public void setEmail(String valor){
        email = valor;
    }
    
    public Contacto(String nombre, String email)
    {
       setNombre(nombre);
       setEmail(email);
    }
    
     public String toString(){
        return getNombre()
            + " ("
            + getEmail()
            + " )";
    }

  
}
