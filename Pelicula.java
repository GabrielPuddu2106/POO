public class Pelicula{
    //Atributos
    private String nombre;
    private int duracion;
    private String genero;
    private String calidad;
    private String clasificacion;
    //Metodos constructores
    public Pelicula(){

    }

    public Pelicula(int duracion,String genero,String calidad,String clasificacion,String nombre){
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.calidad = calidad;
        this.clasificacion = clasificacion;
    }

    //Metodos getters y setters
    //Los metodos getters son para mostrar los valores de los atributos
    public String mostrarNombre(){ //getNombre()
        return this.nombre;
    }
    //Los metodos setters son para modificar los valores de los atributos
    public void establecerNombre(String nombre){ //setNombre()
         this.nombre = nombre;
    }
    public int mostrarDuracion(){ //getNombre()
        return this.duracion;
    }
    //Los metodos setters son para modificar los valores de los atributos
    public void establecerDuracion(int duracion){ //setNombre()
         this.duracion = duracion;
    }

}    