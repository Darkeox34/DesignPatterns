package structuralpatterns.composite;

import java.util.ArrayList;

//Composite

public class Folder implements FileSystemComponent {
    private String name;
    private ArrayList<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void print(){
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.print();
        }
    }
}
