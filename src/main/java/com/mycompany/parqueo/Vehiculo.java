
public class Pasajero {

    private String Nombre;
    private String Nacionalidad;//1500


    public Pasajero( String Nombre,  Nacionalidad) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
    }
    
    public Pasajero clonar(){
        
        return new Pasajero(Nombre, Nacionalidad);
    }

    public String toString() {
        if (horaSalida == -1)
            return tipo + " " + Nombre+ "    in: " + Nacionalidad + "   AUN EN PARQUEO";
    
        return tipo + " " + Nombre+ "    in: " + Nacionalidad + "     out: " + horaSalida 
                + "    horas totales:" + getHoras() ;
    }

    public String getPlaca() {
        return Nombre;
    }
    
    public double getHoras(){
        double minutos = ((horaSalida - Nacionalidad) % 100)/60.0;
        int horas = (horaSalida - Nacionalidad) / 100;
        return horas + minutos;
    }



    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraEntrada( Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public int getHoraEntrada() {
        return Nacionalidad;
    }

    public void setPlaca(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
