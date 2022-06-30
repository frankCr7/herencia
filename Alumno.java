public class Alumno extends Persona
{
    private int edad;
    

    public Alumno(String nombre, String apellido, int dni, int fechaNacimiento, int añoActual)
    {
        super(nombre, apellido, dni, fechaNacimiento, añoActual);

    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public int calcularEdad()
    {
       return this.edad - this.añoActual;
        
    }
    
}
