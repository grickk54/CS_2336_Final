//set_tree method

public void set_Tree(AbstractGraph.Tree tree)
{
this.tree = tree;
repaintMethod();
}

//Create set_Path method
public void set_Path(List path)
{
this.path = path;

//call repaint method()
repaintMethod();
}

//create isCloseToVertex method
boolean isCloseToVertex(double x, double, y)
{
for (int iv = 0; iv < listOb.size(); iv++)
{
if (vertex.get_Distance(listOb.get(iv.get_X(), listOb.get(iv).getY(), x,y) <= 2
*Vertex.RADIUS + 5)

{

return true;
}
}

return false;
}