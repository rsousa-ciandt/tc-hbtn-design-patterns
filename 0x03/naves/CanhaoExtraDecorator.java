public class CanhaoExtraDecorator extends NaveEspacialDecorator {
    public CanhaoExtraDecorator(NaveEspacial naveEspacialDecorada) {
        super(naveEspacialDecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 75;
    }
}
