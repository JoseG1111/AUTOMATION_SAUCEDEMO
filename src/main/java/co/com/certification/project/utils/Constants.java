package co.com.certification.project.utils;

public enum Constants {
    USER("user"),
    PASSWORD("password");

    private String constants;

    Constants(String constants) {
        this.constants = constants;
    }

    public String getConstants(){
        return constants;
}

}
