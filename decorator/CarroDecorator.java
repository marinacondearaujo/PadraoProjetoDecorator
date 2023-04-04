package padroesestruturais_exercicios.decorator;

import padroesestruturais_exercicios.decorator.Carro;

public abstract class CarroDecorator implements Carro{

    private Carro carro;
    public String estrutura;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getPercentualValor();

    public float getValor() {
        return this.carro.getValor() * (1 + (this.getPercentualValor() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.carro.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
