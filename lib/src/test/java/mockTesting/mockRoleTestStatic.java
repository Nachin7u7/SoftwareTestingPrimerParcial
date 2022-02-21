package mockTesting;

import org.junit.*;
import org.mockito.*;

public class mockRoleTestStatic {

	@Test
	public void showRole() {
		MockedStatic<Permisos> permiso = Mockito.mockStatic(Permisos.class);
	}

}
