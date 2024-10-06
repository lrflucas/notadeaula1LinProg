public class Aluno {

    private String nome;
    private double nota1, nota2, nota3, media;

    public void calcularMedia() {

        media = (nota1 + nota2 + nota3) / 3;

    }

    public void resultado() {

        if (media >= 7.0) {
            System.out.printf(getNome() + " está aprovado(a). A média foi %.2f", getMedia());
        } else if (media < 4.0) {
            System.out.printf(getNome() + " está reprovado(a). A média foi %.2f", getMedia());
        } else {
            System.out.printf(getNome() + " está na final. A média foi %.2f", getMedia());
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
