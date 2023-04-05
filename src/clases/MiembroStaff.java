package clases;

public class MiembroStaff {
    //region Atributos
    protected double salario;
    protected String turno;
    //endregion

    //region Contructores
    public MiembroStaff(double salario, String turno) {
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
                '}';
    }
    //endregion
}
