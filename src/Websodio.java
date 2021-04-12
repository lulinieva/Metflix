public class Websodio extends Episodio {
    public String link; 
    
    @Override//redefinicion del metodo reprducir 
    public void reproducir(){

        System.out.println("Reporduciendo websodio del lin "+ this.link);

    }
    
}
