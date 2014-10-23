
public class Principal
{
    public static void main()
    {
        
        BandejaEntrada bandEntrada = new BandejaEntrada();
        BandejaSalida bandSalida = new BandejaSalida();
        
        //Creando el email a enviar
        Email e1 = new Email();
        //Contruyendo
        Contacto c1 = new Contacto("POO", "poo@ucp.edu.ar");
        //Seteando valores del email
        e1.setPara(c1);
        e1.setAsunto("Parcial 1");   
        e1.setContenido("Enviando correo");  
        
        //Enviando correo
        bandSalida.getCorreos().add(e1);
        //Recibiendo correos
        bandEntrada.getCorreos().add(e1);        
        
        //Imprimiendo correos. el primer correo
        Email emailParaImprimir = bandEntrada.getCorreos().get(0);
        System.out.println(emailParaImprimir.toString());
        
    }
}
