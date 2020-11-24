package app_unicarioca;

public class Aluno extends Pessoa {
    
    //Atributos
    private int matricula;
    private String curso;
    private String situacao;
   
    //Construtor

    public Aluno(int matricula, String nome, String telefone, String endereco, String curso, String situacao) {
        super(nome, telefone, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.situacao = situacao;
    }
   
    
    //Metodos Getters e Setters 
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    //Metodo para Listar Dados sobrescrito da classe Pessoa.
    @Override
    public void ListarPessoas() {
     System.out.println("Nome: " + this.getNome() + ", Matricula: " + this.getMatricula() + ", Curso:  "  + this.getCurso() + 
    ", Endereço: " + this.getEndereco()+ ", Telefone: " + this.getTelefone() + ", Situacao da matrícula: "+ this.getSituacao() + "\n");  
    }
    
    
       
   
}
