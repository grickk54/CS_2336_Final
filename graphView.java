//create graphview class that extends pane

class GraphView extends Pane
{
//set starting vertex to null
private Vertex startV = null;
private boolean LineOnOrNot = false;
private double endOfLineX, endOfLineY;

//set tree to null
private AbstractGraph.Tree tree = null;

//set path to null
private list path = null;

//create line object
private Line line = new Line();
GraphView()
{

//set action to perform by pressing on mouse click
setOnMousePressed(e ->)
{
if (e.getButton() == MouseButton.PRIMARY)
{
Vertex c = get_ContainingVertex(e.getX(), e.getY());

//excuse if c is not null
if (c != null)
{
if (!LineOnOrNot)
{
starV = C;

//set true
LineOnOrNot = true;

//set x and y to starting value
line.setStartX(e.getX());
line.setStartY(e.getY());

//set x and y to ending value
line.setEndX(e.getX());
line.setEndY(e.getY());
}
}
else
{
listOb.add(new Vertex(e.getX(), e.getY()));
viewOb.set_Tree(null);}
}
else if(e.getButton() == MouseButton.SECONDARY)
{

//removes vertex
Vertex ct = get_ContainingVertex(e.getX(), e.getY());
if (ct != null)
{
listOb.remove(ct);
removeAdjacentEdgesObject(ct);

//set tree is null to invoke repaintMethod()
viewOb.set_Tree(null);
}
}
});
setOnMouseReleased(e ->)
{
Vertex c = get_ContainingVertex(e.getX(), e.getY());
if (LineOnOrNot && c != null && !c.equals(startV))
{

//Add a new edge
edgesObject.add(new Edge(startV, c));

//set tree is null to invoke repaintMethod()
viewOb.set_Tree(null);

//set path is null to invoke repaintMethod()
viewOb.set_Path(null);
}
line.setStartX(0);
line.setStartY(0);
line.setEndX(0);
line.setEndY(0);
LineOnOrNot = false;

//call repaintMethod
reapintMethod();
});

//set on mouse to drag vertex
setOnMouseDragged(e ->{
if (e.isControlDown())
{
LineOnOrNot = false;
Vertex c = get_ContainingVetex(e.getX();
e.getY()0;
if(c != null)
{
c.setX(e.getX());
c.setY(e.getY());

//set tree is null to invoke repaintMethod()
viewOb.set_Tree(null);

//set path is null to invoke repaintMethod()
viewOb.set_Path(null);
}
}
else if (LineOnOrNot)
{
line.setEndX(e.getX());
line.setEndY(e.getY());

//repaintMethod();
}
});
}