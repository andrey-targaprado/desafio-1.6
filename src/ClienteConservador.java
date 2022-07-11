
public class ClienteConservador extends Cliente {

    private RendaFixa rendaFixa;

    public ClienteConservador() {

        super();
    }

    public void contratarInvestimento(RendaFixa rendaFixa) {
        this.carteiraInvestimento.add(rendaFixa);

    }

}
