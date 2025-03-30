package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAadir;

public class Aadir extends VistaAadir {
	public ListaUsuario _listaUsuario;

	Aadir(ListaUsuario listausuario) {
		_listaUsuario = listausuario;

		this.getBotonAñadir().addClickListener(event -> {

			ListaUsuario_item li = new ListaUsuario_item(_listaUsuario);
			_listaUsuario.getListadeitems().as(VerticalLayout.class).add(li);
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).removeAll();
			_listaUsuario._usuario.getContenido().as(VerticalLayout.class).add(_listaUsuario);
		});

	}
}