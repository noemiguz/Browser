package dom;

/**
 *
 * @author arquitectura de software II-2015
 */
public interface DOMConfiguration {
    public void setParameter(String name, Object value) throws DOMException;
    public Object getParameter(String name) throws DOMException;
    public boolean canSetParameter(String name, Object value);
    public DOMStringList getParameterNames();
}
