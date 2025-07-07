
public class CalculadoraNota {
    private double[] nota;
    double somaNota;


    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public double getSomaNota() {
        return somaNota;
    }

    public void setSomaNota(double somaNota) {
        this.somaNota = somaNota;
    }

    public void calcularNota() {
        for (double nota : nota) {
            somaNota += nota;
        }
        somaNota = somaNota / nota.length;
    }

    public void verificarMedia() {
        if (getSomaNota() < 5.0){
            System.out.printf("sua Média:  %.1f você foi Reprovado! ", getSomaNota());
        } else if (getSomaNota() >= 5.0 && getSomaNota() < 7.0) {
            System.out.printf("sua Média:  %.1f você está em Recuperação! ", getSomaNota());
        }
        else {
            System.out.printf("sua Média:  %.1f você foi Aprovado! ", getSomaNota());
        }
    }
}
