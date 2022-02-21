package mockTestingStatic;

import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.mockito.*;

public class mockRoleTestStatic {

	@Test
	public void showRole() {
		MockedStatic<PermisosStatic> permiso = Mockito.mockStatic(PermisosStatic.class);

		permiso.when(() -> PermisosStatic.permisoYTiempo("CRUD"))
				.thenReturn("PERMISSION ROLE : CRUD -  DD MM YYYY hh mm ss");
		permiso.when(() -> PermisosStatic.permisoYTiempo("CD"))
				.thenReturn("PERMISSION ROLE : CD - DD MM YYYY hh mm ss");
		permiso.when(() -> PermisosStatic.permisoYTiempo("R")).thenReturn("PERMISSION ROLE : R -  DD MM YYYY hh mm ss");
		permiso.when(() -> PermisosStatic.permisoYTiempo("CUD"))
				.thenReturn("PERMISSION ROLE : CUD - DD MM YYYY hh mm ss");
		permiso.when(() -> PermisosStatic.permisoYTiempo("CRUD"))
				.thenReturn("PERMISSION ROLE : CUD - DD MM YYYY hh mm ss"); // <- Erroneo

		mockRolesStatic mockRole = new mockRolesStatic();
		String expected = "PERMISSION ROLE : R -  DD MM YYYY hh mm ss";
		String obtained = mockRole.getUser(true, "R");

		Assertions.assertEquals(expected, obtained, "Incorrect USER and PWD");
	}

}
