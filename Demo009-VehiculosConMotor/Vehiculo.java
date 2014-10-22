
public abstract class Vehiculo
{
    
    private Motor motor;
    public Motor getMotor(){
        return motor;
    }
    public void setMotor(Motor valor){
        motor = valor;
    }

    public Vehiculo()
    {
        setMotor(new Motor());
    }
    
    public void moverse(){
        getMotor().iniciar();
    }
    
    
}
