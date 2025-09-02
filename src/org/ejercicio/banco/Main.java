package org.ejercicio.banco;

public class Main{
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Luis Gomez",25672946);
        CuentaBancaria cuenta1 = new CuentaBancaria( 6831531, cliente1, 10000);
        
        Cliente cliente2 = new Cliente("Juan Perez",333);
        CuentaBancaria cuenta2 = new CuentaBancaria(123, new Cliente("Luis",2345),234);

        Cliente cliente3 = new Cliente("Luis domingues",3333);
    }    
}