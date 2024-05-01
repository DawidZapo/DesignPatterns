package dawidzapo.behavioral.visitor.visitor_interface;

import dawidzapo.behavioral.visitor.element.Player;

public interface Visitor {
    void visit(Player player);
}
