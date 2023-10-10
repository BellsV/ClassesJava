public class AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {

    @Override
    public void tocar(String musica) {

        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {

        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica(String musica) {

        System.out.println("Selecionado musica: "+ musica);
    }

    @Override
    public void exibirPagina(String url) {

        System.out.println("Exibindo: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {

        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {

        System.out.println("Página atualizada com sucesso");
    }


    public void ligar(String numero) {

        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {

        System.out.println("Atendendo a chamada");
    }

    public void iniciarCorreioVoz() {

        System.out.println("Iniciando o correio de voz");
    }
}
