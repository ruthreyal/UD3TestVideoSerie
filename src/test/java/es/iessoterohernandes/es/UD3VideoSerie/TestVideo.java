package es.iessoterohernandes.es.UD3VideoSerie;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class TestVideo 
{
	
	private static Videojuego videojuego;
    
	@BeforeEach
	public void init() {
	videojuego = new Videojuego("Spiderman", 300, "Plataforma", "Sony");
	}
	
    
	@Test
	public void compareTo() {
	Videojuego v = new Videojuego ("Resident evil", 250, "Plataforma", "Sony");
		assertEquals(Videojuego.MENOR, videojuego.compareTo(v));
		v = new Videojuego ("Resident evil", 350, "Plataforma", "Sony");
		assertEquals(Videojuego.MAYOR, videojuego.compareTo(v));
		v = new Videojuego ("Resident evil", 300, "Plataforma", "Sony");
		assertEquals(Videojuego.IGUAL, videojuego.compareTo(v));
	}
	
	@Test
	public void testToString() {
		assertEquals (videojuego.toString(),"Informacion del videojuego: \n" +
            "\tTitulo: "+videojuego.getTitulo()+"\n" +
            "\tHoras estimadas: "+videojuego.getHorasEstimadas()+"\n" +
            "\tGenero: "+videojuego.getGenero()+"\n" +
            "\tcompañia: "+ videojuego.getcompañia());
	}
	
	@Test
	public void equals(){
		Videojuego v = new Videojuego("Spiderman", 300, "Plataforma", "Sony");
		assertEquals (videojuego.equals(v), true); 
    }
	
    
    

    
}
