package academy.devdojo.javadevdojo.javacore.Gassociacao.dominio;

public class Seminario {
    private String title;
    private SeminarioAluno[] seminarioAlunos;
    private SeminarioLocal seminarioLocal;

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, SeminarioAluno[] seminarioAlunos) {
        this.title = title;
        this.seminarioAlunos = seminarioAlunos;
    }

    public Seminario(String title, SeminarioAluno[] seminarioAlunos, SeminarioLocal seminarioLocal) {
        this.title = title;
        this.seminarioAlunos = seminarioAlunos;
        this.seminarioLocal = seminarioLocal;
    }

    public SeminarioLocal getSeminarioLocal() {
        return seminarioLocal;
    }

    public void setSeminarioLocal(SeminarioLocal seminarioLocal) {
        this.seminarioLocal = seminarioLocal;
    }

    public SeminarioAluno[] getSeminarioAlunos() {
        return seminarioAlunos;
    }

    public void setSeminarioAlunos(SeminarioAluno[] seminarioAlunos) {
        this.seminarioAlunos = seminarioAlunos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
