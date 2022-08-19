public class LaserDecorator extends NaveEspacialDecorator {
    public LaserDecorator(NaveEspacial naveEspacialDecorada) {
        super(naveEspacialDecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 40;
    }
}
