
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
}
