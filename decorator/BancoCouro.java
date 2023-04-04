package padroesestruturais_exercicios.decorator;

public class BancoCouro extends CarroDecorator{
    public BancoCouro(Carro carro) {
        super(carro);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Banco de Couro";
    }
}
