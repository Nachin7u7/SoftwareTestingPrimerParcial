package boundaryDescuento;

import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DescuentoTesting {

	@ParameterizedTest
	@CsvSource({ "1, el sueldo es menor o igual al salario minimo:1",
			"1000, el sueldo es menor o igual al salario minimo descuento:0",
			"1001, el sueldo es menor o igual al salario minimo descuento:0",
			"1999, el sueldo es menor o igual al salario minimo descuento:0",
			"2000, el sueldo es menor o igual al salario minimo descuento:0",
			"2999, el sueldo es mayor al salario minimo descuento:5",
			"3000, el sueldo es mayor al salario minimo descuento:5",
			"3999, el sueldo es mayor al salario minimo descuento:5",
			"4000, el sueldo es mayor al salario minimo descuento:15",
			"4999, el sueldo es mayor al salario minimo descuento:15",
			"5000, el sueldo es mayor al salario minimo descuento:15",
			"5999, el sueldo es mayor al salario minimo descuento:15",
			"6000, el sueldo es mayor al salario minimo descuento:15",
			"6999, el sueldo es mayor al salario minimo descuento:15",
			"7000, el sueldo es mayor al salario minimo descuento:15",
			"7999, el sueldo es mayor al salario minimo descuento:15",
			"8000, el sueldo es mayor al salario minimo descuento:15",
			"8999, el sueldo es mayor al salario minimo descuento:15",
			"9000, el sueldo es mayor al salario minimo descuento:15",
			"9999, el sueldo es mayor al salario minimo descuento:15",

	})

	public void verifySalario(int sueldo, String ans) throws Exception {
		Descuento disc = new Descuento();
		int realAns = disc.getDescuento(sueldo);

		Assertions.assertEquals(realAns, ans, "Error, sueldo invalido");
	}

}
