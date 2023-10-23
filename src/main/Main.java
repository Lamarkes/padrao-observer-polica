package main;


import methods.CarroRoubado;
import methods.Viatura;

public class Main {
    public static void main(String[] args) {
        CarroRoubado carroRoubado = new CarroRoubado("ABC123");
        Viatura viatura1 = new Viatura();
        Viatura viatura2 = new Viatura();

        // Registrar as viaturas como observadores do carro roubado
        carroRoubado.adicionarObservador(viatura1);
        carroRoubado.adicionarObservador(viatura2);

        // movimentos do carro roubado
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.parar();

        // movimentos das viaturas
        viatura1.frente();
        viatura2.direita();
        viatura1.frente();
        viatura2.esquerda();
        viatura1.parar();
    }
}