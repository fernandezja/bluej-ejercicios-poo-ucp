import java.util.*;

public class LaLiga
{
    private ArrayList<SuperHeroe> socios;
    
    public ArrayList<SuperHeroe> getSocios(){
        return socios;
    }
    private void setSocios(ArrayList<SuperHeroe> valor){
        socios = valor;
    }
    
    public LaLiga()
    {
        setSocios(new ArrayList<SuperHeroe>());
    }

}
