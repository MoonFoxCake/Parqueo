
public class Avion {
    Pasajero vehiculos[];
    
    public Avion(int tamano){
        vehiculos = new Pasajero[tamano];
    }
    
    public int getPrimerCampoVacio(){
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] == null)
                return i;
        }
        return -1;
    }
    
    public int agrupar(){
        int counter = 0;
        
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null){
                int indiceVacio = getPrimerCampoVacio();
                if (indiceVacio != -1 && indiceVacio < i){
                    vehiculos[indiceVacio] = vehiculos[i];
                    vehiculos[i] = null;
                    counter++;
                }
            }
        }
        return counter;
    }
    
    
    public Avion clonar(){
        Avion nuevo = new Avion(this.vehiculos.length);
        
        for (int i = 0; i < vehiculos.length; i++) {
            nuevo.vehiculos[i] = vehiculos[i];
        }
        return nuevo;
    }
    
    public Avion deepClone(){
        Avion nuevo = new Avion(this.vehiculos.length);
        
        for (int i = 0; i < vehiculos.length; i++) {
            if ( vehiculos[i] != null)            
                nuevo.vehiculos[i] = vehiculos[i].clonar();
        }
        return nuevo;
    }
    
    
    public int agregarPasajero(String tipo, String placa, int horaEntrada){
        int campo = getPrimerCampoVacio();

        if (campo != -1){
            Pasajero nuevo = new Pasajero(tipo, placa, horaEntrada);
            vehiculos[campo] = nuevo;
        }
        return campo;
    }
    
    public String toString(int columnas){
        String str = "";
        
        for (int i = 0; i < vehiculos.length; i++) {
            if (i % columnas == 0 && i != 0)
                str += "\n";
            if(vehiculos[i] != null)    
                str += (i+1)+". " + vehiculos[i].getPlaca() + "\t" ;
            else
                str += (i+1)+". Vacío\t";
        }       
        return str;
    }
    
    public int buscarPasajero(String placa){
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].getPlaca().equals(placa))
                return i;
        }
        return -1;
    }
    
    public Pasajero sacarPasajero(String placa){
        int index = buscarPasajero(placa);
        if (index != -1 && this.vehiculos[index].getHoraSalida() != -1){
            Pasajero eliminado = this.vehiculos[index];
            this.vehiculos[index] = null;
            return eliminado;
        }
        return null;
    }
    
    public void incrementarHora(String patron){
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].getPlaca().contains(patron))
                vehiculos[i].setHoraEntrada(vehiculos[i].getHoraEntrada()+100);
        }
    }
    
    
    
    
    
}
