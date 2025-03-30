package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaModificar;

public class Modificar extends VistaModificar {
	public ListaUsuario_item _listaUsuario;

	Modificar(ListaUsuario_item ListaUsuario_item) {
		_listaUsuario = ListaUsuario_item;

		this.getBotonModificar().addClickListener(event -> {

			ListaUsuario lu = (ListaUsuario) _listaUsuario._lista;
			lu._usuario.getContenido().as(VerticalLayout.class).removeAll();

			// para recargar los elementos
			ListaUsuario nlu = new ListaUsuario(lu._usuario);
			lu._usuario.getContenido().as(VerticalLayout.class).add(nlu);

		});

		this.getBotonCancelar().addClickListener(event -> {
			ListaUsuario lu = (ListaUsuario) _listaUsuario._lista;
			lu._usuario.getContenido().as(VerticalLayout.class).removeAll();
			lu._usuario.getContenido().as(VerticalLayout.class).add(lu);
		});

	}
}