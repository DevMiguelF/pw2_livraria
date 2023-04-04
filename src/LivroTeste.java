public class LivroTeste {

    public static void main(String[] args) {

        new Editora();
        Livro meuLivro = new Livro("Hobbit",9.99);
        meuLivro.paginas = 521;
        meuLivro.resumo = "bla bla bla bla bla";
        meuLivro.autor = "J. R. Tolkien";

        Editora editora1 = new Editora();
        editora1.nome = "Editora Erica";
        editora1.email = "editoraerica@gmail.com";
        meuLivro.editora = editora1;
        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("O Codigo Da Vinci",30);
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;
        livroFavorito.autor = "Dan Brown";
        Editora editora2 = new Editora();
        editora2.nome = "Rogisnei";
        editora2.email = "rogisneisilva@gmail.com";
        livroFavorito.aplicarDesconto(0.25);
        livroFavorito.editora= editora2;
        livroFavorito.exibirDados();

    }

}
