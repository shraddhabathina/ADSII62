import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;


class AdjList2 
{
	LinkedList<Integer>[] list;
	int v;
	AdjList2(int v)
	{
		this.v=v;
		list=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			list[i]=new LinkedList<Integer>();
		}
	}
	
	void addedge(int v,int e)
	{
		list[v].add(e);
		list[e].add(v);
	}
	
	void display()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println(list[i]);
		}
	}
	
}

class Digraph
{
	int V;
	int E;
    AdjList2[] bag;
    int[] indegree;
    public Digraph(int V) 
    {
        this.V = V;
        this.E = 0;
        indegree = new int[V];
        bag = (AdjList2[]) new AdjList2[V];
        for (int v = 0; v < V; v++) 
        {
            bag[v] = new AdjList2(v);
        }
    }	
    
    public Digraph(Digraph G) 
    {
        this(G.V);
        this.E = G.E;
        for (int v = 0; v < V; v++) {
            this.indegree[v] = G.indegree[v];
        }
    }
}


public class Solution 
{
	public void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int k=sc.nextInt();
		AdjList2 adj=new AdjList2(N);
		Digraph dg=new Digraph(N);
		for(int i=0;i<k;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int d=sc.nextInt();
			adj.addedge(a, b);
		}
		// Self loops are not allowed...
		// Parallel Edges are allowed...
		// Take the Graph input here...

		String caseToGo = sc.nextLine();
		switch (caseToGo) 
		{
		case "Graph":
			adj.display();
			break;

		case "DirectedPaths":
			
			// Handle the case of DirectedPaths, where two integers are given.
			// First is the source and second is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		case "ViaPaths":
			// Handle the case of ViaPaths, where three integers are given.
			// First is the source and second is the via is the one where path should pass through.
			// third is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		default:
			break;
		}

	}
}