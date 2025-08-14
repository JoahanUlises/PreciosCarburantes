package preciosCarburantes;

import java.util.ArrayList;

public class PreciosCarburantes implements Sujeto{
	
	private ArrayList<Observador> observadores;
	
	private double gasolina95E5;
    private double gasolina95E10;
    private double gasoleoA;
    private double gasoleoB;
    private double gasoleoMaritimo;
    
    public PreciosCarburantes() {
        observadores = new ArrayList<>();
    }
    
    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }
    
    @Override
    public void borrarObservador(Observador o) {
        observadores.remove(o);
    }
    
    @Override
    public void notificar() {
        System.out.println("Notificando ...\n");
        for (Observador o : observadores) {
            o.actualizar();
        }
    }

	public double getGasolina95E5() {
		return gasolina95E5;
	}

	public void setGasolina95E5(double gasolina95e5) {
		gasolina95E5 = gasolina95e5;
	}

	public double getGasolina95E10() {
		return gasolina95E10;
	}

	public void setGasolina95E10(double gasolina95e10) {
		gasolina95E10 = gasolina95e10;
	}

	public double getGasoleoA() {
		return gasoleoA;
	}

	public void setGasoleoA(double gasoleoA) {
		this.gasoleoA = gasoleoA;
	}

	public double getGasoleoB() {
		return gasoleoB;
	}

	public void setGasoleoB(double gasoleoB) {
		this.gasoleoB = gasoleoB;
	}

	public double getGasoleoMaritimo() {
		return gasoleoMaritimo;
	}

	public void setGasoleoMaritimo(double gasoleoMaritimo) {
		this.gasoleoMaritimo = gasoleoMaritimo;
	}
    
	public void establecerEstado(int g95E5, int g95E10, int gA, int gB, int gM) {
        setGasolina95E5(g95E5);
        setGasolina95E10(g95E10);
        setGasoleoA(gA);
        setGasoleoB(gB);
        setGasoleoMaritimo(gM);
        notificar();
    }
}
