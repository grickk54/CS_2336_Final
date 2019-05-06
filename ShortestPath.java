//Action perform on buttonToShortestPath
buttonToShortestPath.setOnAction(e ->
{
try
{
int u = Integer.parseInt(txtFieldStartVertex1.getText().trim());
if (u < 0 || u >= listOb.size())
labelStatus.setText("Vertez" + u + "is not in the graph");
int v = Integer.parseInt(tfEndVertex1.getText().trim());
if (v < 0 || v >= listOb.size())
lavelStatus.setText("Vertex" + v + "is not in the graph");

//call updateGraph method
updateGraph();
AbstractGraph.Tree tree = graphVar.getShortestPath(u);
List path = tree.getPath(v);

//set tree to null
viewOb.set_Tree(null);
viewOb.set_Path(path);

//call repaintMethod()
viewOb.repaintMethod();
}
catch(Exception ex)
{
ex.printStackTrace();
}
});
}

//create updateGraph method to update
private void updateGraph()
{
ArrayList listOfedgesObject = new ArrayList<>();
for (int i = 0; i < edgesObject.size();i++)
{
int x = listOb.indexOf(edgesObject.get(i).u);
int y = listOb.indexOf(edgesOvject.get(i).v);
int w = (int)Vertex.get_Distance(edgesObject.get(i).u, edgesOcject.get(i).v);
listOfedgesObject.add(new WeightedEdge(x,y,w));
listOfedgesObject.add(new WeightedEdge(y,x,w));
}
graphVar = new WeightedGraph(listOb, listOfedgesObject);
}