package gear;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private static final String template = "Math, %s!";
    private Math math; 
//http://localhost:8080/math/sum?number_one=10&number_two=20
    @RequestMapping("/math/sum")
    public Result sum(@RequestParam(value="number_one", defaultValue="1") String number_one,
        @RequestParam(value="number_two", defaultValue="1") String number_two) {
        math = new Math(Integer.parseInt(number_one), Integer.parseInt(number_two));
        return math.calculate("sum");
    }

//    http://localhost:8080/math/product?number_one=10&number_two=20

    @RequestMapping("/math/product")
    public Result multiply(@RequestParam(value="number_one", defaultValue="1") String number_one,
        @RequestParam(value="number_two", defaultValue="1") String number_two) {
        math = new Math(Integer.parseInt(number_one), Integer.parseInt(number_two));
        return math.calculate("product");
    }
}