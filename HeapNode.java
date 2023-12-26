
public class HeapNode<T extends Comparable<T>> extends BinaryTreeNode<T> {
    // Trường thêm để lưu trữ nút cha trong heap
    protected HeapNode<T> parent;

    // Constructor của HeapNode
    public HeapNode(T obj) {
        super(obj);
    }    

    // Phương thức lấy nút cha
    public HeapNode<T> getParent() {
        return parent;
    }

    // Phương thức thiết lập nút cha
    public void setParent(HeapNode<T> parent) {
        this.parent = parent;
    }
}
