public class ProgramaPrincipal{

    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();
        
        p1.setNome("Davi");
        p2.setNome("Gabriela");
        p3.setNome("Bernardo");
        p4.setNome("Ariane");
        p1.setIdade(18);
        p2.setIdade(15);
        p3.setIdade(34);
        p4.setIdade(26);
        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        p2.setCurso("Desenvolvimento de Sistemas");
        p2.setMatricula(12982374);
        p3.setTrabalhando(true);
        p3.setSetor("administrativo");
        p4.setEspecialidade("Biologia");
        p4.setSalario(4500);
        System.out.println(p4.getEspecialidade());
        p4.receberAumento(500);
        System.out.println(p4.getSalario());
        
    }
}