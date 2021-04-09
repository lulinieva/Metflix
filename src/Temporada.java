import java.util.ArrayList;
import java.util.List;

public class Temporada {
    public int numero; 
    public String nombre; //nombre de la temporada no del capitulo
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio buscarEpisodio(int numeroEpisodio){
        for (Episodio episodio : this.episodios){
            if (episodio.numero == numeroEpisodio)
            return episodio;
        }
        return null;

    }

    
}
