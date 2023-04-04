package padroesestruturais_exercicios.decorator;

public class Multimidea extends CarroDecorator{
    public Multimidea(Carro carro) {
        super(carro);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Multimidea";
    }
}
