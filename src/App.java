public class App {
    public static void main(String[] args) throws Exception {
        //A partir de METFILX buscar la temporada 5 y el episodio 1 de la serie
        //How I Met Your Mother y
        //reproducir el episodio
        
        Metflix miMetflix = new Metflix();

        System.out.println("Incializando catalogo de Metflix");
        
        miMetflix.inicializarCatalogo(); //Estoy llamando al metodo que crea ls pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("How I Met Your Mother");
        if (serieBuscada == null){
            System.out.println("Serie ni existe");
            return;
        }

        Temporada temporada = serieBuscada.buscarTemporada(5);
       //buscar y guardar una VARIABLE
       Episodio episodio = temporada.buscarEpisodio(1);

       episodio.reproducir(); 

       public Serie reproducirSerie(String nombreSerie, int)

      


    }
        
}
