/**
 * @author Lucas-Vieiraa
 */
public class SemContratosFactory extends Factory{
    @Override
    Carro retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Fusca(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
