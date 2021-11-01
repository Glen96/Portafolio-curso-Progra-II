public class Dado {;
    private int ultimonumero=1;
    
    public void Dado() {

    }

    public int obtenernumeroDouble() {
        int numerogenerado = 0;
        while (numerogenerado<ultimonumero){
            numerogenerado = 1 + (int) (Math.random() * 6);
        }

        return numerogenerado;
    }


}