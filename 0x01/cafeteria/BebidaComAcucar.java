import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {
    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = new ArrayList<>();
        ingredientes.addAll(super.obterIngredientes());
        ingredientes.add("acucar");

        return ingredientes;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
