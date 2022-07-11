
public class ClienteArrojado extends Cliente {

    private RendaVariavel rendaVariavel;

    public ClienteArrojado() {

        super();
    }

    public void contratarInvestimento(RendaVariavel rendaVariavel) {
        this.carteiraInvestimento.add(rendaVariavel);

    }

}
