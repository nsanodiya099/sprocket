package gear;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private static final String template = "Math, %s!";
    private Math math; 

    @RequestMapping("/math/sum")
    public String sum(@RequestParam(value="number_one", defaultValue="1") String number_one, 
        @RequestParam(value="number_two", defaultValue="1") String number_two) {
        
        math = new Math(Integer.parseInt(number_one), Integer.parseInt(number_two));
        return String.format(template, Integer.toString(math.Sum()));
    }

    @RequestMapping("/math/product")
    public String multiply(@RequestParam(value="number_one", defaultValue="1") String number_one, 
        @RequestParam(value="number_two", defaultValue="1") String number_two) {
        
        math = new Math(Integer.parseInt(number_one), Integer.parseInt(number_two));
        return String.format(template, Integer.toString(math.Product()));
    }
}