class Persona{
    String nombre;
    String apellido;
    int codigo;
    public Persona(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Codigo: " + codigo);
    }
}
class Estudiante extends Persona{
    String carrera;
    static int totalEstudiantes = 0;
    public Estudiante(String nombre, String apellido, int codigo, String carrera) {
        super(nombre, apellido, codigo);
        this.carrera = carrera;
        totalEstudiantes++;
    }
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
    }
}
class Profesor extends Persona{
    String especialidad;
    public Profesor(String nombre, String apellido, int codigo, String especialidad) {
        super(nombre, apellido, codigo);
        this.especialidad = especialidad;
    }
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }
}
class Horario {
    String dia;
    String hora;
    public Horario(String dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }
}
class Curso {
    int codigoCurso;
    String nombreCurso;
    Profesor profesor;
    Categoria categoria;
    Estudiante[] estudiantes;
    int cantidadEstudiantes;
    Horario horario;
    static int MAX_ESTUDIANTES = 30;
    public Curso(int codigoCurso, String nombreCurso, Profesor profesor, Categoria categoria) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.categoria = categoria;
        horario = new Horario("Lunes", "10:00");
        estudiantes = new Estudiante[MAX_ESTUDIANTES];
        cantidadEstudiantes = 0;
    }
    public void inscribirEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < MAX_ESTUDIANTES) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
            System.out.println("Estudiante inscrito");
        }
        else {
            System.out.println("Curso lleno");
        }
    }
    public void mostrarCurso() {
        System.out.println("Codigo: " + codigoCurso);
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Categoria: " + categoria.nombreCategoria);
        System.out.println("Profesor: " + profesor.nombre);
        System.out.println("Matriculados: " + cantidadEstudiantes);
    }
    public boolean disponible() {
        if (cantidadEstudiantes < MAX_ESTUDIANTES) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Categoria {
    String nombreCategoria;

    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
public class ProyectoCursos {
    public static void main(String[] args) {
        Categoria cat1 = new Categoria("Programacion");
        Profesor profesor1 =
            new Profesor("Carlos", "Perez", 500, "Programacion");
        Estudiante estudiante1 =
            new Estudiante("Juan", "Torres", 101, "Ingenieria de Sistemas");
        Estudiante estudiante2 =
            new Estudiante("Maria", "Lopez", 102, "Ingenieria de Sistemas");
        Curso curso1 =
            new Curso(201, "Java", profesor1, cat1);
        curso1.inscribirEstudiante(estudiante1);
        curso1.inscribirEstudiante(estudiante2);
        curso1.mostrarCurso();
    }
}