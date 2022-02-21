package mockTesting;

import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.mockito.*;

public class mockRoleTest {

	Permisos permiso = Mockito.mock(Permisos.class);

	@Test
	public void showRole() {
		Mockito.when(permiso.permisoYTiempo("CRUD")).thenReturn("PERMISSION ROLE : CRUD -  DD MM YYYY hh mm ss");
		Mockito.when(permiso.permisoYTiempo("CD")).thenReturn("PERMISSION ROLE : CD - DD MM YYYY hh mm ss");
		Mockito.when(permiso.permisoYTiempo("R")).thenReturn("PERMISSION ROLE : R -  DD MM YYYY hh mm ss");
		Mockito.when(permiso.permisoYTiempo("CUD")).thenReturn("PERMISSION ROLE : CUD - DD MM YYYY hh mm ss");
		Mockito.when(permiso.permisoYTiempo("CRUD")).thenReturn("PERMISSION ROLE : CUD - DD MM YYYY hh mm ss");// <-
																												// este
																												// deberia
																												// ser
																												// erroneo

		mockRoles roles = new mockRoles(permiso);

		String espected = "PERMISSION ROLE : R -  DD MM YYYY hh mm ss";
		String obtained = roles.getUser(false, "R");
		String obtained2 = roles.getUser(true, "R");
		Assertions.assertEquals(espected, obtained, "Incorrect USER and PWD");
		Assertions.assertEquals(espected, obtained2, "Incorrect USER and PWD");

		Mockito.verify(permiso).permisoYTiempo("CRUD");
		Mockito.verify(permiso).permisoYTiempo("CD");
		Mockito.verify(permiso).permisoYTiempo("R");
		Mockito.verify(permiso).permisoYTiempo("CUD");
		Mockito.verify(permiso).permisoYTiempo("CRUD"); // <- este deberia ser erroneo

	}

}
