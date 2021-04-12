import java.util.ArrayList;
import java.util.List;

public class Metflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    //METODO QUE INICIALIZA LOS CATALOGOS DE SERIES Y PELIS
    public void inicializarCatalogo(){

        //peli: titanic, Batman: el caballero de la noche 
        Pelicula titanic; //declara variable que apunta a una pelicula
        titanic = new Pelicula (); 

        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; //3hs 30min

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";
        //agrego a la lista de actores del objeto titanic 
        titanic.actores.add(actor); //metodo add : agrega a un a lista

        //recien ahora etsoy agregando a titanic al catalogo
        this.peliculas.add(titanic);

        //otra pelicula
        Pelicula Batman;
        Batman = new Pelicula ();
        Batman.nombre = "Batman: el caballero de la noche";
        Batman.duracion = 152;
        Batman.añoLanzamiento = 2008;

        //no voy a declarar otra variable actor, voy a reusar
        //siempre antes de reusar, hay que reinstanciar
        actor = new Actor (); 
        actor.nombre = "Christian Bale"; 

        Batman.actores.add(actor);
        this.peliculas.add(Batman); 

        Pelicula elResplandor = new Pelicula();
        elResplandor.nombre = "El Resplandor";
        elResplandor.director = new Director();
        elResplandor.nombre = "Stanley Kubrick";

        //serie: How i met your mother
        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How i met your mother";
        howIMetYM.añoLanzamiento = 2005;

        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";

        howIMetYM.actores.add(actor);

        actor = new Actor ();
        actor.nombre = "Cobie Smulder";

        howIMetYM.actores.add(actor);

        //T5: E11
        Temporada temporada = new Temporada ();
        temporada.numero = 5;

        
        //creo el episodio
        Episodio episodio = new Episodio();
        episodio.nombre = "The last Cigarrete";
        episodio.numero = 11;

       //vinculo temporda con episodio
       temporada.episodios.add(episodio);

       episodio = new Episodio();
       episodio.nombre = "Definitions";
       episodio.numero = 1;

       temporada.episodios.add(episodio); 

       Websodio ws = new Websodio();
       ws.nombre = "Nombre websodio de internet";
       ws.numero = 35;
       ws.link = "http://miepisodios.com";
       temporada.episodios.add(ws); 


       //agrego la temporada
       howIMetYM.temporadas.add(temporada);

        //T3
        temporada = new Temporada ();
        temporada.numero = 3;

        //creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Wait for it";
        episodio.numero = 1;

       //vinculo temporda con episodio
       temporada.episodios.add(episodio);

       episodio = new Episodio();
       episodio.nombre = "Little boys";
       episodio.numero = 4;

       temporada.episodios.add(episodio);
       //agrego la temporada
       howIMetYM.temporadas.add(temporada);

       //aca esta toda la serie con 2 temporadas y cada una con 2 episodios 
       this.series.add(howIMetYM);

       Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;

        actor = new Actor();
        actor.nombre = "Kaley Couco";

        bbt.actores.add(actor);

        //T1
        temporada = new Temporada ();
        temporada.numero = 1;

        episodio = new Episodio();
        episodio.nombre = "Pilot";
        episodio.numero = 1;

       //vinculo temporda con episodio
       temporada.episodios.add(episodio);

       episodio = new Episodio();
       episodio.nombre = "The Cooper-Hofstadter Polarizatio";
       episodio.numero = 9;

       temporada.episodios.add(episodio);

       bbt.temporadas.add(temporada);

       this.series.add(bbt);

    }
    //buscar serie
    public Serie buscarSerie(String nombreABuscar){

        //series = serie1 | serie2 | serie25 | serie40
        //vamos a usar el foreach que sirve pra recorrer listas
        //este ciclo, tiene una variable, que apunta a cada vuelta 
        //a cada elemento de la lista
       //o sea la primer vez va a apuntar a serie1, despues a  serie2, desp
       //serie25 hasta que termina 
       //FOREACH
       for (Serie serie : this.series) {
           if (serie.nombre.equals (nombreABuscar))
           return serie; //devuelvo esta serie
        
        }
        //si llego hasta aca es porque no encotro la serie
        return null; 
    }
       
}
