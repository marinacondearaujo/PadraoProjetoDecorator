package padroesestruturais_exercicios.decorator;

public class SistemaSom extends CarroDecorator{
    public SistemaSom(Carro carro) {
        super(carro);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Sistema de Som";
    }
}
