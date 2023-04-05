package com.company;

import clases.Colegio;
import clases.Estudiante;
import clases.MiembroStaff;

public class Main {

    public static void main(String[] args) {

        //region PUNTO 2
        Estudiante uno = new Estudiante("38831258", "uno", "castagnani", "jcastagnani@gmail.com", "dsa", "2021", 5000, "programacion");
        Estudiante dos = new Estudiante("38831258", "dos", "castagnani", "jcastagnani@gmail.com", "dsa", "2021", 5000, "programacion");
        Estudiante tres = new Estudiante("38831258", "tres", "castagnani", "jcastagnani@gmail.com", "dsa", "2021", 5000, "programacion");
        Estudiante cuatro = new Estudiante("38831258", "cuatro", "castagnani", "jcastagnani@gmail.com", "dsa", "2021", 5000, "programacion");

        MiembroStaff m1 = new MiembroStaff("12654985", "m1", "dsa", "dsad", "vras", 15000, "manana");
        MiembroStaff m2 = new MiembroStaff("12654985", "m2", "dsa", "dsad", "vras", 15000, "manana");
        MiembroStaff m3 = new MiembroStaff("12654985", "m3", "dsa", "dsad", "vras", 15000, "manana");
        MiembroStaff m4 = new MiembroStaff("12654985", "m4", "dsa", "dsad", "vras", 15000, "manana");

        Colegio colegio = new Colegio();
        colegio.addPersona(uno);
        colegio.addPersona(dos);
        colegio.addPersona(tres);
        colegio.addPersona(cuatro);
        colegio.addPersona(m1);
        colegio.addPersona(m2);
        colegio.addPersona(m3);
        colegio.addPersona(m4);

        System.out.println("La cantidad de estudiantes es: " + colegio.getCantEstudiantes());
        System.out.println("La cantidad de Staff es: " + colegio.getCantStaff());
        System.out.println("Ingresos: " + colegio.getIngresos());
        //endregion
        
    }
}
