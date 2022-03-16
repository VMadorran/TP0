package objetonoanemico;

import java.time.LocalDate;

public class Time {

	public Time() {
	}

	public String fechaFormatoCorto() {

		String fechaString = String.format("%1$td/%1$tm/%1$tY", this.fechaActual());
		return fechaString;
	}

	// Deolver String en ambos formatos
	public String fechaFormatoLargo() {

		String[] meses = new String[] { "enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		String[] dias = new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		LocalDate hoy = this.fechaActual();

		String fecha = dias[(hoy.getDayOfWeek().getValue()) - 1] + " " + hoy.getDayOfMonth() + " " + "de" + " "
				+ meses[(hoy.getMonthValue()) - 1] + " " + "de" + " " + hoy.getYear();
		return fecha;
	}

	private LocalDate fechaActual() {
		LocalDate ahora = LocalDate.now();
		return ahora;
	}

}
