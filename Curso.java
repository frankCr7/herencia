public class Curso 
{
    private String nombre;
    

    private String ciclo;
    

    private int creditos;
    
    

    public Curso(String nombre, String ciclo, int creditos) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    


}
