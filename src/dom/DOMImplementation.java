package dom;

/**
 *
 * @author arquitecturar de software II-2015
 */
public interface DOMImplementation {
    public boolean hasFeature(String feature, String version);
    public DocumentType createDocumentType(String qualifiedName, String publicId, String systemId) throws DOMException;
    public Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype) throws DOMException;
    public Object getFeature(String feature, String version);
}
