package clases;

public class Estudiante extends Persona{
    //region Atributos
    protected String anoDeIngreso;
    protected double cuotaMensual;
    protected String carrera;
    //endregion

    //region Contructores
    public Estudiante(String DNI, String nombre, String apellido, String email, String direccion, String anoDeIngreso, double cuotaMensual, String carrera) {
        super(DNI, nombre, apellido, email, direccion);
        this.anoDeIngreso = anoDeIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }
    public Estudiante() {
    }
    //endregion

    //region Getters y setters
    public String getAnoDeIngreso() {
        return anoDeIngreso;
    }
    public void setAnoDeIngreso(String anoDeIngreso) {
        this.anoDeIngreso = anoDeIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }
    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    //endregion

    //region Metodos
    @Override
    public String toString() {
        return "Estudiante{" +
                "anoDeIngreso='" + anoDeIngreso + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                "} " + super.toString();
    }
    //endregion
}
