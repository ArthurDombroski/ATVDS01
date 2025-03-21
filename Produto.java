public class Produto {
    private String nome;
    private int cod;
    private int quant;
    private String preco;
    private String marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase(); 
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Produto(){}

    public Produto( String nome, int cod, int quant, String preco, String marca){
        this.cod = cod;
        setNome(nome);
        this.quant = quant;
        this.preco = preco;
        this.marca = marca;
    }
  

    public Produto (String nome, String marca){
        setNome(nome);
        this.marca = marca;
    }

    

}
