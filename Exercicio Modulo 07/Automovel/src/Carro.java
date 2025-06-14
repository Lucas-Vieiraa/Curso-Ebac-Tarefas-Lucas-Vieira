/**
 * @author Lucas Vieira
 * @version V1.0
 */
public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private String cor;
    private boolean ligado;
    private String marcha;
    private String modoMarcha;
    private int velocidade;

    public Carro(String marca, String modelo, String placa, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
    }

    public void SetMarca(String marca) {
        this.marca = marca;
    }
    public void SetModelo(String modelo) {
        this.modelo = modelo;
    }
    public void SetPlaca(String placa) {
        this.placa = placa;
    }
    public void SetAno(int ano) {
        this.ano = ano;
    }
    public void SetCor(String cor) {
        this.cor = cor;
    }
    public void SetLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void SetMarcha(String marcha) {
        this.marcha = marcha;
    }
    public void SetModoMarcha(String modoMarcha) {
        this.modoMarcha = modoMarcha;
    }
    public void SetVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String GetMarca() {
        return marca;
    }
    public String GetModelo() {
        return modelo;
    }
    public String GetPlaca() {
        return placa;
    }
    public int GetAno() {
        return ano;
    }
    public String GetCor() {
        return cor;
    }
    public boolean GetLigado() {
        return ligado;
    }
    public String GetMarcha() {
        return marcha;
    }
    public String GetModoMarcha() {
        return modoMarcha;
    }
    public int GetVelocidade() {
        return velocidade;
    }

    public void ligarCarro(){
        if(ligado){
            System.out.println("Carro está ligado");
        }else{
            SetLigado(true);
        }
    }
    public void desligarCarro(){
        if(!ligado){
            System.out.println("Carro está desligado");
        }else {
            SetLigado(false);
        }
    }

    /**
     *
     * @param modoMarcha
     * seleciona o modo da marcha para que o sistema identifique se é para ficar em neutro, para frente ou ré.
     */
    public void trocarMarcha(String modoMarcha){
       switch(modoMarcha) {
           case "D":
           case "R":
           case "N":
               this.SetModoMarcha(modoMarcha);
               break;
           default: break;
       }
    }

    /**
     *
     * @param velocidade
     *  Metodo utilizado para acelerar comforme a marcha adicionada ao cambio automatico.
     *  a marcha é trocada a partir da velocidade do carro.
     */
    public void acelerarCarro(int velocidade){
    if(ligado && !GetModoMarcha().equals("N") && GetModoMarcha().equals("D")){
        if (velocidade <= 20) {
            SetMarcha("1");
            SetVelocidade(velocidade);
        } else if (velocidade <=30 ) {
            SetMarcha("2");
            SetVelocidade(velocidade);
        } else if (velocidade <=40 ) {
            SetMarcha("3");
            SetVelocidade(velocidade);
        } else if (velocidade <=80) {
            SetMarcha("4");
            SetVelocidade(velocidade);
        } else if (velocidade < 200 ) {
            SetMarcha("5");
            SetVelocidade(velocidade);
        }
        } else if (GetModoMarcha().equals("R")) {
            SetMarcha("R");
            SetVelocidade(velocidade);
        }else{
        SetMarcha("N");
        SetVelocidade(0);
        }
    }

    public void frearCarro(){
        SetVelocidade(0);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", ligado=" + ligado +
                ", marcha='" + marcha + '\'' +
                ", modoMarcha='" + modoMarcha + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}


