package preciosCarburantes;

public class Instantaneo implements Observador {
	private PreciosCarburantes datos;

	public Instantaneo(PreciosCarburantes datos) {
        this.datos = datos;
        datos.registrarObservador(this);
    }
	
	@Override
    public void actualizar() {
        System.out.println("PRECIOS ACTUALES");
        System.out.println("GASOLINA 95 E5 " + datos.getGasolina95E5() + " €");
        System.out.println("GASOLINA 95 E10 " + datos.getGasolina95E10() + " €");
        System.out.println("GASOLEO A " + datos.getGasoleoA() + " €");
        System.out.println("GASOLEO B " + datos.getGasoleoB() + " €");
        System.out.println("GASOLEO MARITIMO " + datos.getGasoleoMaritimo() + " €");
        System.out.println();
    }
}
