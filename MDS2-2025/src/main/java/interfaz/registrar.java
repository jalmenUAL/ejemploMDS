package interfaz;

public class registrar extends DatosdePerfil {
	// private event _dardealta;
	public Cibernauta _cibernauta;
	public CorreoElectronico _correoElectronico;

	registrar(Cibernauta cibernauta) {
		_cibernauta = cibernauta;
		this.getActualizar().setVisible(false);

		this.getDardealta().addClickListener(event -> Dardealta());

		this.getCancelar().addClickListener(event -> {
			this._cibernauta.MainView.removeAll();
			this._cibernauta.MainView.add(this._cibernauta);
		});

	}

	public void Mandarconfirmacin() {
		throw new UnsupportedOperationException();
	}

	public void Dardealta() {
		this._cibernauta.MainView.removeAll();
		this._cibernauta.MainView.add(this._cibernauta);
	}
}