package padroesestruturais_exercicios.decorator;

public class CarroDecorado implements Carro{
    public float valor;

    public CarroDecorado() {
    }

    public CarroDecorado(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getEstrutura() {
        return "Decorado";
    }
}
