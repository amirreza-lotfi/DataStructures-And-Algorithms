//package main.data_structure.map;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Set;
//
//public class Hashmap<KEY,VALUE> implements MapI<KEY,VALUE>{
//
//    /**
//     * Class Fields
//     */
//    int mapCapacity = 0;
//    int sizeOfMap = 0;
//    private Node<KEY,VALUE>[] nodesTable;
//
//    /**
//     * Static Fields
//     */
//    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
//    static final int MAXIMUM_CAPACITY = 1 << 30;
//    static final float DEFAULT_LOAD_FACTOR = 0.75f;
//
//    /**
//     * Public Constructor
//     */
//    public void HashMap(int initialCapacity) throws HashMapException {
//        if (initialCapacity < 0)
//            throw new HashMapException("The capacity has not be lower than zero!!");
//        if (initialCapacity > MAXIMUM_CAPACITY)
//            mapCapacity = MAXIMUM_CAPACITY;
//    }
//    public void Hashmap(){
//        mapCapacity = DEFAULT_INITIAL_CAPACITY;
//    }
//
//
//    @Override
//    public int size() {
//        return sizeOfMap;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return sizeOfMap==0;
//    }
//
//    @Override
//    public boolean isValueExist(Object value) {
//        return false;
//    }
//
//    @Override
//    public boolean isKeyExist(Object value) {
//        return false;
//    }
//
//    @Override
//    public VALUE getValue(Object KEY) {
//        return null;
//    }
//
//    @Override
//    public void putValue(KEY key, Object value) {
//        Node<KEY,VALUE>[] tab = new Node[0];
//        Node<KEY,VALUE> p;
//        int numberOfTabBlocks;
//        int lastIndex;
//
//        if(nodesTable == null || (numberOfTabBlocks = tab.length) ==0 ){
//            tab = resizeNodeTable();
//            numberOfTabBlocks = tab.length;
//        }
//
//        if ((p = tab[lastIndex = (numberOfTabBlocks - 1)]) == null)
//            tab[lastIndex] = new Node(key, value, null);
//
//        else {
//            HashMap.Node<K,V> e; K k;
//            if (p.hash == hash &&
//                    ((k = p.key) == key || (key != null && key.equals(k))))
//                e = p;
//            else if (p instanceof HashMap.TreeNode)
//                e = ((HashMap.TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
//            else {
//                for (int binCount = 0; ; ++binCount) {
//                    if ((e = p.next) == null) {
//                        p.next = newNode(hash, key, value, null);
//                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
//                            treeifyBin(tab, hash);
//                        break;
//                    }
//                    if (e.hash == hash &&
//                            ((k = e.key) == key || (key != null && key.equals(k))))
//                        break;
//                    p = e;
//                }
//            }
//            if (e != null) { // existing mapping for key
//                V oldValue = e.value;
//                if (!onlyIfAbsent || oldValue == null)
//                    e.value = value;
//                afterNodeAccess(e);
//                return oldValue;
//            }
//        }
//
//
//
//        ++modCount;
//        if (++size > threshold)
//            resize();
//        afterNodeInsertion(evict);
//        return null;
//    }
//
//    final Node<KEY,VALUE>[] resizeNodeTable() {
//        HashMap.Node<K,V>[] oldTab = table;
//        int oldCap = (oldTab == null) ? 0 : oldTab.length;
//        int oldThr = threshold;
//        int newCap, newThr = 0;
//        if (oldCap > 0) {
//            if (oldCap >= MAXIMUM_CAPACITY) {
//                threshold = Integer.MAX_VALUE;
//                return oldTab;
//            }
//            else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
//                    oldCap >= DEFAULT_INITIAL_CAPACITY)
//                newThr = oldThr << 1; // double threshold
//        }
//        else if (oldThr > 0) // initial capacity was placed in threshold
//            newCap = oldThr;
//        else {               // zero initial threshold signifies using defaults
//            newCap = DEFAULT_INITIAL_CAPACITY;
//            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
//        }
//        if (newThr == 0) {
//            float ft = (float)newCap * loadFactor;
//            newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
//                    (int)ft : Integer.MAX_VALUE);
//        }
//        threshold = newThr;
//        @SuppressWarnings({"rawtypes","unchecked"})
//        HashMap.Node<K,V>[] newTab = (HashMap.Node<K,V>[])new HashMap.Node[newCap];
//        table = newTab;
//        if (oldTab != null) {
//            for (int j = 0; j < oldCap; ++j) {
//                HashMap.Node<K,V> e;
//                if ((e = oldTab[j]) != null) {
//                    oldTab[j] = null;
//                    if (e.next == null)
//                        newTab[e.hash & (newCap - 1)] = e;
//                    else if (e instanceof HashMap.TreeNode)
//                        ((HashMap.TreeNode<K,V>)e).split(this, newTab, j, oldCap);
//                    else { // preserve order
//                        HashMap.Node<K,V> loHead = null, loTail = null;
//                        HashMap.Node<K,V> hiHead = null, hiTail = null;
//                        HashMap.Node<K,V> next;
//                        do {
//                            next = e.next;
//                            if ((e.hash & oldCap) == 0) {
//                                if (loTail == null)
//                                    loHead = e;
//                                else
//                                    loTail.next = e;
//                                loTail = e;
//                            }
//                            else {
//                                if (hiTail == null)
//                                    hiHead = e;
//                                else
//                                    hiTail.next = e;
//                                hiTail = e;
//                            }
//                        } while ((e = next) != null);
//                        if (loTail != null) {
//                            loTail.next = null;
//                            newTab[j] = loHead;
//                        }
//                        if (hiTail != null) {
//                            hiTail.next = null;
//                            newTab[j + oldCap] = hiHead;
//                        }
//                    }
//                }
//            }
//        }
//        return newTab;
//    }
//
//    @Override
//    public VALUE removeAndReturnValue(KEY key) {
//        return null;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public Set<KEY> setOfKey() {
//        return null;
//    }
//
//    @Override
//    public Collection<VALUE> setOfValue() {
//        return null;
//    }
//}
