package app_unicarioca;

public class Professor extends Funcionario{
    
 
    private String disciplinaLecionada;

    public Professor(String nome, String telefone, int codigo, String endereco, double salario, String cargo,String disciplinaLecionada, String numCTPS){
        super(nome,telefone,codigo,endereco,salario,cargo,numCTPS);
        this.disciplinaLecionada = disciplinaLecionada;
    }

  
    public String getDisciplinaLecionada() {
        return disciplinaLecionada;
    }

    public void setDisciplinaLecionada(String disciplinaLecionada) {
        this.disciplinaLecionada = disciplinaLecionada;
    }

    
    @Override
    public String toString() {
        return  "Codigo = " + this.getCodigo() + ", Nome = " + this.getNome() + ", telefone = " + this.getTelefone() + ", Endereço = " + this.getEndereco() + ", Salario = " + this.getSalario()+ ", Cargo = " + this.getCargo()+ ", Disciplina Lecionada = " + this.getDisciplinaLecionada() + ", Número da CTPS = "+ this.getNumCTPS() +"\n" ;
    }
   
    
    
    
  
 
    
}
