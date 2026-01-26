package co.com.certification.project.dataDefinitions;

import co.com.certification.project.models.LoginModel;
import io.cucumber.java.DataTableType;

import java.util.Map;

import static co.com.certification.project.utils.Constants.PASSWORD;
import static co.com.certification.project.utils.Constants.USER;

public class DataDefinitions {
    @DataTableType(replaceWithEmptyString = "[blank]")
    public LoginModel compraModel(Map<String, String> entry){
        return new LoginModel(
                entry.get(USER.getConstants()),
                entry.get((PASSWORD.getConstants()))
        );
    }
}
