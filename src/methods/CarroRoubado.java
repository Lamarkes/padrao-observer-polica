package methods;

import interfaces.ICarroInterface;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado implements ICarroInterface {
    private List<Viatura> observadores = new ArrayList<>();
    private String placa;

    public CarroRoubado(String placa) {
        this.placa = placa;
    }

    public void adicionarObservador(Viatura observador) {
        observadores.add(observador);
    }

    public void removerObservador(Viatura observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores(String acao) {
        for (Viatura observador : observadores) {
            observador.atualizar(acao);
        }
    }

    @Override
    public void atualizar(String acao) {

    }

    @Override
    public void frente() {
        notificarObservadores("Carro roubado de placa " + placa + " está indo para frente.");
    }

    @Override
    public void esquerda() {
        notificarObservadores("Carro roubado de placa " + placa + " está virando à esquerda.");
    }

    @Override
    public void direita() {
        notificarObservadores("Carro roubado de placa " + placa + " está virando à direita.");
    }

    @Override
    public void parar() {
        notificarObservadores("Carro roubado de placa " + placa + " parou.");
    }
}