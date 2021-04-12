
import java.util.*;

public class App {

    public static Scanner Teclado = new Scanner(System.in); 
    public static void main(String[] args) throws Exception {
        //A partir de METFILX buscar la temporada 5 y el episodio 1 de la serie
        //How I Met Your Mother y
        //reproducir el episodio
        
        Metflix miMetflix = new Metflix();

        System.out.println("Incializando catalogo de Metflix");
        
        miMetflix.inicializarCatalogo(); //Estoy llamando al metodo que crea ls pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("How I Met Your Mother");

        if (serieBuscada == null){

            System.out.println("No se encontro la serie");
            return;
        }
        System.out.println("Ingres nro temporada ");
        
        int nroTemporada = Teclado.nextInt();
        Teclado.nextLine();

        Temporada temporada = serieBuscada.buscarTemporada(nroTemporada);
       //buscar y guardar una VARIABLE
       System.out.println("Ingrese nr episodio ");
       int nroEpisodio = Teclado.nextInt();
       Teclado.nextLine();

       Episodio episodio = temporada.buscarEpisodio(nroEpisodio);

       episodio.reproducir(); 

       //ahora quiero imprimir un cartel que diga
       //que lo que se acaba de reproducir arriba es un
       //websodio o un episodio
       //pero en un print aparte.
       
       if(episodio instanceof Websodio){
           System.out.println("El episodio era un websodio ");

       }
       else {
           System.out.println("Es un episodio");
       }

       if (episodio instanceof Websodio){
           //Castear
           Websodio websodio = (Websodio)episodio; 
           System.out.println("El link del websodio es: "+ websodio.link);
       }



      


    }
        
}
