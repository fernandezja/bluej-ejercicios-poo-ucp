
public abstract class ItemBase
{
    private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    
    private int tamanio;
    public int getTamanio(){
        return tamanio;
    }
    public void setTamanio(int valor){
        tamanio = valor;
    }
   
    public ItemBase()
    {
    }
    
    public ItemBase(String nombre, int tamanio)
    {
        setNombre(nombre);
        setTamanio(tamanio);
    }
}
