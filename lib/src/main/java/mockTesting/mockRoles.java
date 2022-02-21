package mockTesting;

public class mockRoles {

	public mockRoles() {

	}

	Permisos permiso = new Permisos();

	public mockRoles(Permisos permiso) {
		this.permiso = permiso;
	}

	public String getUser(boolean user, String role) {
		if (!user) {
			return "Incorrect USER and PWD";
		} else {
			return permiso.permisoYTiempo(role);
		}
	}

}
