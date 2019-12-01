package dad.javafx.triangulo;

import dad.javafx.shapes.Triangle;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TriangleView extends GridPane {

	private TextField baseText, heightText;
	private Label areaText, perimeterText;
	private Label baseLabel, heightLabel;
	private Label areaLabel, perimeterLabel;
	private Triangle triangleforma;
	
	public TriangleView() {
		super();
		
		baseLabel = new Label("Base:");
		heightLabel = new Label("Altura:");
		
		baseText = new TextField();
		baseText.setPromptText("Base");
		baseText.setPrefColumnCount(5);
		heightText = new TextField();
		heightText.setPromptText("Altura");
		heightText.setPrefColumnCount(5);
		
		triangleforma = new Triangle(80,60);
		triangleforma.setFill(Color.GREEN);
		triangleforma.setStrokeWidth(2);
		triangleforma.setStroke(Color.BLACK);	
		
		areaLabel = new Label("Area:");
		perimeterLabel = new Label("Perímetro:");
		
		areaText = new Label();
		perimeterText = new Label();

		addRow(0, baseLabel, baseText);
		addRow(1, heightLabel, heightText);
		addRow(2, triangleforma);
		
		setColumnSpan(triangleforma, 2);
		setHalignment(triangleforma, HPos.CENTER);
		
		addRow(3, areaLabel, areaText);
		addRow(4, perimeterLabel, perimeterText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getBaseTxt() {
		return baseText;
	}

	public TextField getHeightTxt() {
		return heightText;
	}

	public Label getAreaTxt() {
		return areaText;
	}

	public Label getPerimeterTxt() {
		return perimeterText;
	}

	public Triangle getTriangleShape() {
		return triangleforma;
	}

}
