
public class Cuenta {
    
    private int numero;
    private String nombre;
    private int clave;
    private double saldo;
    public static int numCuenta;
        
    public Cuenta(int numero, int clave, String nombre, double saldo){// esto es para llamar el constructor = y sirve para inicializar atrivutos en los valores que uno desee
       this.clave = clave; //este this es para ahcer referencia a los atributos de la clase y que no se condundan con o valores del metodo constructor
       this.nombre = nombre;
       this.numero = numero;
       this.saldo = saldo;
       numCuenta++;
    }

    public int getNumero() {   // Esto se pude generar mas facilmente con alt insert
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getClave() {
        return clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getNumCuenta() {
        return numCuenta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void setNumCuenta(int numCuenta) {
        Cuenta.numCuenta = numCuenta;
    }
    
    public boolean consignar(double valor){
        if(valor > 0){
          this.saldo = this.saldo + valor;
          return true;
        }
        else
            return false;
    }
    
    public boolean retirar(double valor){
        if(valor > 0 && valor <= this.saldo){
            this.saldo-= valor;
            return true;
        }
        else
            return false;
    }
    
    public boolean cambiarClave(int anterior, int nueva){
        if(anterior == this.clave){
            this.clave = nueva;
            return true;
        }
        else
            return false;
    }
    
    
    
}
