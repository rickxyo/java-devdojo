package academy.devdojo.javadevdojo.javacore.Gassociacao.test;

import academy.devdojo.javadevdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javadevdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
