package app_unicarioca;

import java.util.ArrayList;
import java.util.Scanner;


public class App_unicarioca {

    public static void main(String[] args) {
        
        System.out.println("AV2 - POO ");
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();
      
        Scanner s = new Scanner(System.in);
        boolean executa = true;
        
        while(executa){
            System.out.println(
                    "====================== MENU ======================"
                    + "\nDigite  > 1 < CADASTRAR ALUNOS" 
                    + "\nDigite  > 2 < CADASTRAR CURSOS" 
                    + "\nDigite  > 3 < CADASTRAR DISCIPLINAS"  
                    + "\nDigite  > 4 < CADASTRAR FUNCIONARIOS" 
                    + "\nDigite  > 5 < CADASTRAR PROFESSORES" 
                    + "\nDigite  > 6 < CADASTRAR TURMAS " 
                    + "\nDigite  > 7 < LISTAR TODOS OS ALUNOS CADASTRADOS" 
                    + "\nDigite  > 8 < LISTAR TODOS OS CURSOS CADSTRADOS" 
                    + "\nDigite  > 9 < LISTAR TODAS AS DISCIPLINAS CADASTRADAS" 
                    + "\nDigite > 10 < LISTAR TODOS OS FUNCIONARIOS CADASTRADOS" 
                    + "\nDigite > 11 < LISTAR TODOS OS PROFESSORES CADASTRADOS" 
                    + "\nDigite > 12 < LISTAR TODAS AS TURMAS CADASTRADAS" 
                    + "\nDigite > 13 < LISTAR TODOS OS DADOS CADASTRADOS NO SISTEMA" 
                    + "\nDigite > 14 < SAIR DO PROGRAMA... "
                    + "\n>>>> DIGITE UMA OPÇÃO : "
             );
            
            int opcao = s.nextInt();
            
           switch(opcao){
           
            //Cadatro de alunos
        case 1: { 
                System.out.print("Informe o nome do aluno -> ");
                s = new Scanner(System.in);
                String nome = s.nextLine();
                System.out.print("Informe a matrícula do aluno -> ");
                int matricula = s.nextInt();
                System.out.print("Informe o telefone do aluno -> ");
                s = new Scanner(System.in);
                String telefone = s.nextLine();
                System.out.print("Informe o endereco do aluno -> ");
                s = new Scanner(System.in);
                String endereco = s.nextLine();
                System.out.print("Informe o curso do aluno -> ");
                s = new Scanner(System.in);
                String curso = s.nextLine();
                System.out.print("Informe a situacao do aluno (EmRenovacao, MatrículaTrancada, etc...) -> ");
                s = new Scanner(System.in);
                String situacao = s.nextLine();
                
                alunos.add(new Aluno(matricula, nome, telefone, endereco, curso, situacao));
                 
                System.out.println("\nAluno cadastrado!\n");       
            break;
            } 
        
            // Cadastro de Cursos;
        case 2: {
                
                System.out.print("Informe o codigo do curso -> ");
                int codigo = s.nextInt();
                System.out.print("Informe a descricao do curso -> ");
                s = new Scanner(System.in);
                String descricao = s.nextLine();
                System.out.print("Informe o nome do coordenador do curso -> ");
                s = new Scanner(System.in); 
                String coordenador = s.nextLine();
                
                cursos.add(new Curso(codigo, descricao, coordenador));
                
                System.out.println("\nCurso cadastrado!\n");
                System.out.println();

            break;
            } 
            
            // Cadastro de Disciplinas.
        case 3: {
            
                System.out.print("Informe o codigo da disciplina -> ");
                int codigo = s.nextInt();
                System.out.print("Informe a descricao da disciplina -> ");
                s = new Scanner(System.in);
                String descricao = s.nextLine();
                System.out.print("Informe a carga horaria da disciplina -> ");
                s = new Scanner(System.in);
                String cargaHoraria = s.nextLine();
                System.out.print("Informe o pre requisito da disciplina se houver -> ");
                s = new Scanner(System.in);
                String preRequisito = s.nextLine();
                
                disciplinas.add(new Disciplina(codigo, descricao, cargaHoraria, preRequisito));
                
                System.out.println("\nDisciplina cadastrada!\n");
                System.out.println();
            break;
            } 
            
            //Cadastro de funcionários.
        case 4: {
                System.out.print("Informe o nome do Funcionario -> ");
                s = new Scanner(System.in);
                String nome = s.nextLine();
                System.out.print("Informe o telefone do Funcionario -> ");
                s = new Scanner(System.in);
                String telefone = s.nextLine();
                System.out.println("Informe matricula do Funcionario -> ");
                int codigo = s.nextInt();
                System.out.print("Informe o endereco do Funcionario -> ");
                s = new Scanner(System.in);
                String endereco = s.nextLine();
                System.out.print("Informe o salário do Funcionário -> ");
                double salario = s.nextDouble();
                System.out.print("Informe o cargo do Funcionário -> ");
                s = new Scanner(System.in);
                String cargo = s.nextLine();
                System.out.print("Informe o numero da CTPS do Funcionário -> ");
                s = new Scanner(System.in);
                String numCTPS = s.nextLine();

                funcionarios.add(new Funcionario(nome, telefone,codigo,endereco, salario, cargo, numCTPS));
                 
                System.out.println("\nFuncionário cadastrado!\n");      
            break;
            } 
        
            //Cadastro de professores.
        case 5: {
                System.out.print("Informe o nome do professor -> ");
                s = new Scanner(System.in);
                String nome = s.nextLine();
                System.out.print("Informe o telefone do professor -> ");
                s = new Scanner(System.in);
                String telefone = s.nextLine();
                System.out.print("Informe a matrícula do professor -> ");
                int codigo = s.nextInt();
                System.out.print("Informe o endereco do professor -> ");
                s = new Scanner(System.in);
                String endereco = s.nextLine();
                System.out.print("Informe o salário do professor -> ");
                double salario = s.nextDouble();
                System.out.print("Informe o cargo do professor -> ");
                s = new Scanner(System.in);
                String cargo = s.nextLine();
                System.out.print("Informe a disciplina lecionada pelo professor -> ");
                s = new Scanner(System.in);
                String disciplinaLecionada = s.nextLine();
                System.out.print("Informe o numero da CTPS do Funcionário -> ");
                s = new Scanner(System.in);
                String numCTPS = s.nextLine();
                
                professores.add(new Professor(nome, telefone, codigo, endereco, salario, cargo, disciplinaLecionada, numCTPS));
                 
                System.out.println("\nProfessor cadastrado!\n");  
        break;
        } 
        
            //Cadastro de Turmas.
        case 6: {
                System.out.println("Informe o nome da disciplina -> ");
                s = new Scanner(System.in);
                String disciplina = s.nextLine();
                System.out.println("Infome o ano que estám sendo lecionada ->");
                int ano = s.nextInt();
                System.out.println("Informe o semestre da disciplina ->");
                s = new Scanner(System.in);
                String semestre = s.nextLine();
                System.out.println("Informe o dia que a disciplina é lecionada -> ");
                s = new Scanner(System.in);
                String dia = s.nextLine();
                System.out.println("Informe o horario da disciplina.");
                s = new Scanner(System.in);
                String horario = s.nextLine();
                
               turmas.add(new Turma(disciplina, ano, semestre, dia, horario));
               
               System.out.println("\nTurma cadastrada!\n");
            
            break;
            } 
        
        case 7: 
            System.out.println("\n------ Listando alunos cadastrados------ ");
                for(int i = 0; i <alunos.size();i++){
                    alunos.get(i).ListarPessoas(); }
        break;
             
        
        case 8: 
            System.out.println("\n------ Listando cursos cadastrados------ ");
                for(int k = 0; k <cursos.size();k++){
                    cursos.get(k).ListarCursos();}
        break;
             

        case 9: 
            System.out.println("\n------ Listando disciplinas cadastradas------ ");
                for(int l = 0; l <disciplinas.size();l++){
                    disciplinas.get(l).ListarDisciplinas();}
        break;
            
        
        case 10:
            System.out.println("\n------ Listando Funcionários cadastrados------ ");
                for(int j = 0; j <funcionarios.size();j++){
                    funcionarios.get(j).ListarPessoas();}
        break;
        
        case 11:
            System.out.println("\n------ Listando professores cadastrados------ ");
                for(Professor professor : professores) System.out.println(professor.toString());
        break;
        
        case 12:
            System.out.println("\n------ Listando as turmas cadastradas------ ");
                for(Turma turma : turmas) System.out.println(turma.toString());
            break;
        
        case 13:
            if(!alunos.isEmpty()){
            System.out.println("\n------ Listando alunos cadastrados------ ");
                for(int i = 0; i <alunos.size();i++){
                    alunos.get(i).ListarPessoas(); }
            }
            
            if (!cursos.isEmpty()){
            System.out.println("\n------ Listando cursos cadastrados------ ");
                for(int k = 0; k <cursos.size();k++){
                    cursos.get(k).ListarCursos();}    
            }
            
            if(!disciplinas.isEmpty()){
            System.out.println("\n------ Listando disciplinas cadastradas------ ");
                for(int l = 0; l <disciplinas.size();l++){
                    disciplinas.get(l).ListarDisciplinas();}
            }
            
            if(!funcionarios.isEmpty()){
            System.out.println("\n------ Listando Funcionários cadastrados------ ");
                for(int j = 0; j <funcionarios.size();j++){
                    funcionarios.get(j).ListarPessoas();}
            }
            
            if(!professores.isEmpty()){
            System.out.println("\n------ Listando professores cadastrados------ ");
                for(Professor professor : professores) System.out.println(professor.toString());    
            }   
            
            if(!turmas.isEmpty()){
            System.out.println("\n------ Listando as turmas cadastradas------ ");
                for(Turma turma : turmas) System.out.println(turma.toString());
            } 
            break;
          
        case 14:
                System.out.println("\n FIM DO PROGRAMA");
                executa = false;
            break;
            
         default:
            System.out.println("\nOpção Inválida, escolha outra.\n");   
        
    
            }
        }
        
    }
}