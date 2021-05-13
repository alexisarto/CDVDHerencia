import java.util.ArrayList;


public class CatalogoCD extends Catalogo{
	private ArrayList<CD> listaCD= new ArrayList<CD>();
	
	public void buscarPorArtista(String artista) {
		for (CD cd:listaCD) {
			if(cd.getArtista().equals(artista)) {
				System.out.println(cd.getTituloAlbum());
			}
		}
	}
	
	public void cuantosTemas(String titulo) {
		System.out.println("El cd tiene: "+buscarPorTitulo(titulo).getCanciones()+" canciones");
	}

}
