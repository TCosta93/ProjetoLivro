public class App {
    public static void main(String[] args) throws Exception {
      Pessoa [] pessoa = new Pessoa[2];
      Livro [] livro = new Livro[3];

      pessoa[0]= new Pessoa("Talita","F",29);
      pessoa[1]= new Pessoa("Pedro","M",19);

      livro[0] = new Livro("Dracula", "Bram stoker", 300, pessoa[0]);
      livro[1] = new Livro("Contos de Horror", "Varios", 250, pessoa[1]);
      livro[2] = new Livro("Territorio LoveCraft", "Mat Ruff", 200, pessoa[0]);

     

      livro[0].abrir();
      livro[0].folhear(400);
      System.out.println("Detalhes "+ livro[0].detalhes());

    }
}
