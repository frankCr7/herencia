public class Main {

    public static void main(String args[])
    {

        /*Persona persona = new Persona("Frank", "Nieto Espinoza", 444885211, 2003,2022);
        System.out.println("nombre: "+persona.getNombre()+"  apellido: "+persona.getApellido());
        System.out.println("DNI: "+persona.getDni());
        System.out.println("FECHA DE NACIMIENTO: "+persona.getFechaNacimiento());
        System.out.println("DNI: "+persona.getAñoActual());

        System.out.println("edad actual: "+persona.calcularEdad());*/

        Alumno alumno = new Alumno("Frank", "Nieto Espinoza", 444885211, 2003,2022);
        System.out.println("*******Datos del Alumno*******");
        System.out.println("nombre del alumno : "+alumno.getNombre()+" "+alumno.getApellido());
        System.out.println("DNI: "+alumno.getDni());
        System.out.println("FECHA DE NACIMIENTO: "+alumno.getFechaNacimiento());
        System.out.println("año actual: "+alumno.getAñoActual());

        alumno.setEdad(2003);
        System.out.println("nacimiento del alumno: "+alumno.getEdad());
        System.out.println("edad actual del alumno: "+alumno.calcularEdad());


        System.out.println("***********************************");
        


        Docente docente = new Docente("Rodolfo", "Pastrana Espinoza", 444885211, 1990,2022);
        System.out.println("*******Datos del Docente*******");
        System.out.println("nombre del docente : "+docente.getNombre()+" "+docente.getApellido());
        System.out.println("DNI: "+docente.getDni());
        System.out.println("FECHA DE NACIMIENTO: "+docente.getFechaNacimiento());
        System.out.println("año actual: "+docente.getAñoActual());

        docente.setEdad(1990);
        System.out.println("nacimiento del docente: "+docente.getEdad());
        System.out.println("edad actual del docente: "+docente.calcularEdad());

        

        System.out.println("**********FECHA DE LA MATRICULA*******");
        Matricula matricula = new Matricula("12/03/2022");
        System.out.println("inicio de matricula: "+matricula.getFecha());
        System.out.println("*****CURSOS MATRICUADOS****");

        Curso curso = new Curso("MATEMATICA BASICA", "III", 5);
        Curso curso1 = new Curso("ESTADISTICA", "V", 4);
        Curso curso2 = new Curso("BASE DE DATOS", "V", 4);

        System.out.println("cursos llevando: "+curso.getNombre()+" ciclo:  "+curso.getCiclo()+"  creditos: "+curso.getCreditos());
        System.out.println("cursos llevando: "+curso1.getNombre()+" ciclo: "+curso1.getCiclo()+" creditos: "+curso1.getCreditos());
        System.out.println("cursos llevando: "+curso2.getNombre()+" ciclo: "+curso2.getCiclo()+" creditos: "+curso2.getCreditos());

        

        

        




    }
    
}
