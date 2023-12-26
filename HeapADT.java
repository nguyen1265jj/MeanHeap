

public interface HeapADT<T extends Comparable<T>> extends BinaryTreeADT<T> {
    // Phương thức thêm một phần tử vào heap
    public void addElement(T element);

    // Phương thức loại bỏ phần tử nhỏ nhất từ heap
    public T removeMin();

    // Phương thức tìm phần tử nhỏ nhất trong heap
    public T findMin();
}
