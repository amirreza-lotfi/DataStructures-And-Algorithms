package main.data_structure.heap;

public class MinHeap extends Heap {
    public MinHeap(int capacity){
        super(capacity);
    }

    private Role minHeapRole = new Role() {
        @Override
        public boolean insertRole(Node currentNode, int lastIndex) {
            return currentNode.getData() > getParent(lastIndex);
        }
    };


    public void insert(Node node) {
        super.insert(node,minHeapRole);
    }

    public Node extractMinimum(){
        Node root = new Node(nodeList[0].getData());
        super.delete();
        return root;
    }

    @Override
    protected void heapify(Node[] nodeList, int fromIndex) {
        int rightIndex = getRight(fromIndex);
        int leftIndex = getLeft(fromIndex);
        int smallestIndex = fromIndex;

        if(leftIndex < heapSize && nodeList[leftIndex].getData() < nodeList[smallestIndex].getData()){
            smallestIndex = leftIndex;
        }
        if(rightIndex < heapSize && nodeList[rightIndex].getData() < nodeList[smallestIndex].getData()){
            smallestIndex = rightIndex;
        }

        if(smallestIndex!=fromIndex){
            super.swapNodesData(fromIndex,smallestIndex);
            heapify(nodeList, smallestIndex);
        }
    }

    @Override
    protected void heapifyAfterDecreaseKey(int index) {
        siftUp(index);
    }

    private void siftUp(int index){
        while (index!=0 && nodeList[index].getData()<nodeList[getParent(index)].getData()){
            swapNodesData(index,getParent(index));
            index = getParent(index);
        }
    }
}
