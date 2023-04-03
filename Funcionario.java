public class Funcionario extends Pessoa {
    private String Setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
