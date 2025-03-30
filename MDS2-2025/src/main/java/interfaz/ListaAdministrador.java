package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaAdministrador extends Lista {
	// private event _borrar;
	public Administrador _administrador;

	ListaAdministrador(Administrador administrador) {

		_administrador = administrador;
		this.getBotonAnadir().setVisible(false);

		ListaAdministrador_item li = new ListaAdministrador_item(this);
		this.getListadeitems().as(VerticalLayout.class).add(li);
		ListaAdministrador_item li2 = new ListaAdministrador_item(this);
		this.getListadeitems().as(VerticalLayout.class).add(li2);
		this.getBorrar().setEnabled(false);
		this.getBorrar().addClickListener(event -> Borrar());

	}

	public void Borrar() {

		for (int i = 0; i < _item.size(); i++) {
			this.getListadeitems().as(VerticalLayout.class).remove(_item.get(i));
		}
		this.getBorrar().setEnabled(false);
	}
}