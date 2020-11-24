package app_unicarioca;

public class Turma {
    
    private String disciplina;
    private int ano;
    private String semestre;
    private String dia; //dia da semana (seg, sex)
    private String horario;
   
    
    public Turma(String disciplina, int ano, String semestre, String dia, String horario) { //construtor completo
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.dia = dia;
        this.horario = horario;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

   
    @Override
    public String toString() {
        return "Disciplina = " + disciplina + ", Ano = " + ano + ", Semestre = " + semestre + ", Dia = " + dia + ", Horario = " + horario + "\n";
    }
   
    
}
