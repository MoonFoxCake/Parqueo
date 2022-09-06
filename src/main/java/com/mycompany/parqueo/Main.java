
public class Main {
     public static void main(String[] args) {
        Parqueo p =  new Parqueo(20);
        System.out.println(p.toString(4));
         System.out.println("");
         p.agregarVehiculo("Vehiculo", "444444", 1300);
         p.agregarVehiculo("Vehiculo", "XYZ444", 1345);
         p.agregarVehiculo("Vehiculo", "ABC444", 1545);
         p.agregarVehiculo("Vehiculo", "111444", 1300);
         p.agregarVehiculo("Vehiculo", "222444", 1500);
         p.agregarVehiculo("Vehiculo", "AAA444", 1200);
         p.agregarVehiculo("Vehiculo", "BBB444", 1200);
         p.agregarVehiculo("Vehiculo", "TTT444", 1200);
         p.agregarVehiculo("Vehiculo", "XCV444", 1100);
         System.out.println(p.toString(6));
         p.vehiculos[0].setHoraSalida(1845);
         p.vehiculos[2].setHoraSalida(1845);
         p.vehiculos[3].setHoraSalida(1845);
         p.vehiculos[5].setHoraSalida(1845);
         p.vehiculos[7].setHoraSalida(1845);
         System.out.println(p.vehiculos[0].getHoras());
         System.out.println(p.buscarVehiculo("XYZ444"));
         System.out.println(p.buscarVehiculo("BBB444"));
         System.out.println(p.buscarVehiculo("XCV444"));         
         System.out.println(p.buscarVehiculo("XCV---"));
         System.out.println(p.toString(5));
         System.out.println("");
         Vehiculo salida = p.sacarVehiculo("ABC444");
         if (salida!=null)
             System.out.println("Salió el " + salida.toString());
         salida = p.sacarVehiculo("111444");
         if (salida!=null)
             System.out.println("Salió el " + salida.toString());
         salida = p.sacarVehiculo("XCV444");
         if (salida!=null)
             System.out.println("Salió el " + salida.toString());
         
         p.agregarVehiculo("Vehiculo", "514513", 1100);
         System.out.println(p.toString(5));
         
         p.vehiculos[18] = new Vehiculo("Motocicleta", "111111", 1100);
         
         System.out.println(p.toString(5));
         p.agrupar();
         System.out.println("");
         System.out.println(p.toString(5));
         
         
         
         

                  
         Vehiculo v[] = p.vehiculos.clone();
         System.out.println("-----------------------");
         p.vehiculos[0].setPlaca("AAAAAAAAAA");
         System.out.println("");
         for (int i = 0; i < v.length; i++) {
             if (v[i] != null)
                System.out.println(i + v[i].toString());
         }
         System.out.println("");
         System.out.println(p.toString(5));
         
    }   
}