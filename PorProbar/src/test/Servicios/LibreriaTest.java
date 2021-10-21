package test.Servicios;

import static org.junit.Assert.fail;

import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;

public class LibreriaTest {
    @Test
    public void testPrestarLibroQueNoSeHaPrestado(){
        Libro miLibro = new Libro ("Moby Dick", "Hnernan Melville");
        Libreria miLibreria = new Libreria();
        try{
            miLibreria.prestar(miLibro);
            assertTrue(true);

        }catch(Exception ex){
            fail();
        }
        
    }
    public void testDevolver(){

    
    
}
@Test
public void testPrestarLibroPrestado(){
    Libro miLibro = new Libro ("Moby Dick", "Hnernan Melville");
    miLibro.setPrestado(true);
    Libreria milibreria = new Libreria();
    try{
        miLibreria.prestar(miLibro);
        fail();
        

    }catch(Exception ex){
        assertTrue(true);
    }
}
}