package data_structure.heap;

public class MaxHeap extends Heap{
    public MaxHeap(int capacity) {
        super(capacity);
    }

    private Role maxHeapRoles = new Role() {
        @Override
        public boolean insertRole(Node currentNode, int lastIndex) {
            return currentNode.getData() < getParent(lastIndex);
        }
    };

    public void insert(Node node){
        super.insert(node,maxHeapRoles);
    }

    @Override
    void heapify(Node[] nodeList, int fromIndex) {
        int rightIndex = getRight(fromIndex);
        int leftIndex = getLeft(fromIndex);
        int biggestIndex = fromIndex;

        if(leftIndex < heapSize && nodeList[leftIndex].getData() > nodeList[biggestIndex].getData()){
            biggestIndex = leftIndex;
        }
        if(rightIndex < heapSize && nodeList[rightIndex].getData() > nodeList[biggestIndex].getData()){
            biggestIndex = rightIndex;
        }

        if(biggestIndex !=fromIndex){
            super.swapNodesData(fromIndex, biggestIndex);
            heapify(nodeList, biggestIndex);
        }
    }

    @Override
    void heapifyAfterDecreaseKey(int index) {
        heapify(nodeList,index);
    }
}
