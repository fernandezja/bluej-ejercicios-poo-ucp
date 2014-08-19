import java.util.*;

public class Principal
{
    public static void main(){ 
        
        //Configuracion
        int cantidadParticipantes = 100;
        
        //Creando los participantes
        ArrayList<Participante> participantes = new  ArrayList<Participante> ();
        
        Participante p;
        for (int i=0; i<cantidadParticipantes; i++){            
            p = dameUnParticipante();
            p.setVida(1000);
            p.setNombre("Participante " + i);            
            participantes.add(p);                        
        }
        
        System.out.println("Total participantes: "+participantes.size());
        
        while (participantes.size() > 1){
            int atacanteIndice = randInt(0, participantes.size()-1);
            int enemigoIndice = randInt(0, participantes.size()-1);
            
            Participante atacante =  participantes.get(atacanteIndice);
            Participante enemigo =  participantes.get(enemigoIndice);
            
            atacante.disparar(enemigo);
            
            System.out.println(atacante.getNombreCompleto()
                        + " ataca a "
                        + enemigo.getNombreCompleto()
                        + " vida "
                        + enemigo.getVida());
            
            //Preguntar si murio
            if (!enemigo.estaVivo()){
                participantes.remove(enemigo);
            }
            
        }
        
        System.out.println("El sobreviviente: "+participantes.get(0).getNombreCompleto());
        
    }
    
    //Obtiene aleatoriamente un PArticipante
    private static Participante dameUnParticipante(){
        Participante p = null;
        int indice = randInt(0, 2);
        switch (indice){
            case 0:
                p = new Tanque();
                break;
            case 1:
                p = new Avion();
                break;
            case 2:
                p = new Soldado();
                break;
        }
        
        return p;
    }
    
    
    //Numero random aletario entre un rango especifico
    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public static void bantallaSimple(){
        Tanque t1 = new Tanque();
        t1.setNombre("Tanque 1");
        t1.setVida(1000);
        
        Tanque t2 = new Tanque();
        t2.setNombre("Tanque 2");
        t2.setVida(1000);
        
        t1.disparar(t2);
        
        System.out.println(t1.getNombre()+" "+t1.getVida());
        System.out.println(t2.getNombre()+" "+t2.getVida());
    }

}