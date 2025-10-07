/**
 * @author Lucas-Vieiraa
 */
public class ContratosFactory extends Factory {
    @Override
    Carro retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Thunderbird(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
