package ie.atu.week3cicd;

import lombok.AllArgsConstructor;
import lombok.Data; // generates the getters and setters
import lombok.NoArgsConstructor;

@Data// generates the getters and setters
@AllArgsConstructor // generates constructor
public class Product {
    private String productName;
    private double price;

}
