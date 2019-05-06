//action perform on buttonMST

buttonMST.setOnAction(e ->)
{
//call UpdateGraph() method
updateGraph();
WeightedGraph.Tree tree = 
graphVar.getMinimumSpanningTree();
//set tree
viewOb.set_Tree(tree);
//set path is null repaintMethod
viewOb.set_Path(null);
});

//action perform on buttonAIISP
buttonAIISP.setOnAction(e ->)
{
try{
int u = Integer.parseInt(txtFieldStartVertex.getText().trim());
if (u < 0 || u >= listOb.size())
labelStatus.setText("Vertex" + u + "is not in the graph");
updateGraph();
AbstractGraph.Tree tree = graphVar.getShortestPath(u);

//set the tree
viewOb.set_Tree(tree);

//call repaintMethod() Method
viewOb.repaintMethod();
}
catch (Exception ex)
{
ex.printStackTrace();
}
});