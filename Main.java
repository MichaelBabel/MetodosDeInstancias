import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Criando uma ArrayList que receberá instâncias de Casa
        List<Casa> casas = new ArrayList<>(5);
        // Criando instâncias de Casa com o Construtor e adicionando na ArrayList casas
        casas.add(new Casa(500, true, 500));
        casas.add(new Casa(1080, true, 500));
        casas.add(new Casa(920, true, 500));
        casas.add(new Casa(125, true, 500));
        casas.add(new Casa(736, false, 500));

        // Criando uma instância de CobrarAluguel e chamando seu método cobrarAluguel
        CobrarAluguel cobrar = new CobrarAluguel();
        double totalCobrado = cobrar.cobrarAluguel(casas);
    }
}