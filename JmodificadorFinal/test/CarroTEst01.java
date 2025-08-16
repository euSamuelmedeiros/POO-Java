package JmodificadorFinal.test;

import JmodificadorFinal.Domain.Carro;


public class CarroTEst01 {
    public static void main(String[] args) {
        Carro car = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(car.COMPRADOR);
        car.COMPRADOR.setName("samuca");
        System.out.println(car.COMPRADOR);





        System.out.println(car); // ==> so para nao ficar amarelo
    }
}
