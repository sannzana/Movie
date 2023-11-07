package com.example.tesst;
import javafx.collections.transformation.SortedList;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Node;
import javafx.scene.control.ProgressBar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.function.Predicate;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class dashboard  implements Initializable {
    @FXML
    private ProgressBar progressBar_update_addmovie;
    @FXML
    private Button addMovie_btn;

    @FXML
    private Button addMovie_clearBtn;

    @FXML
    private TableColumn<moviesData,String> addMovie_col_duration;

    @FXML
    private TableColumn<moviesData,String> addMovie_col_genre;
    @FXML
    private TableColumn<moviesData,String> addMovie_col_director;

    @FXML
    private TableColumn<moviesData,String> addMovie_col_movieTitle;

    @FXML
    private TableColumn<moviesData,String> addMovie_col_publishedDate;



    @FXML
    private Button addMovie_deleteBtn;

    @FXML
    private TextField addMovie_duration;

    @FXML
    private AnchorPane addMovie_form;

    @FXML
    private TextField addMovie_genre;

    @FXML
    private ImageView addMovie_imageview;

    @FXML
    private Button addMovie_import;

    @FXML
    private Button addMovie_insertBtn;

    @FXML
    private TextField addMovie_search;

    @FXML
    private TableView<moviesData> addMovie_tableView;

    @FXML
    private TextField addMovie_title;


    @FXML
    private Button addMovie_updateBtn;

    @FXML
    private Label admin;

    @FXML
    private Label availableMovie_NormalClass_price;

    @FXML
    private Spinner<?> availableMovie_NormalClass_quantity;
    @FXML
    private TextField addMovie_Director;
    @FXML
    private Label availableMovie_SpecialClass_pricr;

    @FXML
    private Spinner<?> availableMovie_SpecialClass_quantity;

    @FXML
    private Button availableMovie_btn;

    @FXML
    private Button availableMovie_buyBtn;

    @FXML
    private Button availableMovie_clearBtn;

    @FXML
    private TableColumn<?, ?> availableMovie_col_date;

    @FXML
    private TableColumn<?, ?> availableMovie_col_genre;

    @FXML
    private TableColumn<?, ?> availableMovie_col_movieTitle;

    @FXML
    private TextField availableMovie_date;

    @FXML
    private AnchorPane availableMovie_form;

    @FXML
    private TextField availableMovie_genre;

    @FXML
    private ImageView availableMovie_imageView;

    @FXML
    private TextField availableMovie_movieTitle;

    @FXML
    private Button availableMovie_receiptBtn;

    @FXML
    private Button availableMovie_selectMovie_btn;

    @FXML
    private TableView<?> availableMovie_tableView;

    @FXML
    private Label availableMovie_title;

    @FXML
    private Button close;

    @FXML
    private Label customer_MovieTitle;

    @FXML
    private Button customer_btn;

    @FXML
    private Button customer_clearBtn;

    @FXML
    private TableColumn<?, ?> customer_col_date;

    @FXML
    private TableColumn<?, ?> customer_col_genre;

    @FXML
    private TableColumn<?, ?> customer_col_movieTitle;

    @FXML
    private TableColumn<?, ?> customer_col_ticketNum;

    @FXML
    private TableColumn<?, ?> customer_col_time;

    @FXML
    private Label customer_date;

    @FXML
    private Button customer_deleteBtn;

    @FXML
    private AnchorPane customer_form;

    @FXML
    private Label customer_genre;

    @FXML
    private TextField customer_search;

    @FXML
    private Label customer_ticketNumber;

    @FXML
    private Label customer_time;

    @FXML
    private AnchorPane dashboard_availableMovies;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private AnchorPane dashboard_totalEarnToday;

    @FXML
    private AnchorPane dashboard_totalSold;

    @FXML
    private AnchorPane ediScreening_form;

    @FXML
    private Button editScreen_btn;

    @FXML
    private TableColumn<moviesData,String> editScreening_col_current;

    @FXML
    private TableColumn<moviesData,String> editScreening_col_duration;

    @FXML
    private TableColumn<moviesData,String> editScreening_col_genre;

    @FXML
    private TableColumn<moviesData,String> editScreening_col_movieTitle;

    @FXML
    private ComboBox<?> editScreening_current;

    @FXML
    private Button editScreening_deleteBtn;

    @FXML
    private ImageView editScreening_imageView;

    @FXML
    private TextField editScreening_search;

    @FXML
    private TableView<moviesData> editScreening_tableView;

    @FXML
    private Label editScreening_title;

    @FXML
    private Button editScreening_updateBtn;

    @FXML
    private Button minimize;

    @FXML
    private Button signout_btn;

    @FXML
    private AnchorPane topForm;

    @FXML
    private AnchorPane username_form;
    @FXML
    private DatePicker addMovie_dateP;



    @FXML
    void handleMouseEntered_1(MouseEvent event) {
        addMovie_btn.setStyle("-fx-background-color: #fff;" +
                "-fx-text-fill: #000;-fx-font-size: 14px;");
    }

    @FXML
    void handleMouseExit_1(MouseEvent event) {
        addMovie_btn.setStyle("-fx-background-color: TRANSPARENT; -fx-text-fill: #fff;-fx-alignment: CENTER_LEFT;");

    }
    @FXML
    void handleMouseEntered_2(MouseEvent event) {
        availableMovie_btn.setStyle("-fx-background-color: #fff;" +
                "-fx-text-fill: #000;-fx-font-size: 14px");
    }

    @FXML
    void handleMouseExit_2(MouseEvent event) {
        availableMovie_btn.setStyle("-fx-background-color: TRANSPARENT; -fx-text-fill: #fff;-fx-alignment: CENTER_LEFT;");

    }
    @FXML
    void handleMouseEntered_3(MouseEvent event) {
        customer_btn.setStyle("-fx-background-color: #fff;" +
                "-fx-text-fill: #000;-fx-font-size: 14px");
    }

    @FXML
    void handleMouseExit_3(MouseEvent event) {
        customer_btn.setStyle("-fx-background-color: TRANSPARENT; -fx-text-fill: #fff;-fx-alignment: CENTER_LEFT;");

    }
    @FXML
    void handleMouseEntered_4(MouseEvent event) {
        dashboard_btn.setStyle("-fx-background-color: #fff;" +
                "-fx-text-fill: #000;-fx-font-size: 14px");
    }

    @FXML
    void handleMouseExit_4(MouseEvent event) {
        dashboard_btn.setStyle("-fx-background-color: TRANSPARENT; -fx-text-fill: #fff;-fx-alignment: CENTER_LEFT;");

    }
    @FXML
    void handleMouseEntered_5(MouseEvent event) {
        editScreen_btn.setStyle("-fx-background-color: #fff;" +
                "-fx-text-fill: #000;-fx-font-size: 14px");
    }

    @FXML
    void handleMouseExit_5(MouseEvent event) {
        editScreen_btn.setStyle("-fx-background-color: TRANSPARENT; -fx-text-fill: #fff;-fx-alignment: CENTER_LEFT;");

    }


    @FXML
    void handleMouseEntered_6(MouseEvent event) {
        signout_btn.setStyle("-fx-background-color: #fff;" +
                "-fx-text-fill: #000;-fx-font-size: 14px");
    }

    @FXML
    void handleMouseExit_6(MouseEvent event) {
        signout_btn.setStyle("-fx-background-color: TRANSPARENT; -fx-text-fill: #fff;-fx-alignment: CENTER_LEFT;");

    }
    @FXML
    void handleMouseEntered_7(MouseEvent event) {
       close.setStyle("-fx-background-color: #ea1111;" +
                "-fx-font-size: 14px ;-fx-text-fill: #fff");
    }

    @FXML
    void handleMouseExit_7(MouseEvent event) {
       close.setStyle("-fx-background-color: transparent ;-fx-text-fill: #000");

    }
    @FXML
    void handleMouseEntered_8(MouseEvent event) {
       minimize.setStyle("-fx-background-color: #ea1111;" +
                "-fx-font-size: 14px; -fx-text-fill: #fff");
    }

    @FXML
    void handleMouseExit_8(MouseEvent event) {
        minimize.setStyle("-fx-background-color: transparent ;-fx-text-fill: #000");

    }

//public String c="helllo" username at the place of c;
  public void displayUsername()
  {
    admin.setText(getData.username);

  }

  public void switchForm(ActionEvent event) {
      if (event.getSource() == dashboard_btn) {
          dashboard_form.setVisible(true);
          addMovie_form.setVisible(false);
          availableMovie_form.setVisible(false)
          ;
          ediScreening_form.setVisible(false);
          customer_form.setVisible(false);

      } else if (event.getSource() == addMovie_btn) {
          dashboard_form.setVisible(false);
          addMovie_form.setVisible(true);
          availableMovie_form.setVisible(false)
          ;
          ediScreening_form.setVisible(false);
          customer_form.setVisible(false);


      } else if (event.getSource() == availableMovie_btn) {
          dashboard_form.setVisible(false);
          addMovie_form.setVisible(false);
          availableMovie_form.setVisible(true)
          ;
          ediScreening_form.setVisible(false);
          customer_form.setVisible(false);

      } else if (event.getSource() == editScreen_btn) {
          dashboard_form.setVisible(false);
          addMovie_form.setVisible(false);
          availableMovie_form.setVisible(false)
          ;
          ediScreening_form.setVisible(true);
          customer_form.setVisible(false);


      } else if (event.getSource() == customer_btn) {
          dashboard_form.setVisible(false);
          addMovie_form.setVisible(false);
          availableMovie_form.setVisible(false)
          ;
          ediScreening_form.setVisible(false);
          customer_form.setVisible(true);


      }
  }
private Image image;
  private double x=0;
    private double y=0;
    private Alert alert;

//database tools
   private PreparedStatement prepare;
   private Statement statement;
   private ResultSet result;
    private Connection connect;

    public void searchMovie(){
        FilteredList <moviesData>filter =new  FilteredList<>(listAddMovies, e-> true);
        addMovie_search.textProperty().addListener((observable ,oldValue,newValue)->{
            filter.setPredicate(predicateMoviesData->{

                if(newValue.isEmpty()|| newValue==null){

                    return true;

                }
                String keySearch=newValue.toLowerCase();
                if(predicateMoviesData.getTitle().toLowerCase().contains(keySearch)){return true;}
                else if(predicateMoviesData.getGenre().toLowerCase().contains(keySearch)){return true;}
                else if(predicateMoviesData.getDuration().toLowerCase().contains(keySearch)){return true;}
                else if(predicateMoviesData.getDate().toString().contains(keySearch)){return true;}
                else if(predicateMoviesData.getDirector().toLowerCase().contains(keySearch)){return true;}

                return false;


            });



        });

        SortedList<moviesData>sortData=new SortedList<>(filter);
        sortData.comparatorProperty().bind(addMovie_tableView.comparatorProperty());

        addMovie_tableView.setItems(sortData);

    }





    public void clearAddMovieList()
    {
        addMovie_title.setText("");
        addMovie_genre.setText("");
        addMovie_duration.setText("");
        addMovie_imageview.setImage(null);
        addMovie_dateP.setValue(null);
        addMovie_Director.setText("");


    }



    public ObservableList<moviesData> addMoviesList()
    { ObservableList<moviesData>listData= FXCollections.observableArrayList();
        String sql="SELECT * FROM moviee";
        connect=database.connectDB();
        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            moviesData movD;
            while (result.next()) {
                movD = new moviesData(result.getInt("id"),result.getString("movieTitle"), result.getString("genre")
                        , result.getString("duration"), result.getString("image"), result.getDate("date"),
                        result.getString("director"), result.getString("current"));

                listData.add(movD);
            }
        } catch(Exception e){e.printStackTrace();}
        return listData;
    }

