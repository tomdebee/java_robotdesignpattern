package nl.sogyo.Robo2;

import java.util.ArrayList;

public class QueueRunner {

	private ArrayList<ICommand> dostack = new ArrayList<ICommand>();
	private ArrayList<ICommand> undostack = new ArrayList<ICommand>();

	public void setCommand(ICommand commando) {
		dostack.add(commando);
	}

	public void roundOf5Execute() {
		for (int i = 0; i < 5; i++) {
			execute();
		}
	}

	public void execute() {
		try {
			dostack.get(0).execute();
			undostack.add(dostack.get(0));
			dostack.remove(0);
		} catch (IndexOutOfBoundsException ioobe) {
			System.out.println("Not enough moves entered.");
		} 
	}
	
	public void undo() {
		try {
			int lastAction = undostack.size()-1;
			undostack.get(lastAction).undo();
			undostack.remove(lastAction);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("No further history available, returning starting position.");
		}
	}
	
}
