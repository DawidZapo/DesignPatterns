package dawidzapo.behavioral.visitor.element;

import dawidzapo.behavioral.visitor.visitor_interface.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
