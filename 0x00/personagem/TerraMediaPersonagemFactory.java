public class TerraMediaPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        Personagem personagem;

        if (tipoPersonagem == TipoPersonagem.GUERREIRO) {
            personagem = new Guerreiro(nome, 1, 8, 5, 10, 6);
        } else if (tipoPersonagem == TipoPersonagem.LADRAO) {
            personagem = new Ladrao(nome, 2, 6, 8, 5, 10);
        } else {
            personagem = new Mago(nome, 10, 2, 5, 3, 4);
        }

        return personagem;
    }

}
