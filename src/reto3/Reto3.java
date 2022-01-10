
package reto3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
//import reto3.Supervisor;
    

public class Reto3 {
private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {

           mostrarMenu();
        
    }
    
     public static void mostrarMenu(){
        ArrayList <Semoviente> semovientes = new ArrayList();
        ArrayList <Empleado> empleados = new ArrayList();
        ArrayList <Empleado> empleadosAsignados = new ArrayList();
         int salir=0;
while(salir==0){
        System.out.println("Normandia");
        System.out.println("Estimado usuario por favor seleccione una opción.");
        System.out.println("\n1. Registrar empleado.");
        System.out.println("2. Consultar empleado");
        System.out.println("3. Asignar a supervisor.");
        System.out.println("4. Eliminar empleado.");
        System.out.println("5. Listar empleado.");
        System.out.println("6. Registrar semoviente.");
        System.out.println("7. Consultar semoviente.");
        System.out.println("8. Eliminar semoviente.");
        System.out.println("9. Listar semovientes.");
        System.out.println("10. Salir.\n");
        int opcion;
        
        try{
        opcion=lector.nextInt();
        }
        catch(Exception e)   {
            lector.next();
            opcion=0;
        }
        
        switch(opcion){
            case 1: 
                registrarEmpleado(empleados);
            break;
            case 2: 
                consultarEmpleado(empleados);
            break;
            case 3: 
                asignarASupervisor(empleados, empleadosAsignados);
            break;
            case 4: 
                eliminarEmpleado(empleados);
            break;
            case 5: 
                 listarEmpleado(empleados);
            break;
            case 6: 
                registrarSemoviente(semovientes, empleados);
            break;
            case 7: 
                consultarSemoviente(semovientes);
            break;
            case 8: 
                eliminarSemoviente(semovientes);
            break;
            case 9: 
               listarSemoviente(semovientes);
            break;
            case 10: 
                System.out.println("\nNormandia");
                System.out.println("¡Muchas gracias por usar nuestro sistema!\n");
                salir=1;
            break;
            default: System.out.println("\nIngrese un número entre (1-10)\n"); 
        }}
    }

      private static void registrarSemoviente(ArrayList<Semoviente> semovientes, ArrayList<Empleado> empleados) {

        int placa=0;
        String raza;
        String color;
        String proposito;
        boolean veriplaca=false;
        boolean verien=false;
        String cadena;
        int encargado;
        int xsave=0;
               while(true){
    System.out.println("Ingrese el número de placa del semoviente: ");
    try{placa = lector.nextInt();
    if(placa>0){break;}
    else{System.out.println("Ingreso incorrecto"); }}
    catch(Exception f){
    System.out.println("Ingreso incorrecto");
    lector.next();
    placa=0;}}
    veriplaca=false;
    for(int x=0;x<semovientes.size();x++){
    if(semovientes.get(x).getIdSemoviente()==placa){
    veriplaca=true;
    }
    }
                 
               if(veriplaca==true){
                     System.out.println("\nNormandia");
                    System.out.println("¡Semoviente ya existe!\n\n\n");
                }
                else{
                    System.out.println("Ingrese la raza del semoviente: "); 
                    raza=lector.next();
                    System.out.println("Ingrese el color del semoviente: "); 
                    color=lector.next();
                    while(true){
                    System.out.println("Ingrese el propósito del semoviente (Carne ó Leche): ");  
                    try{proposito=lector.next(); }
                    catch(Exception g){
                        lector.next();
                        proposito="";}
                    if((proposito.equals("Carne"))||(proposito.equals("carne"))||(proposito.equals("CARNE"))){
                        cadena="Carne";
                        break;}
                    else if (proposito.equals("Leche")||(proposito.equals("leche"))||(proposito.equals("LECHE"))){
                        cadena="Leche";
                        break;}
                    }
                    while(true){
    System.out.println("Ingrese el documento del encargado: ");
    try{encargado = lector.nextInt();
    if(encargado>0){break;}
    else{System.out.println("Ingreso incorrecto"); }}
    catch(Exception g){
    System.out.println("Ingreso incorrecto");
    lector.next();
    encargado=0;}}
                     verien=false;
         for(int x=0;x<empleados.size();x++){             
                 if(empleados.get(x).getDocumento()==encargado){
                 verien=true;
                 xsave=x;
                 break;
                 }
         }
        if(verien==true){
                        Semoviente se=new Semoviente(placa,raza, color, cadena, empleados.get(xsave));
                        semovientes.add(se);
                        System.out.println("\nNormandia");
                        System.out.println("¡Semoviente registrado!\n\n\n");
        }     
        else{System.out.println("\nno existe ese empleado\n");}
                }

    }
      
