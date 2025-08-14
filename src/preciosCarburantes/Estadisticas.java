package preciosCarburantes;

public class Estadisticas implements Observador {
	private PreciosCarburantes datos;
	
	private double prevG95E5 = 0;
    private double prevG95E10 = 0;
    private double prevGA = 0;
    private double prevGB = 0;
    private double prevGM = 0;
    
    public Estadisticas(PreciosCarburantes datos) {
        this.datos = datos;
        datos.registrarObservador(this);
    }
    
    @Override
    public void actualizar() {
        double g95E5 = datos.getGasolina95E5();
        double g95E10 = datos.getGasolina95E10();
        double gA = datos.getGasoleoA();
        double gB = datos.getGasoleoB();
        double gM = datos.getGasoleoMaritimo();

        System.out.println("Gasolina 95 E5 pasa de " + prevG95E5 + " a " + g95E5 + " incremento de " + (g95E5 - prevG95E5));
        System.out.println("Gasolina 95 E10 pasa de " + prevG95E10 + " a " + g95E10 + " incremento de " + (g95E10 - prevG95E10));
        System.out.println("Gasóleo A pasa de " + prevGA + " a " + gA + " incremento de " + (gA - prevGA));
        System.out.println("Gasóleo B pasa de " + prevGB + " a " + gB + " incremento de " + (gB - prevGB));
        System.out.println("Gasóleo marítimo pasa de " + prevGM + " a " + gM + " incremento de " + (gM - prevGM));
        System.out.println();

        prevG95E5 = g95E5;
        prevG95E10 = g95E10;
        prevGA = gA;
        prevGB = gB;
        prevGM = gM;
    }
}
