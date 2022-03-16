package objetoanemico;

import java.time.LocalDate;

public class Time {

	public Time() {

	}

	public LocalDate obtenerFechaDeHoy() {
		LocalDate hoy = LocalDate.now();
		return hoy;
	}
}
