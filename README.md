# Desmos-Polynom
In this project we will start an infrastructure for the next projects.
This project and the following will used directed, weighted graph. 

DGraph:  
* we describe a DGraph by hashtable that implements the nodes-Hashtable<Integer, node_data> Nodes,
and hashtable inside hashtable the implements the edges	Hashtable<node_data, Hashtable<Integer, edge_data>>  Edge. 
* if the user will entered a node or data that is existent in the graph the previous node will deleted and the new one will replace it.  
* negative weight isn't vaild !   
* if the user will entered to the edge constructor 2 equals key the function won't do nothing

Graph_Algo : 
* we derscrib the a Graph_Algo by graph graph.  
* in the methods init from file and save we used serializable and deserializable.   
* the function "isconnected" check if the graph is connected by check for each node_data if it's get to the other nodes, if itsn't 
she will return false.
* the function "shortestPathDist" check if there is a shortest path between the 2 node_data that we entered here by setweight and
dijkstras function. setweight function set all the weight of the nodes to infinty and the tag to 0.  than we pass all the nodes with 
dijkstras algorithm . the function will return the distance between them. if there aren't path between them she will return infinty(999999.8E) . 
* the function "shortestPath" check if there is a shortest path between the 2 node_data that we enetered there key as listed earlier, 
this function will return "null" if there isn't a path between the 2 noes that we gets. this function retrurn a list of node_data that is
the shortest path.
* the function "TSP" check if there is a short path between a list of keys of nodes that she gets by ask for the shortest path between 2 nodes 
each time, she will return the path that is the shortest by List <node_data> . if there isn't a path between 2 nodes she will return "null".
