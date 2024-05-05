public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;
    private int temp;
    public final int MIN = -1;

    public StrukturStack(int capacity) { // Constructor untuk menginisialisasi capacity dan array
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public void push(int data) { // Method push untuk menambahkan data ke dalam stack
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }
    
    public int pop() { // Method pop untuk mengeluarkan data dari stack
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return MIN; // Mengembalikan nilai MIN untuk menandakan stack kosong
        } else {
            temp = array[TOP]; // Menyimpan nilai TOP ke dalam variabel temp
            TOP--; // Mengurangi TOP 
        }
        return temp;
    }
    
    public int top() { // Method untuk mengecek apakah stack kosong atau tidak
        if (isEmpty()) {
            return MIN; 
        } else {
            return array[TOP];
        }
    }

    public boolean isEmpty() { // Method untuk mengecek apakah stack kosong atau tidak
        return (TOP == MIN); 
    }
    
    public boolean isFull() { // Method untuk mengecek apakah stack penuh atau tidak 
        return TOP == capacity - 1;
    }
    
    public void displayElements() { // Method untuk menampilkan elemen ke layar dari TOP
        System.out.println("Elemen from TOP:");
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public int size() {  // Method untuk mengecek ukuran stack 
        return TOP + 1;
    }
}