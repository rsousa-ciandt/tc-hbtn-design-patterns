public class NanoBotsDecorator extends NaveEspacialDecorator {
    public NanoBotsDecorator(NaveEspacial naveEspacialDecorada) {
        super(naveEspacialDecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 25;
    }
}
