/**
 * @author Lucas-Vieiraa
 */
public abstract class Factory {

    public Carro create(String requestedGrade) {
        Carro carro = retrieveCar(requestedGrade);
        carro = prepareCar(carro);
        return carro;
    }
    private Carro prepareCar(Carro carro){
        carro.clean();
        carro.mechanicCheck();
        carro.fuelCar();
        return carro;
    }
    abstract Carro retrieveCar(String requestedGrade);
}
