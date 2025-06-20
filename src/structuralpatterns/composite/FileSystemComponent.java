package structuralpatterns.composite;

//Component

/**
 *         FileSystemComponent root = new Folder("root");
 *
 *         FileSystemComponent file1 = new File("file1");
 *
 *         ((Folder)root).addComponent(file1);
 *
 *         root.print();
 */

public interface FileSystemComponent {
    void print();
}
