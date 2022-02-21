package boundaryDescuento;

public class Descuento {

	public int getDescuento(int sueldo) throws Exception {
		int salarioMinimo = 2000;
		int discount = 0;
		if (sueldo <= salarioMinimo) {
			discount = 0;
		} else if (sueldo > salarioMinimo) {
			discount = 5;
		} else if (sueldo > salarioMinimo * 2) {
			discount = 15;
		} else {
			throw new Exception("Sueldo no válido");
		}

		return discount;

	}

}
