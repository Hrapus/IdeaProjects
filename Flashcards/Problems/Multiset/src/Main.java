import java.util.*;

interface Multiset<E> {

    /**
     * Add an element to the multiset.
     * It increases the multiplicity of the element by 1.
     */
    void add(E elem);

    /**
     * Remove an element from the multiset.
     * It decreases the multiplicity of the element by 1.
     */
    void remove(E elem);

    /**
     * Unite this multiset with another one. The result is the modified multiset (this).
     * It will contain all elements that are present in at least one of the initial multisets.
     * The multiplicity of each element is equal to the maximum multiplicity of
     * the corresponding elements in both multisets.
     */
    void union(Multiset<E> other);

    /**
     * Intersect this multiset with another one. The result is the modified multiset (this).
     * It will contain all elements that are present in the both multisets.
     * The multiplicity of each element is equal to the minimum multiplicity of
     * the corresponding elements in the intersecting multisets.
     */
    void intersect(Multiset<E> other);

    /**
     * Returns multiplicity of the given element.
     * If the set doesn't contain it, the multiplicity is 0
     */
    int getMultiplicity(E elem);

    /**
     * Check if the multiset contains an element,
     * i.e. the multiplicity > 0
     */
    boolean contains(E elem);

    /**
     * The number of unique elements,
     * that is how many different elements there are in a multiset.
     */
    int numberOfUniqueElements();

    /**
     * The size of the multiset, including repeated elements
     */
    int size();

    /**
     * The set of unique elements (without repeating)
     */
    Set<E> toSet();
}

class HashMultiset<E> implements Multiset<E> {

    private Map<E, Integer> map = new HashMap<>();

    /**
     * Add an element to the multiset.
     * It increases the multiplicity of the element by 1.
     */
    @Override
    public void add(E elem) {
        // implement the method
        if (!map.containsKey(elem)){
            map.put(elem,1);
        } else {
            int i = map.get(elem);
            map.replace(elem, ++i);
        }

    }

    /**
     * Remove an element from the multiset.
     * It decreases the multiplicity of the element by 1.
     */
    @Override
    public void remove(E elem) {
        // implement the method
        if (map.containsKey(elem)){
            int i = map.get(elem);
            if (i > 1){
                map.replace(elem, --i);
            } else map.remove(elem);
        }
    }

    /**
     * Unite this multiset with another one. The result is the modified multiset (this).
     * It will contain all elements that are present in at least one of the initial multisets.
     * The multiplicity of each element is equal to the maximum multiplicity of
     * the corresponding elements in both multisets.
     */
    @Override
    public void union(Multiset<E> other) {
        // implement the method


    }

    /**
     * Intersect this multiset with another one. The result is the modified multiset (this).
     * It will contain all elements that are present in the both multisets.
     * The multiplicity of each element is equal to the minimum multiplicity of
     * the corresponding elements in the intersecting multisets.
     */
    @Override
    public void intersect(Multiset<E> other) {
        // implement the method
    }

    /**
     * Returns multiplicity of the given element.
     * If the set doesn't contain it, the multiplicity is 0
     */
    @Override
    public int getMultiplicity(E elem) {
        // implement the method
        return map.getOrDefault(elem, 0);

    }

    /**
     * Check if the multiset contains an element,
     * i.e. the multiplicity > 0
     */
    @Override
    public boolean contains(E elem) {
        // implement the method
        return map.containsKey(elem);
    }

    /**
     * The number of unique elements,
     * that is how many different elements there are in a multiset.
     */
    @Override
    public int numberOfUniqueElements() {
        // implement the method
        return map.size();
    }

    /**
     * The size of the multiset, including repeated elements
     */
    @Override
    public int size() {
        // implement the method
        int counter = 0;
        for (var entry : map.entrySet()){
            counter += entry.getValue();
        }
        return counter;
    }

    /**
     * The set of unique elements (without repeating)
     */
    @Override
    public Set<E> toSet() {
        // Creating a new HashSet<> object helps us avoid ConcurrentModificationException.
        // It is thrown when we try to iterate over elements of Map and modify them at the same time
        return new HashSet<>(map.keySet());
    }
}