package Ejercicios1Secuencias.Ariketa3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private String fileName;
    public GestorEmpleados(String fileName){
        this.fileName = fileName;
    }
    public void guardaEmpleados(List<Empleado> array) {

        try {
            FileOutputStream fileOut = new FileOutputStream(this.fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            for (int i = 0; i < array.size(); i++) {
                out.writeObject(array.get(i));
            }

            out.writeObject(null);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            e.getMessage();
        }

    }
    public void muestraEmpleados() {
        try {
            FileInputStream fis = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fis);

            Empleado empleado = (Empleado) in.readObject();
            while (empleado != null) {
                System.out.println(empleado);
                empleado = (Empleado) in.readObject();
            }

            in.close();
            fis.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public Empleado busquedaEmpleado(String nombreEmpleado) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Empleado empleado = (Empleado) in.readObject();
            while (empleado != null) {
                if (empleado.getNombre().equals(nombreEmpleado)) {
                    return empleado;
                }
            }
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public void generaFicheroMoviles(String nombreFichero) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(this.fileName);
        ObjectInputStream in = new ObjectInputStream(fis);


        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        try {
            while (true){
                Empleado empleado = (Empleado) in.readObject();
                empleados.add(empleado);
            }

        }
        catch (EOFException e){
            e.getMessage();
        }
        in.close();
        fis.close();


        FileWriter fw = new FileWriter(nombreFichero);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            TeléfonoMovil tm = empleado.getTel();
            tm.setCredito(0);
            bw.write(tm.toString());
            bw.newLine();
        }

        bw.close();
        fw.close();
    }
    public void trabajarTodos() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(this.fileName);
        ObjectInputStream in = new ObjectInputStream(fis);

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado = (Empleado) in.readObject();

        while (empleado != null) {
            empleados.add(empleado);
            empleado.trabajo();
            empleado = (Empleado) in.readObject();
        }

        in.close();
        fis.close();

        FileOutputStream fos = new FileOutputStream(this.fileName);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        for (int i = 0; i < empleados.size(); i++) {
            out.writeObject(empleados.get(i));
        }

        out.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GestorEmpleados ge1 = new GestorEmpleados("employee.data");
        ArrayList<Empleado> empleados = new ArrayList<Empleado>(5);
        TeléfonoMovil tel1 = new TeléfonoMovil("+34668873352",50);
        TeléfonoMovil tel2 = new TeléfonoMovil("+34663321157",70);
        empleados.add(new Empleado("Manolo",1300,tel1));
        empleados.add(new Empleado("Paco",1500,tel1));

        ge1.busquedaEmpleado("Paco");

        ge1.busquedaEmpleado("Pablo");

        ge1.generaFicheroMoviles("moviles.data");

        ge1.trabajarTodos();

        ge1.muestraEmpleados();
    }
}
