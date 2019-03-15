import com.sun.javafx.charts.ChartLayoutAnimator;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import javafx.application.Application; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage; 

public class LoginForm { 
    loginAuthentication authentication;
    Scene scene;
    Stage stage;
    HomeScreen HomeScreen;

    public LoginForm(Stage stage) {
        this.stage = stage;
    }
    

   public void prepareScene() { 
   authentication=new loginAuthentication();

      //creating label email 
      Text text1 = new Text("CardNumber:");       
      Text text2 = new Text("Password:");       
      
     
	  
      //Creating Text Filed for cardnum        
      TextField cardnum = new TextField();       
       PasswordField name = new PasswordField();      
       //Setting label to the Stage
      Label validationLabel=new Label();
      
        

      //Creating Buttons 
      Button submit = new Button("Submit"); 
          

      
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
       scene = new Scene(gridPane);
             gridPane.setMinSize(300, 250); 

      
  
       
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(15); 
      gridPane.setHgap(15);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(text1, 1, 1); 
      gridPane.add(text2, 1, 3); 
      gridPane.add(cardnum, 1, 2);
      gridPane.add(name, 1, 4);
      gridPane.add(submit, 1, 5); 
      gridPane.add(validationLabel, 1, 6); 
        
      
  
      //getting user input
      submit.setOnAction((ActionEvent event) -> {
          String cardnumber = cardnum.getText();
          String Name = name.getText();
         boolean valid= authentication.validate(cardnumber,Name);
         if (valid){
          validationLabel.setText("welcome "+Name);
          stage.setScene(HomeScreen.getScene());
         }
         else
          validationLabel.setText("wrong number or password");
      }
     );
              }

    public Scene getScene() {
        return scene;
    }

    public void setHomeScreen(HomeScreen HomeScreen) {
        this.HomeScreen = HomeScreen;
    }
            

  
   }
     