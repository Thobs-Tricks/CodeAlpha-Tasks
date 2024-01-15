import java.util.StringTokenizer;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author THOBEJANE SK
 * @version Task 1 - Word Counter
 */
public class Counter extends StackPane
{
	private VBox vDisp;
	private String parag;
	
	
	public Counter()
	{
		vDisp = new VBox();
		vDisp.setSpacing(5);
		
		Label lblWords = new Label("Type your paragraph here:");
		TextArea txtWords = new TextArea();
		
		HBox hCount = new HBox();
		hCount.setSpacing(20);
		TextField txtCount = new TextField();
		Button btnCount = new Button("Count");
		
		hCount.getChildren().addAll(btnCount,txtCount);
		
		txtWords.setWrapText(true);
		txtCount.setEditable(false);
		
		btnCount.setOnAction(e -> 
		{
			parag = "";
			parag = txtWords.getText().toString();
						
			int st = new StringTokenizer(parag, " ").countTokens();
			txtCount.setText(st + " Word(s) Used.");
			
		});
		
		vDisp.getChildren().addAll(lblWords,txtWords,hCount);
		this.getChildren().add(vDisp);
	}
	
}
