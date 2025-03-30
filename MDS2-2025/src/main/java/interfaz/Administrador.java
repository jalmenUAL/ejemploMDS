package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import mds2.MainView;

//import basededatos.iAdministrador;

public class Administrador extends UsuarioRegistrado {
	// public iAdministrador _iAdministrador;
	public ListaAdministrador _listaAdministrador;

	public Administrador(MainView MainView) {
		super(MainView);
		this.getModificarperfil().setVisible(false);
		ListaAdministrador();

	}

	public void ListaAdministrador() {
		ListaAdministrador l = new ListaAdministrador(this);

		this.getContenido().as(VerticalLayout.class).add(l);
	}
}