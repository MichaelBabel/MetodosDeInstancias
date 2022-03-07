import java.util.List;

public class Casa {

    // Atributos
    private int numero;
    private boolean alugada;
    private double aluguel;

    // Construtor
    public Casa(int numero, boolean alugada, double aluguel) {
        this.numero = numero;
        this.alugada = alugada;
        this.aluguel = aluguel;
    }

    // Métodos Get e Set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAlugada() {
        return alugada;
    }

    public void setAlugada(boolean alugada) {
        this.alugada = alugada;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }
}