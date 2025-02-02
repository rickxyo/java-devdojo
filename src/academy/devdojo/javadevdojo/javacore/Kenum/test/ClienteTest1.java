package academy.devdojo.javadevdojo.javacore.Kenum.test;

import academy.devdojo.javadevdojo.javacore.Kenum.dominio.Cliente;
import academy.devdojo.javadevdojo.javacore.Kenum.dominio.Cliente.TipoPagamento;
import academy.devdojo.javadevdojo.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
