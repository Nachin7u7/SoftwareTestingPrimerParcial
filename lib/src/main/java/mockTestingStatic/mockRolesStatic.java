package mockTestingStatic;

public class mockRolesStatic {

	public mockRolesStatic() {

	}

	PermisosStatic permiso = new PermisosStatic();

	public mockRolesStatic(PermisosStatic permiso) {
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
