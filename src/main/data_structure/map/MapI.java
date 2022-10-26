package main.data_structure.map;

import java.util.Collection;
import java.util.Set;

public interface MapI<KEY,VALUE> {
    int size();
    boolean isEmpty();
    boolean isValueExist(Object value);
    boolean isKeyExist(Object value);
    VALUE getValue(Object KEY);
    void putValue(KEY key, Object value);
    VALUE removeAndReturnValue(KEY key);
    void clear();
    Set<KEY> setOfKey();
    Collection<VALUE> setOfValue();
}
