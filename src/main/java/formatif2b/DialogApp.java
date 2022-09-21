package formatif2b;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class DialogApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label mainlabel = new Label("Pratique de dialogue");
        primaryStage.setScene(new Scene(mainlabel));
        //Pour que l'application se termine normalement lorsqu'on ferme la fenêtre principale il faut faire:
        primaryStage.setOnCloseRequest(e-> Platform.exit());
        primaryStage.show();

        // TODO1 faites afficher un dialogue simple d'information qui indique votre nom en titre et le nom du cours en contenu





        // TODO2 faites afficher un dialogue qui demande une confirmation.  changer l'étiquette de la fenêtre principale pour montrer le choix: refuser ou accepter




        // TODO3 faites afficher un dialogue qui demande un choix entre vendredi, samedi ou dimanche à l'aide de 3 boutons




        // TODO4 faites afficher un dialogue qui demande à l'utilisatur d'entrer son nom dans une boite de texte




        // TODO5 faites afficher un dialogue qui demande à l'utilisateur d'entrer un jour de la semaine en le sélectionnant dans une liste. Le samedi est la valeur par défaut






        // TODO6 faites afficher un dialogue non modale qui contient un HBox avec un bouton et un textfield
        //Lorsque l'utilisateur appuie sur le bouton, le contenu du textfield est transférer dans le mainLabel







    }

    public static void main(String[] args) {
        launch();
    }
}
