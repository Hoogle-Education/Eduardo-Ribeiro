package model;

public class Aluno extends Pessoa {

    private String turma;

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String montarEmail() {
        return "Caro aluno " + nome + ", email: " + email + " e turma: " + turma;
    }

}