private int countId;

    public void movieId(){
        String sql= "SELECT count(id) FROM moviee";
        connect=database.connectDB();
        try{
         prepare=connect.prepareStatement(sql);
         result=prepare.executeQuery();

         if(result.next()){
             getData.movieId=result.getInt("count(id)");

         }


        }catch (Exception e){e.printStackTrace();}



    }




public void importImage(){
    FileChooser open = new FileChooser();
open.setTitle("Open Image File");
//open.getExtensionFilters().add(new ExtensionFilter("Image Files", "*.png", "*.jpg")); // PROBLEM
open.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg"))   ;

    Stage stage = (Stage) addMovie_form.getScene().getWindow();
    File file = open.showOpenDialog(stage);
        if(file!=null)
        {
            image=new Image(file.toURI() .toString(),244,296,false,true);
            addMovie_imageview.setImage(image);
getData.path=file.getAbsolutePath();


        }




    }

public void insertAddMovies()
{

   String sql1="SELECT * From moviee WHERE movieTitle='"
           +  addMovie_title.getText()+"'";
   connect=database.connectDB();

   try{
   statement = connect.createStatement();
   result=statement.executeQuery(sql1);

   if(result.next()){

       alert = new Alert(Alert.AlertType.ERROR);
       alert.setTitle("Error Message");
       alert.setHeaderText(null);
       alert.setContentText(addMovie_title.getText()+" was already added!");
       alert.showAndWait();


   }

   else {

       if(addMovie_title.getText().isEmpty()||
                addMovie_genre.getText().isEmpty()||
                addMovie_duration.getText().isEmpty()||addMovie_imageview.getImage()==null||
                addMovie_dateP.getValue()==null
                ||addMovie_Director.getText().isEmpty())
       {
           alert = new Alert(Alert.AlertType.ERROR);
           alert.setTitle("Error Message");
           alert.setHeaderText(null);
           alert.setContentText("Please fill all blank fields");
           alert.showAndWait();
       }
       else{

           String sql="INSERT INTO moviee (id,movieTitle,genre,duration,image,date,director) VALUES (?,?,?,?,?,?,?)" ;
           String uri=getData.path;
           uri=uri.replace("\\","\\\\");

movieId();
           String mId= String.valueOf(getData.movieId+1);


           prepare= connect.prepareStatement(sql);
           prepare.setString(1,mId);
           prepare .setString(2,addMovie_title.getText());
           prepare .setString(3,addMovie_genre.getText());
           prepare .setString(4,addMovie_duration.getText());
           prepare .setString(5,uri);
           prepare .setString(6,String.valueOf(addMovie_dateP.getValue()));

           prepare .setString(7,addMovie_Director.getText());

          prepare.execute();
           alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setTitle("Information Message");
           alert.setHeaderText(null);
           alert.setContentText("Successfully added new movie!");
           alert.showAndWait();


           clearAddMovieList();
           showAddMoviesList();

       }
   }



   } catch(Exception e){e.printStackTrace();}

}


    private Alert progressAlert;

    private void createProgressAlert() {
        DialogPane dialogPane = new DialogPane() {
            @Override
            protected Node createButtonBar() {
                // Create a custom button bar if needed
                return null;
            }
        };


        dialogPane.setStyle("-fx-background-color: lightblue;");
        progressAlert = new Alert(Alert.AlertType.NONE);
        progressAlert.initModality(Modality.APPLICATION_MODAL);
        progressAlert.initStyle(StageStyle.UNDECORATED);
        progressAlert.getDialogPane().setPrefWidth(300);  // Set your desired width
        progressAlert.getDialogPane().setPrefHeight(150);
      //  Label titleLabel = new Label("Updating Movie");
       // progressAlert.setStyle("-fx-background-color: lightblue;");
        Label label = new Label("Updating movie, please wait.....");
        ProgressIndicator progressIndicator = new ProgressIndicator();

        VBox vbox = new VBox(label, progressIndicator);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        progressAlert.getDialogPane().setContent(vbox);
        progressAlert.getButtonTypes().setAll(ButtonType.CANCEL);

        Stage stage = (Stage) progressAlert.getDialogPane().getScene().getWindow();
        stage.setAlwaysOnTop(true);
        stage.toFront();
    }



