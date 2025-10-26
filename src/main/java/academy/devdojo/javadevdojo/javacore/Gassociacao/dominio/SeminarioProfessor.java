package academy.devdojo.javadevdojo.javacore.Gassociacao.dominio;

public class SeminarioProfessor {
    private String name;
    private String speciality;
    private Seminario[] seminarios;

    public SeminarioProfessor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public SeminarioProfessor(String name, String speciality, Seminario[] seminarios) {
        this.name = name;
        this.speciality = speciality;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Professor: " + this.name);
        if (this.seminarios == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitle());
            System.out.println(seminario.getSeminarioLocal().getAddress());
            if (seminario.getSeminarioAlunos() == null || seminario.getSeminarioAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (SeminarioAluno seminarioAluno : seminario.getSeminarioAlunos()) {
                System.out.println("Aluno: " + seminarioAluno.getName() + " Idade: " + seminarioAluno.getAge());
            }

        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
