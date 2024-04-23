package dawidzapo.behavioral.iterator;

import dawidzapo.behavioral.iterator.associations.Atp;
import dawidzapo.behavioral.iterator.iterator.AtpIterator;
import dawidzapo.behavioral.iterator.iterator.PlayerIterator;

public class Demo {
    public static void main(String[] args) {
        Atp atp = Atp.getInstance();
        PlayerIterator atpIterator = new AtpIterator(atp);

        while (atpIterator.hasNext()){
            System.out.println(atpIterator.next());
        }
    }
}
