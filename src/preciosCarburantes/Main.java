package preciosCarburantes;

public class Main {
	public static void main(String[] args) {
		
		PreciosCarburantes datos = new PreciosCarburantes();
		
		Instantaneo vistaInstantanea = new Instantaneo(datos);
		Estadisticas vistaEstadisticas = new Estadisticas(datos);
		Texto vistaTexto = new Texto(datos);
		
		datos.establecerEstado(100, 200, 10, 5, 2);
        datos.establecerEstado(200, 230, 10, 55, 10);
        datos.establecerEstado(270, 280, 110, 95, 110);
        datos.establecerEstado(350, 325, 300, 100, 110);
	}
}
