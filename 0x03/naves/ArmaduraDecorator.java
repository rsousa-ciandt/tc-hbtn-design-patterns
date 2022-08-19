public class ArmaduraDecorator extends NaveEspacialDecorator {
    public ArmaduraDecorator(NaveEspacial naveEspacialDecorada) {
        super(naveEspacialDecorada);
    }

    @Override
    public int getSaude() {
        return super.getSaude() + 150;
    }
}
