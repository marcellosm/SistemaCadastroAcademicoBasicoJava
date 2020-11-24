package app_unicarioca;

public abstract class Pessoa {
    
    //Atributos
    protected String nome;
    protected String telefone;
    protected String endereco;
    
    //Construtor
    public Pessoa(String nome, String telefone, String endereco) {
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //Metodo para listar dados de Pessoas.
    public void ListarPessoas(){
        
    }
}
