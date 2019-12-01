package dad.javafx.rectangulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleView extends GridPane {

	private TextField widthText, heightText;
	private Label areaText, perimeterText;
	private Label widthLabel, heightLabel;
	private Label areaLabel, perimeterLabel;
	private Rectangle rectangleforma;
	
	public RectangleView() {
		super();
		
		widthLabel = new Label("Ancho:");
		heightLabel = new Label("Alto:");
		
		widthText = new TextField();
		widthText.setPromptText("Ancho");
		widthText.setPrefColumnCount(5);
		heightText = new TextField();
		heightText.setPromptText("Alto");
		heightText.setPrefColumnCount(5);
		
		rectangleforma = new Rectangle();
		rectangleforma.setWidth(80);
		rectangleforma.setHeight(60);
		rectangleforma.setFill(Color.rgb(0, 162, 232));
		rectangleforma.setStrokeWidth(2);
		rectangleforma.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimeterLabel = new Label("Perímetro:");
		
		areaText = new Label();
		perimeterText = new Label();

		addRow(0, widthLabel, widthText);
		addRow(1, heightLabel, heightText);
		addRow(2, rectangleforma);
		
		setColumnSpan(rectangleforma, 2);
		setHalignment(rectangleforma, HPos.CENTER);
		
		addRow(3, areaLabel, areaText);
		addRow(4, perimeterLabel, perimeterText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getWidthTxt() {
		return widthText;
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

	public Rectangle getRectangleShape() {
		return rectangleforma;
	}
}