public void updateAddmovie()
{
    String uri=getData.path;
    uri=uri.replace("\\","\\\\");

  String sql = "UPDATE moviee SET movieTitle ='"+ addMovie_title.getText()
          +"' , genre = '" + addMovie_genre.getText()
          +"' , duration ='" + addMovie_duration.getText()
          +"', image = '"+ uri
          +"' , date = '" +  addMovie_dateP.getValue()
          +"' , director = '" +addMovie_Director.getText()
          +"' WHERE id = '"+ String.valueOf(getData.movieId) +"'";

  connect=database.connectDB();

  try{
   statement=connect.createStatement();
   if(addMovie_title.getText().isEmpty()||addMovie_genre.getText().isEmpty()||
           addMovie_duration.getText().isEmpty()|| addMovie_imageview.getImage()==null||
   addMovie_dateP.getValue()==null|| addMovie_Director.getText().isEmpty())
   {

       alert = new Alert(Alert.AlertType.ERROR);
       alert.setTitle("Error Message");
       alert.setHeaderText(null);
       alert.setContentText("Please fill all blank fields");
       alert.showAndWait();


   }
   else {

       // Create and show the custom progress alert
       createProgressAlert();
       progressAlert.show();

       // Create a Task to simulate the progress
       Task<Void> task = new Task<Void>() {
           @Override
           protected Void call() throws Exception {
               Thread.sleep(2000); // Sleep for 2 seconds (simulating work)
               return null;
           }
       };
       statement.executeUpdate(sql);
       task.setOnSucceeded(event -> {

           progressAlert.setResult(ButtonType.OK); // Close the progress alert
           // Show your success message and perform other actions
           alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setTitle("Message");
           alert.setHeaderText(null);
           alert.setContentText("Movie update is done successfully!");

           alert.showAndWait();
           showAddMoviesList();
           clearAddMovieList();
       });

       new Thread(task).start(); // Start the task in a new thread
   }



  } catch (Exception e){e.printStackTrace();}


}



    private ObservableList<moviesData>listAddMovies;
    public void showAddMoviesList()
    {
        listAddMovies=addMoviesList();

        addMovie_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        addMovie_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        addMovie_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        addMovie_col_publishedDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        addMovie_col_director.setCellValueFactory(new PropertyValueFactory<>("director"));

addMovie_tableView.setItems(listAddMovies);


    }


    public void selectAddMoviesList()
    {
        moviesData movD=addMovie_tableView.getSelectionModel().getSelectedItem();
        int num=addMovie_tableView.getSelectionModel().getSelectedIndex();


        if((num -1)<-1){return;}





   getData.path=movD.getImage();
        getData.movieId=movD.getId();





addMovie_title .setText(movD.getTitle());
 addMovie_genre.setText(movD.getGenre());
        addMovie_duration.setText(movD.getDuration());
        //addMovie_imageview.setImage(getData.path);
        addMovie_Director.setText(movD.getDirector());


        DatePicker datePicker = new DatePicker();
        String uri= "file:"+movD.getImage();
        image=new Image(uri,244,296,false,true);
        addMovie_imageview.setImage(image);
        LocalDate selectedDate = movD.getDate().toLocalDate();
        addMovie_dateP.setValue(selectedDate);



    }


