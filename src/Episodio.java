public class Episodio {
    public String nombre;
    public Director director;
    public int duracion; //en minutos
    public String sinopsis; 
    public int numero; 

    public void reproducir(){
        System.out.println("Reproduciendo episodio" + nombre);
    }
    
}
