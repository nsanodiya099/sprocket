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
        return this.number_one * this.number_two;
    }

    public Result calculate(String opsType) {
        Result result= new Result();
        result.setOperationType(opsType);
        if(opsType.equalsIgnoreCase("sum")){
        result.setValue(String.valueOf(this.number_one + this.number_two));
        }

        else if(opsType.equalsIgnoreCase("product")){
            result.setValue(String.valueOf(this.number_one * this.number_two));
        }
        else{
            result.setValue("Invalid TRe");
        }
        return result;
    }

}