public void deleteAddmovie()
{

    String sql = "DELETE FROM moviee WHERE movieTitle = '"+ addMovie_title.getText() +"'";
    connect= database.connectDB();
    try{
        statement=connect.createStatement();
        if(addMovie_title.getText().isEmpty()||addMovie_genre.getText().isEmpty()||
                addMovie_duration.getText().isEmpty()|| addMovie_imageview.getImage()==null||
                addMovie_dateP.getValue()==null|| addMovie_Director.getText().isEmpty())
        {

            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please select the movie first");
            alert.showAndWait();


        }
        else{
            alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to delete the selected?");

            Optional<ButtonType>option=alert.showAndWait();
if(ButtonType.OK.equals(option.get())){
statement.executeUpdate(sql);
showAddMoviesList();
clearAddMovieList();
    alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Information Message");
    alert.setHeaderText(null);
    alert.setContentText("Successfully Deleted! ");
    alert.showAndWait();

}
else{ return; }

        }


    }


    catch(Exception e){e.printStackTrace();}

}

public void logout()
      {
signout_btn.getScene().getWindow().hide();
try{
Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
Stage stage=new Stage();
Scene scene=new Scene(root);

root.setOnMousePressed((MouseEvent event)->{
    x=event.getSceneX();
    y=event.getSceneY();

    });
root.setOnMouseDragged((MouseEvent event)->{
    stage.setX(event.getScreenX() - x);
    stage.setY(event.getScreenY() - y);


});



stage.initStyle(StageStyle.TRANSPARENT);
stage.setScene(scene);
stage.show();

  }
     catch(Exception e){e.printStackTrace();}
      }


