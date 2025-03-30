package interfaz;

public class ModificarPerfil extends DatosdePerfil {
	// private event _actualizar;
	public Usuario _usuario;

	ModificarPerfil(Usuario usuario) {
		this._usuario = usuario;
		this.getDardealta().setVisible(false);

		this.getActualizar().addClickListener(event -> Actualizar());

		this.getCancelar().addClickListener(event -> {
			this._usuario.MainView.removeAll();
			this._usuario.MainView.add(this._usuario);
		});

	}

	public void Actualizar() {
		this._usuario.MainView.removeAll();
		this._usuario.MainView.add(this._usuario);
	}
}