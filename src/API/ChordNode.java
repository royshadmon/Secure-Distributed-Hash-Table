package API;

import java.io.Serializable;

public interface ChordNode<RESOURCE_TYPE extends Serializable> {

    int getId();

    void join(ChordNode<RESOURCE_TYPE> helper);
    void leave();

    RESOURCE_TYPE find(String resourceKey);

    void insert(String resourceName, RESOURCE_TYPE resource);
    void remove(String resourceName);

    void prettyPrint();

    String toString();
}
