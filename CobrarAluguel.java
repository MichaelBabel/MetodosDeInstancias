import java.util.List;

public class CobrarAluguel {

    public double cobrarAluguel(List<Casa> casas) {
        double totalAluguel = 0;
        for (Casa casa : casas) {
            if (casa.isAlugada()) {
                System.out.println("Aluguel coletado da casa: " + casa.getNumero());
                totalAluguel += casa.getAluguel();
            }
        }
        System.out.println("Total de aluguel cobrado: " + totalAluguel);
        return totalAluguel;
    }
}