       private static void registrarEmpleado(ArrayList<Empleado> empleados) {
        int documento=0;
        String nombre;
        String telefono;
        String direccion;
      //  String proposito;
     //   String[]propo={"","",""};
        boolean veriplaca=false; 

        LocalDate fecha=LocalDate.now();
                int tipo=0;
                int cargo=0;
 
                //Cuidador cui;
  
               while(true){
    System.out.println("Ingrese el número de documento del empleado: ");
    try{documento = lector.nextInt();
    if(documento>0){break;}
    else{System.out.println("Ingreso incorrecto"); }}
    catch(Exception f){
    System.out.println("Ingreso incorrecto");
    lector.next();
    documento=0;}}
    veriplaca=false;
    for(int x=0;x<empleados.size();x++){
    if(empleados.get(x).getDocumento()==documento){
    veriplaca=true;
    }
    }

                 
               if(veriplaca==true){
                     System.out.println("\nNormandia");
                    System.out.println("¡Empleado ya existe!\n\n\n");
                }
                else{
                    System.out.println("Ingrese el nombre del empleado: "); 
                    nombre=lector.next();
                    System.out.println("Ingrese el telefono del empleado: "); 
                    telefono=lector.next();
                    System.out.println("Ingrese el direccion del empleado: "); 
                    direccion=lector.next();
                    while(true){
                    System.out.println("Ingrese la fecha de contrato del empleado (AAAA-MM-DD): ");  
                    try{fecha=LocalDate.parse(lector.next());
                    break;
                    }
                    catch(Exception g){
                       // lector.next();
                        fecha=LocalDate.now();}

                    }
                    while(true){
                    System.out.println("Ingrese tipo de empleado (1-Cuidador)(2-Supervisor): ");  
                    try{tipo = lector.nextInt();
                    if(tipo==1){
                        while(true){
                        System.out.println("Ingrese el numero de semvientes a cargo: "); 
                            try{cargo = lector.nextInt();
    if(cargo>0){break;}
    else{System.out.println("Ingreso incorrecto"); }}
    catch(Exception g){
    System.out.println("Ingreso incorrecto");
    lector.next();
    cargo=0;}}
                            Empleado cu=new Cuidador(documento,nombre, telefono, direccion, fecha, cargo);
                        //Semoviente se=new Semoviente(placa,raza, color, cadena, em);
                        empleados.add(cu);
                        
                        System.out.println("\nNormandia");
                        System.out.println("¡Empleado registrado!\n\n\n");
                          break;  
                        }
                    else if(tipo==2){
                       
                      
                        Empleado su=new Supervisor(documento,nombre, telefono, direccion, fecha);
                        //Semoviente se=new Semoviente(placa,raza, color, cadena, em);
                        
                        empleados.add(su);
                        //empleadosAsignados.add(su);
                       //System.out.println(empleados.get(empleados.size()). .toString());
                      //  empleados.add(1, sup.);
                        System.out.println("\nNormandia");
                        System.out.println("¡Empleado registrado!\n\n\n");
                           break;
                           
                        
                    }
                    else{System.out.println("Ingreso incorrecto"); }}
                    catch(Exception h){
                    System.out.println("Ingreso incorrecto");
                    lector.next();
                    tipo=0;}
                    }

                        }
    }
       
