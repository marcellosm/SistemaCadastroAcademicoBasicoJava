package app_unicarioca;

public class Disciplina {
    
   private int codigo;
   private String descricao;
   private String cargaHoraria;
   private String preRequisito;

   
    public Disciplina(int codigo, String descricao, String cargaHoraria, String preRequisito) { //construtor completo
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.preRequisito = preRequisito;
        
    }
     
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(String preRequisito) {
        this.preRequisito = preRequisito;
    }
    
    public void ListarDisciplinas(){
        System.out.println("Código: " + this.getCodigo() + ", Descrição: " + this.getDescricao() + ", Carga Horária: " + this.getCargaHoraria() 
        + ", Pré Requisito: " + this.getPreRequisito() + "\n");
    }
    
}
