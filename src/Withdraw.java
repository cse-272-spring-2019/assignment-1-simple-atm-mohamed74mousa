
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


public class Withdraw {
    Scene scene; 
    HomeScreen homeScreen ;
    Stage stage;
    Amount amounte;

     

    public Withdraw(Stage stage) {
        this.stage = stage;
    }
    public void prepareScene(){ 
        //Creating Text Filed for cardnum        
      TextField amount = new TextField();
      
      Text text1 = new Text("add amount to withdraw:");
       //Creating Buttons 
      Button submit = new Button("Submit");
            Label label=new Label();

      
      
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
      gridPane.add(amount, 1, 2); 
      gridPane.add(text1, 1, 1); 
      gridPane.add(label, 1, 6); 

      gridPane.add(submit, 1, 3);
      gridPane.add(back, 1, 4);
      
      
      back.setOnAction((ActionEvent event) -> {
          stage.setScene(homeScreen.getScene());
      });
       submit.setOnAction((ActionEvent event) -> {
            double d = Double.parseDouble(amount.getText());
           
           if (amounte.getBalance()<d)
               label.setText("u dont have money");
           else {
           amounte.debit(d);
           String total2 = Double.toString(amounte.getBalance());
           label.setText(total2);
           System.err.println(total2);
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

    void setAmount(Amount m) {
this.amounte=m;
    }
}
