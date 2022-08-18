import java.util.List;

public class BebidaDecorator extends Bebida {
    protected Bebida bebidaDecorator;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorator = bebidaDecorada;
    }

    @Override
    public List<String> obterIngredientes() {
        return bebidaDecorator.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return bebidaDecorator.obterPreco();
    }
}
