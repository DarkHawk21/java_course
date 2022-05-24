public class Tarea {

    private String titulo;
    private String status;
    private String descripcion;

    public Tarea(String titulo, String status, String descripcion){
        this.titulo = titulo;
        this.status = status; 
        this.descripcion = descripcion;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setStatus(String Status){
        this.status = status;
    }

    public void setDescripcion(String Descripcion){
        this.descripcion = descripcion;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getStatus(){
        return this.status;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
 
}