        private static void consultarEmpleado(ArrayList<Empleado> empleados) {
       boolean veriplaca=false;
         int documento=0;
         int xguarde=0;
      while(true){
                System.out.println("Ingrese el número de documento del empleado: "); 
                try{documento = lector.nextInt();
                    if(documento>0){break;}
                    else{System.out.println("Ingreso incorrecto"); }}
                catch(Exception f){ 
                    System.out.println("Ingreso incorrecto");
                    lector.next();
                    documento=0;}}
                
                veriplaca=false;
         for(int x=0;x<empleados.size();x++){
                 
                 if(empleados.get(x).getDocumento()==documento){
                 veriplaca=true;
                 xguarde=x;
                 break;
                 }

         //System.out.println(veriplaca  );
         }
             //  System.out.println("v es igual a: "+v); 
        if(veriplaca==true){
                    System.out.println("\nNormandia");
                    System.out.println("Los datos del empleado son: \n");
                    System.out.println(empleados.get(xguarde));
                }
                else{System.out.println("\nNormandia");
                     System.out.println("¡Empleado no existe!\n\n\n");
                    
                }
    }
        private static void asignarASupervisor(ArrayList<Empleado> empleados ,ArrayList<Empleado>empleadosAsignados) {
                       int docCuidador=0;
                     int docsuper=0;
                     LocalDate fecha=LocalDate.now();
                   Supervisor supervisor= new Supervisor(000,"XXX", "XXX", "XXX", fecha );
                               boolean verinice=false;
                                  boolean verinice2=false;
                                  int xflag = 0;
                                  int xflog = 0;
                               
                                  
                                              while(true){
                        System.out.println("Ingrese el numero de cedula del cuidador que desea agregar: "); 
                           try{docCuidador = lector.nextInt();
    if(docCuidador>0){break;}
    else{System.out.println("Ingreso incorrecto"); }}
    catch(Exception i){
    System.out.println("Ingreso incorrecto");
    lector.next();
    docCuidador=0;}}
                           for(int x=0;x<empleados.size();x++){
    if(empleados.get(x).getDocumento()==docCuidador){
    verinice=true;
    xflag=x;
    
    break;} }
                                  
       
                           if(verinice==true){
 
                                                                    while(true){
                        System.out.println("Ingrese el numero de cedula del supervisor: "); 
                           try{docsuper = lector.nextInt();
    if(docsuper>0){break;}
    else{System.out.println("Ingreso incorrecto"); }}
    catch(Exception i){
    System.out.println("Ingreso incorrecto");
    lector.next();
    docsuper=0;}}
                           for(int x=0;x<empleados.size();x++){
    if(empleados.get(x).getDocumento()==docsuper){
        xflog=x;
    verinice2=true;
        //Supervisor supervisor= new Supervisor(000,"XXX", "XXX", "XXX", fecha );
      //  int cc = empleados.get(x).getDocumento();
        //String nn = empleados.get(x).getNombre();
        //String tt = empleados.get(x).getTelefono();
        //String dd = empleados.get(x).getDireccion();
        //LocalDate ff = empleados.get(x).getFechaContrato();
        //empleadosAsignados.clear();
    supervisor=new Supervisor(empleados.get(x).getDocumento(),empleados.get(x).getNombre(),empleados.get(x).getTelefono(),empleados.get(x).getDireccion(),empleados.get(x).getFechaContrato());
    //System.out.println(supervisor);
    
    break;
    }} 
    
                     if(verinice2==true){      
    //LocalDate fecha=LocalDate.now();
    //Empleado supe=new Empleado(124,"jopse", "fer", "fewvg3", fecha  );
    //sup.add(supe);
    
    
   //Empleado e =empleados.get(xflag);
    supervisor.setEmpleadosAsignados(empleadosAsignados);         //(empleados.get(xflag));
    empleadosAsignados.add(empleados.get(xflag));
    empleados.remove(xflog);
    empleados.add(xflog,supervisor);
    //setEmpleadosAsignados(empleadosAsignados);
   //Empleado supe = new Cuidador(1," fce","e ","cefc ",fecha,12);
   //supe.add(empleados.get(x));
   //System.out.println(supervisor);
   
   System.out.println("\nNormandia");
                     System.out.println("¡Empleado asignado!\n\n\n");
   
                     }else{
                     System.out.println("\nNormandia");
                     System.out.println("¡Empleado no existe!\n\n\n");
                     }
    
   
                           }
                           else{
                           System.out.println("\nNormandia");
                     System.out.println("¡Supervisor no existe!\n\n\n");
                           }
    if (verinice2==true){
//    Supervisor.class.getCantSemovientes();
//    empleados.get(xflag).s
//Supervisor supe=new Supervisor();
                        //Semoviente se=new Semoviente(placa,raza, color, cadena, em);
                   //     empleados.add(su);
                      //  empleados.add(1, su
    
    }
        
        }
    
