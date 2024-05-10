package dawidzapo.behavioral.memento.stats_case.snapshot;

import java.util.List;
import java.util.Stack;

public class History {
    private static History instance;
    private Stack<Snapshot> history;

    private History() {
        this.history = new Stack<>();
    }

    public List<Snapshot> getHistory() {
        return history;
    }
    public static History getInstance(){
        if(instance == null){
            instance = new History();
        }
        return instance;
    }
    public void addSnapshot(Snapshot snapshot){
        history.push(snapshot);
    }
    public Snapshot getLastestSnapshot(){
        return history.pop();
    }
}
