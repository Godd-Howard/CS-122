/**
 * Made by Kurtis Yoder
 *
 * This program asks the user whether they
 * want to flip one or two coins. Then flips the
 * coin(s) and displays whether they are
 * heads or tails.
 */


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class CoinFlip extends Application
{



  public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage) throws FileNotFoundException
   {
     
      // Create an Image1 object.
      FileInputStream inputstream1 =
     new FileInputStream("C:\\Users\\kurti\\"
      + "eclipse-workspace\\CoinFlip\\penny_heads.png");
      Image image1 = new Image(inputstream1);
      // Create an ImageView1 object.
      ImageView imageView1 = new ImageView(image1);
      ImageView imageView3 = new ImageView(image1);
     
      //Setting the fit height and width of the image view
      imageView1.setFitHeight(100);
      imageView1.setFitWidth(100);  
      imageView3.setFitHeight(100);
      imageView3.setFitWidth(100);
     
      // Create an Image2 object.
      FileInputStream inputstream2 =
     new FileInputStream("C:\\Users\\kurti\\"
      + "eclipse-workspace\\CoinFlip\\penny_tails.png");
      Image image2 = new Image(inputstream2);
      // Create an ImageView2 object.
      ImageView imageView2 = new ImageView(image2);
      ImageView imageView4 = new ImageView(image2);
      //Setting the fit height and width of the image view
      imageView2.setFitHeight(100);
      imageView2.setFitWidth(100);
      imageView4.setFitHeight(100);
      imageView4.setFitWidth(100);
   
      //Create labels used for user clarity          
      Label messageLabel = new Label("Would you like to flip one "
      + "or two coins?");
      Label messageLabel1 = new Label("Heads!");
      Label messageLabel2 = new Label("Tails!");
      Label messageLabel3 = new Label("Heads!");
      Label messageLabel4 = new Label("Tails!");
     
     
      //Radio buttons that allow user choose
      RadioButton radio1 = new RadioButton("Flip One Coin");
      RadioButton radio2 = new RadioButton("Flip Two Coins");
      //Create toggle group for radio buttons
      ToggleGroup radioGroup = new ToggleGroup();
      //Add radio buttons to toggle group
      radio1.setToggleGroup(radioGroup);
      radio2.setToggleGroup(radioGroup);
     
     
     
      // Add the Scene to the Stage.
      VBox vbox = new VBox(5, messageLabel, radio1, radio2,
      messageLabel1, imageView1, messageLabel2, imageView2,
      messageLabel3, imageView3, messageLabel4, imageView4);
     
      //Set images and text to invisible
      messageLabel1.setVisible(false);
      messageLabel2.setVisible(false);
      imageView1.setVisible(false);
      imageView2.setVisible(false);
      messageLabel3.setVisible(false);
      messageLabel4.setVisible(false);
      imageView3.setVisible(false);
      imageView4.setVisible(false);
   
      //Align scene content in center
      vbox.setAlignment(Pos.CENTER);
      //Set up the scene for the stage
      Scene scene = new Scene(vbox, 1200, 600);
      primaryStage.setTitle("Coin Flip");
      primaryStage.setScene(scene);    
      primaryStage.show();
     
      // Create instance of Random class
      Random rand = new Random();

     
   
      // Register an ActionEvent handler for radio2
      radio1.setOnAction(event ->
      {
      //Clear other content not needed
      vbox.getChildren().removeAll(messageLabel, radio1, radio2);
         
          //Get random integer
          int randInt1 = rand.nextInt(2) + 1;
         
          //Determine heads or tails
          if(randInt1 == 1)
          {
          //Make room for images
          vbox.getChildren().removeAll(messageLabel2, imageView2,
          messageLabel3, imageView3, messageLabel4, imageView4);
          //Make image visible
          messageLabel1.setVisible(true);
          imageView1.setVisible(true);
          }
          else if(randInt1 == 2)
          {
          //Make room for images
          vbox.getChildren().removeAll(messageLabel1, imageView1,
          messageLabel3, imageView3, messageLabel4, imageView4);
          //Make image visible
          messageLabel2.setVisible(true);
          imageView2.setVisible(true);
          }
      });
     
      // Register an event handler for radio1
      radio2.setOnAction(event ->
      {
     //Clear other content not needed
     vbox.getChildren().removeAll(messageLabel, radio1, radio2);
         
          //Get random integers
          int randInt2 = rand.nextInt(2) + 1;
          int randInt3 = rand.nextInt(2) + 1;
         
          //Determine heads or tails for coin one
          if(randInt2 == 1)
          {
          //Make image visible
          messageLabel1.setVisible(true);
          imageView1.setVisible(true);
          }
          else if(randInt2 == 2)
          {
          //Make image visible
          messageLabel2.setVisible(true);
          imageView2.setVisible(true);
          }
         
          //Determine heads or tails for coin one
          if(randInt3 == 1)
          {
         //Make room for images
         if(imageView1.isVisible())
         {
         vbox.getChildren().removeAll(messageLabel2, imageView2);
         }
         else if(imageView2.isVisible())
         {
         vbox.getChildren().removeAll(messageLabel1, imageView1);
         }
         vbox.getChildren().removeAll(messageLabel4, imageView4);
         //Make image visible
              messageLabel3.setVisible(true);
         imageView3.setVisible(true);
          }
          else if(randInt3 == 2)
          {
         //Make room for images
         if(imageView1.isVisible())
         {
         vbox.getChildren().removeAll(messageLabel2, imageView2);
         }
         else if(imageView2.isVisible())
         {
         vbox.getChildren().removeAll(messageLabel1, imageView1);
         }
         vbox.getChildren().removeAll(messageLabel3, imageView3);
         //Make image visible
         messageLabel4.setVisible(true);
         imageView4.setVisible(true);
          }
      });
     
     
     
     
     
     
   }
   
   
   
   
}
