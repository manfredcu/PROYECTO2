
public class Cliente extends Persona {

    public Cliente(String NumFactura, String Cedula, String Nombre, String Apellido1, String Apellido2, String Correo, String Celular) {
        super(Cedula, Nombre, Apellido1, Apellido2, Correo, Celular);
        this.NumFactura = NumFactura;
    }
    protected String NumFactura;

    public String getNumFactura() {
        return NumFactura;
    }

    public void setNumFactura(String NumFactura) {
        this.NumFactura = NumFactura;
    }

}
