package classesabstratas;

public abstract class Veiculo {

    final int numeroRodasMinimo = 2;
    String placa;
    String chassi;

    abstract public String acelerar();

    abstract public String frear();
}
