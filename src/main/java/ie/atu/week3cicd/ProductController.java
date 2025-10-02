package ie.atu.week3cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product") //all requests with product in url will be dealt with by this rest controller
@RestController
public class ProductController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/getproduct")
    public Product getProduct()
    {
            Product myProduct = new Product("Tv", 499);
            return myProduct;// The controller converts the object to json
    }


}
