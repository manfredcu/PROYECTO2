
public class Empleado extends Persona {

    public Empleado(String Salario, String Cedula, String Nombre, String Apellido1, String Apellido2, String Correo, String Celular) {
        super(Cedula, Nombre, Apellido1, Apellido2, Correo, Celular);
        this.Salario = Salario;
    }
  
    protected String Salario;

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    
    }
    