public void close()
{
    System.exit(0);


}
public void minimize()
{
    Stage stage=(Stage)topForm.getScene().getWindow();
    stage.setIconified(true);

}


public ObservableList<moviesData>editScreeningList()
{
    ObservableList<moviesData>editList= FXCollections.observableArrayList();

    String sql="SELECT * FROM moviee";
    connect=database.connectDB();
    try{

        prepare=connect.prepareStatement(sql);
        result =prepare.executeQuery();

moviesData movD;

while(result.next()){

    movD=new moviesData(result.getInt("id"),result.getString("movieTitle"), result.getString("genre")
            , result.getString("duration"), result.getString("image"), result.getDate("date"),
            result.getString("director"), result.getString("current"));

    editList.add(movD);

}



    }catch(Exception e){e.printStackTrace();}
    return editList;
}


private String [] currentList={"Showing","End Showing"};

    public void comboBox(){
        List<String> listCurrent =new ArrayList<>();

        for(String data : currentList)
        {
            listCurrent.add(data);

        }

        ObservableList listC=FXCollections.observableArrayList(listCurrent);
        editScreening_current.setItems(listC);

    }


private ObservableList<moviesData>editScreeningL;

public void showEditScreening(){
    editScreeningL= editScreeningList();
    editScreening_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
    editScreening_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
    editScreening_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
    editScreening_col_current.setCellValueFactory(new PropertyValueFactory<>("current"));

    editScreening_tableView.setItems(editScreeningL);

}


