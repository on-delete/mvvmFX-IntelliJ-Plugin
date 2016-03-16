import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import de.saxsys.mvvmfx.guice.MvvmfxGuiceApplication;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends MvvmfxGuiceApplication {

    public static void main(String... args) {
        launch(args);
    }


    @Override
    public void startMvvmfx(Stage stage) throws Exception {
        stage.setTitle("Hello World Application");

        ViewTuple<HelloWorldView, HelloWorldViewModel> viewTuple = FluentViewLoader.fxmlView(HelloWorldView.class)
                .load();

        Parent root = viewTuple.getView();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
