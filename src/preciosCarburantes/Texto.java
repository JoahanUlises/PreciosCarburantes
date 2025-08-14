package preciosCarburantes;

public class Texto implements Observador {
	private PreciosCarburantes datos;

    public Texto(PreciosCarburantes datos) {
        this.datos = datos;
        datos.registrarObservador(this);
    }

    @Override
    public void actualizar() {
    	
        System.out.println(generarLinea('a', datos.getGasolina95E5()));
        System.out.println(generarLinea('b', datos.getGasolina95E10()));
        System.out.println(generarLinea('A', datos.getGasoleoA()));
        System.out.println(generarLinea('B', datos.getGasoleoB()));
        System.out.println(generarLinea('M', datos.getGasoleoMaritimo()));
        System.out.println();
    }

    private String generarLinea(char letra, double cantidad) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (int) cantidad; i++) {
            sb.append(letra);
        }
        return sb.toString();
    }
}
