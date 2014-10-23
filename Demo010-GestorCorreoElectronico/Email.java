
public class Email
{
    private String asunto = "";
    private String contenido = "";
    private Contacto para;
    private Contacto cc;
    
    public String getAsunto(){
        return asunto;
    }
    public void setAsunto(String valor){
        asunto = valor;
    }
    
    public String getContenido(){
        return contenido;
    }
    public void setContenido(String valor){
        contenido = valor;
    }
    
    
    public Contacto getPara(){
        return para;
    }
    public void setPara(Contacto valor){
        para = valor;
    }
    
    public Contacto getCc(){
        return cc;
    }
    public void setCc(Contacto valor){
        para = cc;
    }
    
    
    public Email()
    {
    }
    
    public String toString(){
        return "Para: "
            + getPara().toString()
            + " Asunto: "
            + getAsunto()
            + " Contenido: "
            + getContenido();
    }
}
