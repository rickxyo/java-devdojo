package academy.devdojo.javadevdojo.javacore.Kenum.test;

import academy.devdojo.javadevdojo.javacore.Kenum.dominio.Cliente;
import academy.devdojo.javadevdojo.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
