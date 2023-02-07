package GabonetakoAriketa;

import static GabonetakoAriketa.Cliente.membresia.Platino;

public class Cliente {
    private String nombre;
    private String DNI;
    private boolean socio;
    public enum membresia{
        Platino, Oro, Premium
    }
    private membresia membresia;
    public Cliente(String nombre, String DNI, boolean socio){
        this.nombre = nombre;
        this.DNI = DNI;
        this.socio = socio;
    }
    public Cliente(String nombre, String DNI){
        this.socio = false;
    }
    public double getDescuento(){
        if(membresia.equals(Platino)){
            
        }
        return 0;
    }
}
