package app_unicarioca;

public class Funcionario extends Pessoa{
        
        //Atributos
    private int codigo;
    private double salario;
    private String numCTPS;
    private String cargo;

    public Funcionario(String nome, String telefone, int codigo, String endereco, double salario, String cargo, String numCTPS ) {
        super(nome, telefone, endereco);
        this.codigo = codigo;
        this.salario = salario;
        this.cargo = cargo;
        this.numCTPS = numCTPS;
    }

    public String getNumCTPS() {
        return numCTPS;
    }

    public void setNumCTPS(String numCTPS) {
        this.numCTPS = numCTPS;
    }
  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
     
    //Metodo para Listar Dados sobrescrito da classe Pessoa.
    @Override
    public void ListarPessoas(){
    System.out.println("Nome: " + this.getNome() + ", Telefone: " + this.getTelefone()+ ", Endereço: " + this.getEndereco()+ ", Salario: " + this.getSalario() + ", Cargo: " + this.getCargo() + ", Número da CTPS = "+ this.getNumCTPS() + "\n");  
    }     
         
}
