package interfaces;

import classesabstratas.Carro;
import classesabstratas.Veiculo;

public class Programa {
    public static void main(String[] args) {
        classesabstratas.Veiculo carro1 = new classesabstratas.Carro();
        System.out.println(carro1.acelerar());
        System.out.println(carro1.frear());

        Veiculo moto1 = new Carro();
        System.out.println(moto1.acelerar());
        System.out.println(moto1.frear());
    }
}
