
package reto3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Supervisor extends Empleado{
    
  private  ArrayList <Empleado> empleadosAsignados;

    public Supervisor(int documento, String nombre, String telefono, String direccion, LocalDate fechaContrato) {
        super(documento, nombre, telefono, direccion, fechaContrato);
        this.empleadosAsignados = new ArrayList <Empleado>();
        
    }

    public ArrayList<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setEmpleadosAsignados(ArrayList<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }


  
 
    public String recorre(){
String recor="\n";
        for (int i = 0; i < empleadosAsignados.size(); i++) {
            
        
         recor=recor+" * "+empleadosAsignados.get(i).getNombre()+'\n';
        
           
}
 
           
    return recor;
    
}
    
    
        @Override
    public String toString() {
        return "\n" + super.toString()+ "Empleados a cargo: "+recorre()+'\n';
        
               
    }
  
}
