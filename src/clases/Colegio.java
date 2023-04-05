package clases;

import java.util.ArrayList;

public class Colegio {
    //region Atributos
    ArrayList<Persona> miembrosColegio;
    //endregion

    //region Contructores
    public Colegio() {
        this.miembrosColegio = new ArrayList<Persona>();
    }
    //endregion

    //region Metodos
    public void addPersona (Persona personita){
        miembrosColegio.add(personita);
    }
    public int getCantEstudiantes (){
        int cant = 0;

        for (Persona miembro : miembrosColegio){
            if (miembro instanceof Estudiante)
                cant++;
        }
        return cant;
    }
    public int getCantStaff(){
        int cant = 0;

        for (Persona miembro : miembrosColegio){
            if (miembro instanceof MiembroStaff)
                cant++;
        }
        return cant;
    }
    public double getIngresos (){
        double ingresos = 0;

        for (Persona miembro : miembrosColegio){
            if (miembro instanceof Estudiante)
                ingresos += ((Estudiante) miembro).cuotaMensual;
        }
        return ingresos;
    }
    //endregion


}
