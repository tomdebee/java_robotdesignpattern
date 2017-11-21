package nl.sogyo.Robo2;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandQueue implements IContainer {
    public ArrayList<ICommand> commands = new ArrayList<ICommand>();

    public Iterator getMoveQueue() {
        return new MoveIterator();
    }

    public void addCommand(ICommand command){
        commands.add(command);
    }

    private class MoveIterator implements Iterator {

        int index;

        public boolean hasNext() {

            if(index < commands.size()){
                return true;
            }
            return false;
        }

        public Object next() {

            if(this.hasNext()){
                return commands.get(index++);
            }
            remove();
            return null;
        }

        public void remove() {
            commands.clear();
        }
    }
}
