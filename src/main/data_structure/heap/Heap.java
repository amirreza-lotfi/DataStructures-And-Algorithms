package main.data_structure.heap;

public abstract class Heap {
    protected Node[] nodeList;
    protected int heapSize = 0;
    protected int capacity;

    Heap(int capacity){
        this.capacity = capacity;
        nodeList = new Node[capacity];
    }

    //Time Complexity -> O(N)
    public Node[] buildHeap(Node[] completeBinaryTree){
        int sizeOfArray = completeBinaryTree.length;

        Node[] heap = new Node[sizeOfArray];

        for(int i=0;i<sizeOfArray;++i){
            heap[i] = completeBinaryTree[i];
        }

        for(int i = (int) Math.floor(sizeOfArray/2 -1); i>=0; i--){
            heapify(heap,i);
        }

        return heap;
    }

    protected void insert(Node node, Role role){

        //check -> main.data_structure.heap has empty space for new data?
        if(heapSize >= capacity)
            return;

        nodeList[heapSize] = node;
        heapSize++;
        int lastEmptySpaceIndex = heapSize-1;

        /*  now check: does inserting new item violet minHeap roles?
         * */
        while (lastEmptySpaceIndex!=0 && role.insertRole(node,lastEmptySpaceIndex)){
            int indexOfParent = getParent(lastEmptySpaceIndex);

            int flag = nodeList[indexOfParent].getData();
            nodeList[indexOfParent].setData(nodeList[lastEmptySpaceIndex].getData());
            nodeList[lastEmptySpaceIndex].setData(flag);

            lastEmptySpaceIndex = indexOfParent;

        }

    }
    public void delete(){
        if(heapSize==1){
            heapSize--;
            return;
        }

        swapNodesData(0,heapSize-1);
        heapSize--;

        heapify(nodeList,0);
    }
    public void decreaseKey(int index, int incrementValue){
        nodeList[index].setData(nodeList[index].getData()+incrementValue);
        heapifyAfterDecreaseKey(index);
    }
    public Node extractMinimum(){
        Node root = new Node(nodeList[0].getData());
        delete();
        return root;
    }

    protected int getParent(int index) {
        return (int) Math.floor((index-1)/2);
    }
    protected int getRight(int index) {
        return index*2+2;
    }
    protected int getLeft(int index){
        return index*2+1;
    }

    protected void swapNodesData(int firstIndex, int lastIndex){
        int flag = nodeList[firstIndex].getData();
        nodeList[firstIndex].setData(nodeList[lastIndex].getData());
        nodeList[lastIndex].setData(flag);

    }
    abstract void heapify(Node[] nodeList,int fromIndex);
    abstract void heapifyAfterDecreaseKey(int index);
}
