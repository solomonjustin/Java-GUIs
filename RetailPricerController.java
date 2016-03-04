package Lab1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class RetailPricerController {
	NumberFormat format = new DecimalFormat("#,##0.00");
	
    @FXML
    private Button btnPrice;

    @FXML
    private Label lblPrice;

    @FXML
    private TextField txtMarkup;

    @FXML
    private TextField txtWholesale;


    @FXML
    public void initialize() {
    	
    }
    
    public void getPrice(){
    	double 
    			wholesale = Double.parseDouble(txtWholesale.getText()),
    			markup = Double.parseDouble(txtMarkup.getText()),
    			price;
    	
    	price = wholesale + (wholesale * (markup / 100));
    	
    	lblPrice.setText("Retail price is : $" + format.format(price));    	
    }
    
    
    
    

}
