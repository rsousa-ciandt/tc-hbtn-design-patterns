public class PedidoBuilder extends PedidoAbstractBuilder {
    private Pedido pedido;

    private TipoLanche tipoLanche;
    private TipoBrinde tipoBrinde;
    private TipoBebida tipoBebida;
    private TamanhoBatata tamanhoBatata;

    @Override
    public void setLanche(TipoLanche tipo) {
        this.tipoLanche = tipo;
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        this.tipoBrinde = tipo;
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        this.tipoBebida = tipo;
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        this.tamanhoBatata = tamanho;
    }

    public Pedido build() {
        ItemPedido itemPedido;
        pedido = new Pedido();

        if (tipoLanche != null) {
            itemPedido = new ItemPedido(tipoLanche.name(), TipoItemPedido.LANCHE);
            pedido.adicionarItemDentroCaixa(itemPedido);
        }

        if (tipoBrinde != null) {
            itemPedido = new ItemPedido(tipoBrinde.name(), TipoItemPedido.BRINDE);
            pedido.adicionarItemDentroCaixa(itemPedido);
        }


        if (tamanhoBatata != null) {
            itemPedido = new ItemPedido(tamanhoBatata.name(), TipoItemPedido.BATATA);
            pedido.adicionarItemDentroCaixa(itemPedido);
        }

        if (tipoBebida != null) {
            itemPedido = new ItemPedido(tipoBebida.name(), TipoItemPedido.BEBIDA);
            pedido.adicionarItemForaCaixa(itemPedido);
        }

        return pedido;
    }
}
