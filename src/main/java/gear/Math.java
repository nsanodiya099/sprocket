package gear;

public class Math {

    private final Integer number_one;
    private final Integer number_two;

    public Math(Integer number_one, Integer number_two) {
        this.number_one = number_one;
        this.number_two = number_two;
    }

    public Integer Sum() {
        return this.number_one + this.number_two;
    }

    public Integer Product() {
        return number_one / number_two;
    }
}