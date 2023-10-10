public class Main {
    public static void main(String[] args) {

        AparelhoTelefonico telefone = new AparelhoTelefonico();


        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();


        telefone.tocar("Minha Música");
        telefone.pausar();
        telefone.selecionarMusica("Outra Música");

        telefone.exibirPagina("http//www.siteexemplo.com");
        telefone.adicionarNovaAba("http//www.siteexemplo.com");
        telefone.atualizarPagina();
    }
}
