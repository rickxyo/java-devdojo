package academy.devdojo.javadevdojo.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.javadevdojo.javacore.ZZBcomportamento.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    //PARA UTILIZAR LAMBDAS PRECISAMOS DE UMA INTERFACE FUNCIONAL
    //PARA SER CONSIDERADO UMA INTERFACE FUNCIONAL, PRECISA TER APENAS E NO MAXIMO 1 METODO ABSTRATO

    //anonimas, funcoes, conciso
    boolean test(Car car);
    //(parametro) -> <expressao>
    //(Car car) -> car.getColor().equals(green);


}
