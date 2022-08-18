import java.util.Objects;

public class ItemPedido {
    private String nome;
    private TipoItemPedido tipo;

    public ItemPedido(String nome, TipoItemPedido tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ItemPedido itemPedido = (ItemPedido) o;

        return Objects.equals(nome, itemPedido.nome) && tipo == itemPedido.tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        int primo = 31;

        hash = hash * primo + (tipo == null ? 0 : tipo.hashCode());
        hash = hash * primo + (nome == null ? 0 : nome.hashCode());

        return hash;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }
}