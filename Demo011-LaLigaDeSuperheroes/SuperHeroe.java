import java.util.*;

public class SuperHeroe
{
    private ArrayList<Poder> superPoderes;
    
    public ArrayList<Poder> getSuperPoderes(){
        return superPoderes;
    }
    private void setSuperPoderes(ArrayList<Poder> valor){
        superPoderes = valor;
    }
    
    public SuperHeroe()
    {
        setSuperPoderes(new ArrayList<Poder>());
    }
    
    public void atacar(){
        System.out.println("atacar...");
    }
    
     public void defender(){
        System.out.println("defender...");
    }


}

