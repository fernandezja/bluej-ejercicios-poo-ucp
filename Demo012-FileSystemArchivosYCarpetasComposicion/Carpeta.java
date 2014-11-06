import java.util.*;

public class Carpeta
    extends ItemBase
{
    
    private ArrayList<ItemBase> items;
    public ArrayList<ItemBase> getItems(){
        return items;
    }
    public void setItems(ArrayList<ItemBase> valor){
        items = valor;
    }
    
    
    public int getTamanio(){
        int total = 0;
        
        for(ItemBase item: getItems()){        
           total = total + item.getTamanio();
        }
        
        return total + 10;
    }
    
    
    public Carpeta(){
        setItems(new ArrayList<ItemBase>());
    }

}
