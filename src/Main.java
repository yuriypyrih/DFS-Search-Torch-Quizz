
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DFS Search Algorithm");
		Node startNode = new Node(STATE.BEFORE_BRIDGE);
		
		DepthFirstSearch dfs = new DepthFirstSearch(startNode);
		
		long startTimer = System.currentTimeMillis();
		long stopTimer,totalTimer;
		
		dfs.compute();
		
		stopTimer = System.currentTimeMillis();
		totalTimer = stopTimer - startTimer;
		System.out.println("Runtime Timer: " + totalTimer + " milliseconds");
	}

}
