package methods;
import interfaces.ICarroInterface;

public class Viatura implements ICarroInterface {

    @Override
    public void atualizar(String acao) {
        System.out.println("Viatura está seguindo o carro roubado. Ação da viatura: " + acao);
    }

    @Override
    public void frente() {
        System.out.println("Viatura está indo para frente.");
    }

    @Override
    public void esquerda() {
        System.out.println("Viatura está virando à esquerda.");
    }

    @Override
    public void direita() {
        System.out.println("Viatura está virando à direita.");
    }

    @Override
    public void parar() {
        System.out.println("Viatura parou.");
    }
}