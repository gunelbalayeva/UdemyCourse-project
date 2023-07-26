package udemyCourse_project;

public abstract class Person {
    private String name;
    private String inputText;
    private String useNname;

    public Person() {
    }

    public Person(String name, String inputText, String useNname) {
        this.name = name;
        this.inputText = inputText;
        this.useNname = useNname;
    }

    public String getName() {
        return name;
    }

    public String getInputText() {
        return inputText;
    }

    public String getUseNname() {
        return useNname;
    }

    @Override
    public String toString() {
        return "udemyCourse_project.Person name: " + name + " input text: " + inputText + " user name: " + useNname;

    }
}