public void updateEditScreening(){
    String sql="UPDATE moviee SET current = '"
            +editScreening_current.getSelectionModel().getSelectedItem()
            + "'WHERE movieTitle = '"+editScreening_title.getText()  +"'";

    connect=database.connectDB();
try{
 statement=connect.createStatement();
 if(editScreening_title.getText().isEmpty()|| editScreening_imageView.getImage()==null
 || editScreening_current.getSelectionModel().isEmpty()){

     alert = new Alert(Alert.AlertType.ERROR);
     alert.setTitle("Error Message");
     alert.setHeaderText(null);
     alert.setContentText("Please select the movie first");
     alert.showAndWait();


 }else{

     statement.executeUpdate(sql);

     alert = new Alert(Alert.AlertType.INFORMATION);
     alert.setTitle("Information Message");
     alert.setHeaderText(null);
     alert.setContentText("Update is done successfully!");

     alert.showAndWait();
      showEditScreening();


 }


}catch(Exception e){e.printStackTrace();}

}


public void clearEditScreening()
{
    editScreening_title.setText("");
    editScreening_imageView.setImage(null);
    editScreening_current.setSelectionModel(null);




}
public void selectEditScreening(){
    moviesData movD = editScreening_tableView.getSelectionModel().getSelectedItem();
    int num= editScreening_tableView.getSelectionModel().getFocusedIndex();


    if ((num -1)<-1){return;}
    {
     String uri="file:" +movD.getImage();
     image = new Image(uri,200,249,false,true);
     editScreening_imageView.setImage(image);
     editScreening_title.setText(movD.getTitle());
    }

}





    public void searchEditScreening(){

FilteredList<moviesData>filter =new FilteredList(editScreeningL, e->true);
editScreening_search.textProperty().addListener((observable, oldValue, newValue) ->{

    filter.setPredicate(predicateMoviesData->{
     if(newValue.isEmpty()||newValue==null)
     {return true;}

     String searchKey=newValue.toLowerCase();


     if(predicateMoviesData.getTitle().toLowerCase().contains(searchKey)||predicateMoviesData.getGenre().toLowerCase().contains(searchKey)
     ||predicateMoviesData.getDuration().toLowerCase().contains(searchKey)||predicateMoviesData.getCurrent().toLowerCase().contains(searchKey))
     {return true;}
//        if(predicateMoviesData.getGenre().toLowerCase().contains(searchKey))
//        {return true;}
//        if(predicateMoviesData.getDuration().toLowerCase().contains(searchKey))
//        {return true;}
//        if(predicateMoviesData.getCurrent().toLowerCase().contains(searchKey))
//        {return true;}


      return false;
    });



} );

SortedList<moviesData>sortData=new SortedList<>(filter);
sortData.comparatorProperty().bind(editScreening_tableView.comparatorProperty());
editScreening_tableView.setItems(sortData);

    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       displayUsername();

comboBox();
showEditScreening();

showAddMoviesList();
    }
}
