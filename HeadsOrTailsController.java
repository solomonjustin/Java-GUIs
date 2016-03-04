package HOT;

import java.util.Random;

import javafx.scene.image.Image;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;


public class HeadsOrTailsController {
	private int userPoints = 0, cpuPoints = 0;
	private Image heads, tails;
    @FXML
    private Button btnFlip;

    @FXML
    private ImageView imgSide;

    @FXML
    private Label lblCPU;

    @FXML
    private Label lblPlayer;

    @FXML
    private Label lblSide;

    @FXML
    private RadioButton rbHeads;

    @FXML
    private RadioButton rbTails;

    @FXML
    private ToggleGroup sides;


    @FXML
    void initialize() {
        lblCPU.setText("" + cpuPoints);
        lblPlayer.setText("" + userPoints);
        
        heads = new Image("HOT/heads.jpg");
        tails = new Image("HOT/tails.jpg");
    }
    
    public void flip()	{
    	
    	int userGuess, side;
    	Random random = new Random();
    	side = random.nextInt(2);
    	
    	if(rbHeads.isSelected() || rbTails.isSelected()){
    		
    		if(side == 0){
    			imgSide.setImage(heads);
    			lblSide.setText("Heads");
    		}else{
    			imgSide.setImage(tails);
    			lblSide.setText("Tails");
    		}
    			
    		if(rbHeads.isSelected()){
    			userGuess = 0;
    		}else{
    			userGuess = 1;
    		}
    		
    		if(userGuess == side){
    			++userPoints;
    	        lblPlayer.setText("" + userPoints);
    		}else{
    			++cpuPoints;
    			lblCPU.setText("" + cpuPoints);
    		}
    			
    	}
    	
    	else {
			lblSide.setText("Please choose a side!");
		}
    		
    }

}
