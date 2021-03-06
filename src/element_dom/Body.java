package element_dom;

import dom_public.ElementPublic;
import visitor.Visitor;

/**
 *
 * @author arquitectura de software II-2015
 */
public class Body extends ElementPublic{

    public Body() {
        super("body");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
