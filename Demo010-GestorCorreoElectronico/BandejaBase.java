import java.util.*;

public abstract class BandejaBase
{
    private ArrayList<Email> correos;
    
    public ArrayList<Email> getCorreos(){
        return correos;
    }
    public void setCorreos(ArrayList<Email> valor){
        correos = valor;
    }
    
    
    public BandejaBase()
    {
        setCorreos(new ArrayList<Email>()); 
    }

    
}
