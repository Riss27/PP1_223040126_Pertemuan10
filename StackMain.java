public class StackMain {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        // Sebelum push
        System.out.println("Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
        System.out.println();

        // Melakukan push 3x
        System.out.println("Melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
        System.out.println();

        // Melakukan pop 1x
        System.out.println("\nMelakukan pop 1x:");
        stack.pop();
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
        System.out.println();
    }
}
