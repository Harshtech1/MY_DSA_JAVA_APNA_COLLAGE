import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

class Student extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello from JavaFX Student class!");
        Scene scene = new Scene(label, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Student App");
        primaryStage.show();
    }


    }


public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Hello World");
        StudentTest_b s1 = new StudentTest_b();
        System.out.println(s1.name);
    }
}

class StudentTest_b {
    String name;
    int roll;
    
    StudentTest_b() {
        System.out.println("Constructor called");
    }
}