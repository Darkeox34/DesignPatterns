package structuralpatterns.composite;

//Leaf

public class File implements FileSystemComponent{
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("*" + name);
    }
}
