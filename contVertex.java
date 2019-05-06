//create get_containingVertex
Vertex get_ContainingVertex(double x, double y)
{
for (int = 0; i < listOb.size(); i++)
{
if (listOb.get(i).contains(x,y))
{
return listOb.get(i);
}
}
return null;
}

//create removeAdjacentEdgesObject method
void removeAdjacentEdgesObject(Vertex vertex)
{
for (int i = 0; i < edgesObjects.size(); i++)
{
if (edgesObject.get(i).u.equals(vertex) || edgesObject.get(i).v.equals(vertex))
{
edgesObject.remove(i--);
}
}
}
