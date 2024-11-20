import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verdetalles')
export class VistaVerdetalles extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="position:absolute;width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <span id="nick" style="align-self: center;">Nick</span>
 <span id="correo" style="align-self: center;">Correo</span>
 <span id="texto" style="align-self: center;">Texto</span>
 <vaadin-button id="volver" tabindex="0">
   Volver 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
