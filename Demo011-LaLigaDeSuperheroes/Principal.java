
public abstract class Principal
{
    
    public static void main()
    {
        LaLiga laLiga = new LaLiga();
        
        SuperHeroe batman = new SuperHeroe();
        SuperHeroe superman = new SuperHeroeVolador();
        SuperHeroe thor = new SuperHeroeExtraterrestre();
        
        Poder infrarrojo = new Poder("infrarrojo");
        Poder martillo = new Poder("martillo");
        
        superman.getSuperPoderes().add(infrarrojo);
        thor.getSuperPoderes().add(martillo);
        
        //Agregamos los socios a la liga
        laLiga.getSocios().add(batman);
        laLiga.getSocios().add(superman);
        laLiga.getSocios().add(thor);
        
        //Probando
        ((SuperHeroeVolador)superman).volar();
        
        
       //Recorriendo los socios de la liga                                                           
       for(SuperHeroe s: laLiga.getSocios()){
            
           //Recorriendo los poderes de cada socios
           for(Poder p: s.getSuperPoderes()){
           
               System.out.println(p.getNombre());
           }
       }
        
        
    }
}
