package objetonoanemico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time hoy = new Time();

		System.out.println("Formato corto: ");
		System.out.println(hoy.fechaFormatoCorto());

		System.out.println("Formato largo: ");
		System.out.println(hoy.fechaFormatoLargo());

	}

}
