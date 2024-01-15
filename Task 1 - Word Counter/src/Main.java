import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author THOBEJANE SK
 * @version Task 1 - Word Counter
 */
public class Main extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg) throws Exception {
		// TODO Auto-generated method stub
		Counter count = new Counter();
		
		Scene scn = new Scene(count,450,250);
		
		arg.setTitle("Word Counter");
		arg.setResizable(false);
		arg.setScene(scn);
		arg.show();
	}

}
