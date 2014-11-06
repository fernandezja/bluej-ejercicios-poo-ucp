
public abstract class Principal
{
   
    public static void main()
    {
        //Creando archivos y carpetas
        Carpeta carpeta1 = new Carpeta();
        carpeta1.setNombre("Carpeta 1");
        
        Carpeta carpeta2 = new Carpeta();
        carpeta2.setNombre("Carpeta 2");
        
        Archivo archivo1 = new Archivo();
        archivo1.setNombre("Archivo 1");
        archivo1.setTamanio(5);
        
        Archivo archivo2 = new Archivo();
        archivo2.setNombre("Archivo 2");
        archivo2.setTamanio(2);
        
        //copiando...
        carpeta2.getItems().add(archivo2);
        carpeta1.getItems().add(archivo1);
        
        carpeta1.getItems().add(carpeta2);
        
        //Tamaño total
        System.out.println("Carpeta 2 tamaño:"
                        + carpeta2.getTamanio());
                        
        System.out.println("Carpeta 1 tamaño:"
                        + carpeta1.getTamanio());
        
        
        
        
        
        
    }
}
