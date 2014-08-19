
public class Avion extends Participante
{
    public String getNombreCompleto(){
        return getNombre()+" (Avion)";
    }
    
    
    public void disparar(Participante enemigo){
        
        //Ejemplo 1
        //enemigo.danio(400);
        
        //Ejemplo 2
        if(enemigo instanceof Tanque){
            enemigo.danio(600);
        }else if(enemigo instanceof Avion){
            enemigo.danio(500);
        }else if(enemigo instanceof Soldado){
            enemigo.danio(200);
        }
    }
    
}
