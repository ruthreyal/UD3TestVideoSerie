package es.iessoterohernandes.es.UD3VideoSerie;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class TestSerie 
{
	
	private static Serie serie;
    
	@BeforeEach
	public void init() {
	serie = new Serie("Strainger Things",5,"Ciencia Ficcion","Hermanos Duffer");
	}
	
    
	@Test
	public void compareTo() {
		Serie s = new Serie ("American Horror History", 11, "Terror", "Ryan Murphy y Brad Falchuk");
		assertEquals (Serie.MENOR, serie.compareTo(s));
		s= new Serie ("American Horror History", 4, "Terror", "Ryan Murphy y Brad Falchuk");
		assertEquals (Serie.MAYOR, serie.compareTo(s));
		s= new Serie ("American Horror History", 5, "Terror", "Ryan Murphy y Brad Falchuk");
		assertEquals (Serie.IGUAL, serie.compareTo(s));
	}
	
	@Test
	public void testToString() {
	assertEquals (serie.toString(),"Informacion de la Serie: \n" +
            "\tTitulo: "+serie.getTitulo()+"\n" +
            "\tNumero de temporadas: "+serie.getnumeroTemporadas()+"\n" +
            "\tGenero: "+serie.getGenero()+"\n" +
            "\tCreador: "+serie.getcreador());
	}
	
	@Test
	public void equals(){
		Serie a = new Serie("Strainger Things",5,"Ciencia Ficcion","Hermanos Duffer");
		assertEquals (serie.equals(a), true); 
    }
	
    
    

    
}