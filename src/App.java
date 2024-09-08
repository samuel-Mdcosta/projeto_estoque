import visao.ClasseProdutoVisao;

public class App {
    public static void main(String[] args) throws Exception {
        //cria a instancioa do objeto da classe na qual vai chamar nesse caso a ClasseProdutoVisao
        ClasseProdutoVisao visao = new ClasseProdutoVisao();

        //chama a função dentro do objeto, nesse caso a funçãi exibir do objeto visao
        visao.Exibir();
    }
}
