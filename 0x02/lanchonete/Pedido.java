import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido () {
        itensForaCaixa = new HashSet<>();
        itensDentroCaixa = new HashSet<>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    private String listarItens(HashSet<ItemPedido> itens) {
        StringBuilder sb = new StringBuilder();

        itens.forEach(p -> {
            sb.append("\t\t- ")
                    .append(p.getTipo())
                    .append(" ")
                    .append(p.getNome())
                    .append("\n");
        });

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\tFora da Caixa:\n");
        sb.append(listarItens(itensForaCaixa));

        sb.append("\tDentro da Caixa:\n");
        sb.append(listarItens(itensDentroCaixa));

        return sb.toString();
    }
}
