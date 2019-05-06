@Override

publci void start(Stage primaryStage)
{
txtFieldStartVertex.setPrefColumnCount(2);
txtFieldStartVertex1.setPrefColumnCount(2);
tfEndVertex1.setPrefColumnCount(2);
HBox hTypeBox1 = new HBox(5);

//set style

hTypeBox1.setStyle("-border-color:black");
hTypeBox1.getChildren().addAll(new Label("Source vertex: ");
new Label("Source vertex: ");
txtFieldStartVertex, buttonAIISP);
HBox hBox2 = new HBox(5);
hBox2.getChildren().addAll(new Label("Starting vertex:");
txtFieldStartVertex1, new Label("Ending vertex:"),
tfEndVertex1, buttonToShortestPath);
VBox vTypeBox = new VBox(5);
vTypeBox.setStyle("-fx-border-color: black");
vTypeBox.getChildren().addAll(
new Label("Find a shortest path"), hBox2);
HBox hTypeBox = new HBox(5);

//set alignment of the box
hTypeBox.setAlignment(Pos.CENTER);
hTypeBox.getChildren().addAll(buttonMST,
hTypeBox1, vTypeBox);

//create and object of BorderPane
BorderPane pane = new BorderPane();

//set view in center position
pane.setCenter(viewOb);

//set in bottom position
pane.setBottom(hTypeBox);

//set label to top
pane.setTop(labelStatus);

//set alignment of the pane
BorderPane.setAlignment(labelStatus, Pos.CENTER);

//In the stage create scene and place it
Scene sceneOb = new Scene(pane, 980, 350);

//set title
primaryStage.setTitle("Weighted Graph");

//set the scene
primaryStage.setScene(sceneOb);

//display stage
primaryStage.show();

//call repaintMethod() method
viewOb.repaintMethod();