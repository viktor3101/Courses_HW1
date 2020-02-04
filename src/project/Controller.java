package project;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void runApplication(){
        Scanner sc = new Scanner(System.in);
        processedApp(sc);
        sc.close();
    }

    private void processedApp(Scanner sc){
        model.setHelloStr(additionalMethod("Hello", sc));
        model.setSpace(additionalMethod(" ", sc));
        model.setWorldStr(additionalMethod("World", sc));

        view.resultStrOutput(model.returnHelloWorldStr());
    }

    private String additionalMethod(String comparableString, Scanner sc){
        String resultString = "";
        int counter = 0;
        while (!resultString.equals(comparableString)){
            if(counter == 0) {
                view.inputData();
                counter++;
            }
            else view.invalidData();
            resultString = sc.nextLine();
        }
        view.correctData(resultString);
        return resultString;
    }
}
