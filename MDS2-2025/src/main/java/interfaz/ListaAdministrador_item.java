package interfaz;

public class ListaAdministrador_item extends Lista_item {
	// private event _seleccionar;

	Boolean seleccionado = false;

	ListaAdministrador_item(ListaAdministrador lista) {
		super(lista);
		this.getModificar().setVisible(false);

		this.getSeleccionar().addClickListener(event -> Seleccionar());

	}

	public void Seleccionar() {

		if (!seleccionado) {
			seleccionado = true;

			this.getStyle().set("color", "red");
			this.getSeleccionar().setText("Quitar");
			ListaAdministrador la = (ListaAdministrador) _lista;
			la.getBorrar().setEnabled(true);
			la._item.add(this);
		} else {
			seleccionado = false;
			this.getStyle().set("color", "black");
			this.getSeleccionar().setText("Seleccionar");
			ListaAdministrador la = (ListaAdministrador) _lista;
			la.getBorrar().setEnabled(false);
			la._item.remove(this);
		}

	}
}