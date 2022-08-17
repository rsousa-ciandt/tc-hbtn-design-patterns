public class WesterosPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        Personagem personagem;

        if (tipoPersonagem == TipoPersonagem.GUERREIRO) {
            personagem = new Guerreiro(nome, 0, 9, 7, 10, 7);
        } else if (tipoPersonagem == TipoPersonagem.LADRAO) {
            personagem = new Ladrao(nome, 1, 8, 7, 7, 10);
        } else {
            personagem = new Mago(nome, 8, 3, 3, 3, 4);
        }

        return personagem;
    }

}
