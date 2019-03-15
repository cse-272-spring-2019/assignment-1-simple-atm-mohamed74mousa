import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Balance {
      Scene scene; 
    HomeScreen homeScreen ;
    Stage stage;
    Amount amount ;
    

    public Balance(Stage stage) {
        this.stage = stage;
    }
    public void prepareScene(){  
   
      //Setting label to the Stage
      Label validationLabel=new Label();
     
      //creating label  
      Text text1 = new Text("Your Balance:");  
       //Creating Buttons 
       
      Button back = new Button("back");
      GridPane gridPane=new GridPane();
          gridPane.setMinSize(200, 250);
              //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(15); 
      gridPane.setHgap(15);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER);
     
      //Arranging all the nodes in the grid  
      gridPane.add(text1, 1, 1); 
      gridPane.add(validationLabel, 1, 2);
      gridPane.add(back, 1, 4);
      
       validationLabel.setText("200");

      back.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            stage.setScene(homeScreen.getScene());
        }
    });
        
        scene=new Scene(gridPane);
     }

    public Scene getScene() {
        return scene;
    }

    public void setHomeScreen(HomeScreen homeScreen) {
        this.homeScreen = homeScreen;
    }
}
    

