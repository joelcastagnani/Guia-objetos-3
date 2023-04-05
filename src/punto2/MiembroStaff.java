package clases;

public class MiembroStaff extends Persona{
    //region Atributos
    protected double salario;
    protected String turno;
    //endregion

    //region Contructores
    public MiembroStaff(String DNI, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(DNI, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }
    public MiembroStaff() {
    }
    //endregion

    //region Getters y setters
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    //endregion

    //region Metodos
    @Override
    public String toString() {
        return "MiembroStaff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                "} " + super.toString();
    }
    //endregion
}
