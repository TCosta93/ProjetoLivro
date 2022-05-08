public class Livro implements Publicacao {

    private String titulo,autor;
    private int totPaginas,pagAtual;
    private boolean aberto; 
    private Pessoa leitor;
    
   
    //crio o metodo Detalhes do livro
   
    public String detalhes() {
        return "do Livro:  \n aberto=" + aberto + ",\n autor=" + autor + ",\n leitor=" + leitor.getNome() + ",\n pagAtual=" + pagAtual
                + ",\n titulo=" + titulo + ",\n totPaginas=" + totPaginas ;
    }

    //crio o construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto=false;
        this.totPaginas=0;
        this.leitor = leitor;
    }

    //metodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberta() {
        return aberto;
    }

    public void setAberta(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {   
        this.aberto=false;
        
    }

    @Override
    public void folhear(int p) {   
        if(p>this.totPaginas){
            this.totPaginas=0;
        }else{
            this.pagAtual=p;
        }
       
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
        
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
        
    }
    
}
