package dad.javafx.circulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleView extends GridPane {

	private TextField radioText;
	private Label areaText, perimetroText;
	private Label radioLabel;
	private Label areaLabel, perimetroLabel;
	private Circle circleShape;
	
	public CircleView() {
		super();
		
		radioLabel = new Label("Radio:");
		
		radioText = new TextField();
		radioText.setPromptText("Radio");
		radioText.setPrefColumnCount(5);
		
		circleShape = new Circle();
		circleShape.setRadius(40);
		circleShape.setFill(Color.RED);
		circleShape.setStrokeWidth(2);
		circleShape.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");
		
		areaText = new Label();
		perimetroText = new Label();
		
		addRow(0, radioLabel, radioText);
		addRow(1, circleShape);
		
		setColumnSpan(circleShape, 2);
		setHalignment(circleShape, HPos.CENTER);
		
		addRow(2, areaLabel, areaText);
		addRow(3, perimetroLabel, perimetroText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getRadiusTxt() {
		return radioText;
	}

	public Label getAreaTxt() {
		return areaText;
	}

	public Label getPerimeterTxt() {
		return perimetroText;
	}

	public Circle getCircleShape() {
		return circleShape;
	}
}
