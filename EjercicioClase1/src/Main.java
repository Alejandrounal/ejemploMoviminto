import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero ");
        int numero = lectura.nextInt();
    
        System.out.println("Ingrese la clave");
        int clave = lectura.nextInt();
        
        System.out.println("Ingrese su nombre");
        String nombre = lectura.next();
        
        System.out.println("Ingrese el saldo");
        double saldo = lectura.nextDouble();
        
        
        
        Cuenta c1 = new Cuenta(numero,clave,nombre,saldo);
        System.out.println(c1.getSaldo());
        System.out.println(Cuenta.numCuenta);
        
        Cuenta c2 = new Cuenta(1013,9876,"Joselito Perez",500000);
        System.out.println(c2.getSaldo());
        System.out.println(Cuenta.numCuenta);
        
        
        
    }
}
