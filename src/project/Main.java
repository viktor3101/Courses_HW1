package project;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.runApplication();
    }
}
/*  compilation in terminal
    in source root
    javac -d src/classes -sourcepath src src/project/Main.java

    running in terminal
    in classes folder
    java project/Main
 */