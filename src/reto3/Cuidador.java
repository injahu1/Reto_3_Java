
package reto3;

import java.time.LocalDate;

public class Cuidador extends Empleado{
    private int cantSemovientes;

    public Cuidador(int documento, String nombre, String telefono, String direccion, LocalDate fechaContrato, int cantSemovientes) {
        super(documento, nombre, telefono, direccion, fechaContrato);
        this.cantSemovientes = cantSemovientes;
    }

    public int getCantSemovientes() {
        return cantSemovientes;
    }

    public void setCantSemovientes(int cantSemovientes) {
        this.cantSemovientes = cantSemovientes;
    }



    @Override
    public String toString() {
        return "\n" + super.toString()+ "Cantidad de semovientes a cargo: " + cantSemovientes+'\n';
    }
    

    
    
}
