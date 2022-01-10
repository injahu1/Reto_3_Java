
package reto3;

public class Semoviente {
    
    private int idSemoviente;
   private String raza;
   private String color;
   private String proposito;
   //private Empleado empleado;
   private Empleado empleado;
   

    public Semoviente(int idSemoviente, String raza, String color, String proposito, Empleado empleado) {
        this.idSemoviente = idSemoviente;
        this.raza = raza;
        this.color = color;
        this.proposito = proposito;
        this.empleado = empleado;
    }

    public int getIdSemoviente() {
        return idSemoviente;
    }

    public void setIdSemoviente(int idSemoviente) {
        this.idSemoviente = idSemoviente;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "\n" + "Placa: " + idSemoviente +"."+ "\n" +"Raza: " + raza +"."+ "\n" +"Color=" + color +"."+ "\n" +"Propósito: " + proposito +"."+ "\n" +"Cuidador: " + empleado.getNombre()+"."+".\n";
    }
    
}
