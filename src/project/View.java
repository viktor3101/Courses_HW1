package project;

public class View {
    private final String inputDataString = "Input data: ";

    public View(){}

    public void invalidData(){
        System.out.println("Invalid data, try again.\n" + inputDataString);
    }

    public void correctData(String message){
        System.out.println("\"" + message + "\" is correct input!");
    }

    public void inputData(){
        System.out.println(inputDataString);
    }

    public void resultStrOutput(String message){
        System.out.println("\nResult is: " + message);
    }
}