        private static void eliminarEmpleado(ArrayList<Empleado> empleados) {
        int documento=0;
        boolean veriplaca=false;
        int xplaca=0;
        String name;
     while(true){
                System.out.println("Ingrese el número de documento del empleado: "); 
                try{documento=lector.nextInt();
                    if(documento>0){break;}
                    else{System.out.println("Ingreso incorrecto"); }}
                catch(Exception f){ 
                    System.out.println("Ingreso incorrecto");
                    lector.next();
                    documento=0;}}
     
     veriplaca=false;
    for(int x=0;x<empleados.size();x++){
    if(empleados.get(x).getDocumento()==documento){
    veriplaca=true;
    xplaca=x;
    break;
    }
    }
     name=empleados.get(xplaca).getNombre();
                if(veriplaca==true){
                    empleados.remove(xplaca);
                    System.out.println("\nNormandia");
                    System.out.println("Se ha eliminado el empleado: "+name+"\n\n\n");
                }
                else{System.out.println("\nNormandia");
                     System.out.println("¡Empleado no existe!\n\n\n");
                    
                }
    }

    private static void listarEmpleado(ArrayList<Empleado> empleados) {
          int cont=0;
             for(int x=0;x<empleados.size();x++){
                 cont=cont+1;
                    System.out.println("\nEmpleado "+cont+":\n");
    System.out.println(empleados.get(x));

    }
        System.out.println("\n\n");
    }
    

    private static void consultarSemoviente(ArrayList<Semoviente> semovientes) {
        
        boolean veriplaca=false;
         int placa=0;
         int xguarde=0;
      while(true){
                System.out.println("Ingrese el número de placa del semoviente: "); 
                try{placa = lector.nextInt();
                    if(placa>0){break;}
                    else{System.out.println("Ingreso incorrecto"); }}
                catch(Exception f){ 
                    System.out.println("Ingreso incorrecto");
                    lector.next();
                    placa=0;}}
                
                veriplaca=false;
         for(int x=0;x<semovientes.size();x++){
                 
                 if(semovientes.get(x).getIdSemoviente()==placa){
                 veriplaca=true;
                 xguarde=x;
                 break;
                 }

         //System.out.println(veriplaca  );
         }
             //  System.out.println("v es igual a: "+v); 
        if(veriplaca==true){
                    System.out.println("\nNormandia");
                    System.out.println("Los datos son: \n");
                    System.out.println(semovientes.get(xguarde));
                }
                else{System.out.println("\nNormandia");
                     System.out.println("¡Semoviente no existe!\n\n\n");
                    
                }
   
    }

    private static void listarSemoviente(ArrayList<Semoviente> semovientes) {
        
           int cont=0;
             for(int x=0;x<semovientes.size();x++){
                 cont=cont+1;
                    System.out.println("\nSemoviente "+cont+"\n");
    System.out.println(semovientes.get(x));
  //  System.out.println(i=i+1);
    }
        System.out.println("\n\n");
    }

    private static void eliminarSemoviente(ArrayList<Semoviente> semovientes) {
     int placa=0;
        boolean veriplaca=false;
        int xplaca=0;
     while(true){
                System.out.println("Ingrese el número de placa del semoviente: "); 
                try{placa=lector.nextInt();
                    if(placa>0){break;}
                    else{System.out.println("Ingreso incorrecto"); }}
                catch(Exception f){ 
                    System.out.println("Ingreso incorrecto");
                    lector.next();
                    placa=0;}}
     
     veriplaca=false;
    for(int x=0;x<semovientes.size();x++){
    if(semovientes.get(x).getIdSemoviente()==placa){
    veriplaca=true;
    xplaca=x;
    break;
    }
    }
     
                if(veriplaca==true){
                    semovientes.remove(xplaca);
                    System.out.println("\nNormandia");
                    System.out.println("¡Semoviente eliminado!\n\n\n");
                }
                else{System.out.println("\nNormandia");
                     System.out.println("¡Semoviente no existe!\n\n\n");
                    
                }
        
    }

}
