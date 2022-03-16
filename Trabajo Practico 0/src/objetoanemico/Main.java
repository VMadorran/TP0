package objetoanemico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Objeto anemico
		Time fechaActual = new Time();
		// Formato corto de la fecha
		System.out.println("Objeto Anémico\n");
		System.out.println("Formato corto:");
		String fechaString = String.format("%1$td/%1$tm/%1$tY", fechaActual.obtenerFechaDeHoy());
		System.out.println(fechaString);

		System.out.println("\n");

		// Formato largo de la fecha

		System.out.println("Formato largo:");
		String dia, mes;
		int diaNumero, mesNumero;
		mesNumero = fechaActual.obtenerFechaDeHoy().getMonthValue();
		diaNumero = fechaActual.obtenerFechaDeHoy().getDayOfWeek().getValue();

		switch (mesNumero) {
		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		default:
			mes = "Diciembre";
		}

		switch (diaNumero) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sabado";
			break;
		default:
			dia = "Domingo";
		}

		System.out.println(dia + " " + fechaActual.obtenerFechaDeHoy().getDayOfMonth() + " de " + mes + " de "
				+ fechaActual.obtenerFechaDeHoy().getYear());

	}
}
