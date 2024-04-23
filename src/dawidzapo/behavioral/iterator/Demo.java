package dawidzapo.behavioral.iterator;

import dawidzapo.behavioral.iterator.associations.Atp;
import dawidzapo.behavioral.iterator.associations.TennisAssociation;
import dawidzapo.behavioral.iterator.associations.Wta;
import dawidzapo.behavioral.iterator.iterator.AssociationIterator;
import dawidzapo.behavioral.iterator.iterator.PlayerIterator;

public class Demo {
    public static void main(String[] args) {
        TennisAssociation atp = Atp.getInstance();
        PlayerIterator atpIterator = new AssociationIterator(atp);

        while (atpIterator.hasNext()){
            System.out.println(atpIterator.next());
        }

        TennisAssociation wta = Wta.getInstance();
        PlayerIterator wtaIterator = new AssociationIterator(wta);

        while (wtaIterator.hasNext()){
            System.out.println(wtaIterator.next());
        }
    }
}
