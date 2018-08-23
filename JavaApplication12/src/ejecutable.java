/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

public class ejecutable {
        public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.numero = 12313;
        c1.Propietario = "Alejandro";
        c1.saldo = 322;
            
        
        System.out.println("Saldo" + c1.saldo);
        c1.consignar(10000);
        System.out.println("Nuevo" +c1.saldo);
    }
}
