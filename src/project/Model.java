package project;

public class Model {
    private String helloStr;
    private String space;
    private String worldStr;

    public Model(){
    }

    public void setHelloStr(String helloStr) {
        this.helloStr = helloStr;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public void setWorldStr(String worldStr) {
        this.worldStr = worldStr;
    }

    public String returnHelloWorldStr(){
        return helloStr + space + worldStr;
    }
}
