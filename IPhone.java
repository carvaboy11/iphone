public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    
    
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.selecionarMusica("Bohemian Rhapsody");
        meuIPhone.tocar();
        meuIPhone.pausar();

        
        meuIPhone.ligar("+55 41 99999-9999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
