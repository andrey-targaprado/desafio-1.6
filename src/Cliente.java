import java.util.ArrayList;

public abstract class Cliente implements Investimento{

    private Investimento investimento;
    protected ArrayList<Investimento> carteiraInvestimento = new ArrayList<>();

    @Override
    public void contratarInvestimento() {

    }

    public ArrayList<Investimento> getCarteiraInvestimento() {
        return this.carteiraInvestimento;
    }

}
