import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator {
    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = new ArrayList<>();
        ingredientes.addAll(super.obterIngredientes());
        ingredientes.add("leite");

        return ingredientes;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
