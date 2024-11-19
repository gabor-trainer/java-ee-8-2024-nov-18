package net.ensode.javaee8book.jsfcustommess;

import org.apache.commons.lang3.StringUtils;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "ageValidator")
public class AgeValidator implements Validator
{
    public void validate(FacesContext facesContext,
                         UIComponent uiComponent,
                         Object value) throws ValidatorException {
        org.apache.commons.validator.routines.EmailValidator emailValidator =
                org.apache.commons.validator.routines.EmailValidator.getInstance();
        HtmlInputText htmlInputText = (HtmlInputText) uiComponent;


        int age = (int) value;
        if (age <= 18) {
            FacesMessage facesMessage = new FacesMessage(htmlInputText.getLabel()
                    + ": Age must be over 18");
            throw new ValidatorException(facesMessage);
        }


//        String ageString = (String) value;
//
//        if (ageString == null || ageString.trim().isEmpty()) {
//            FacesMessage facesMessage = new FacesMessage(htmlInputText.getLabel()
//                    + ": Age field cannot be empty");
//            throw new ValidatorException(facesMessage);
//        }
//
//        try {
//            int age = Integer.parseInt(ageString);
//            if (age <= 18) {
//                FacesMessage facesMessage = new FacesMessage(htmlInputText.getLabel()
//                        + ": Age must be over 18");
//                throw new ValidatorException(facesMessage);
//            }
//        } catch (NumberFormatException e) {
//            FacesMessage facesMessage = new FacesMessage(htmlInputText.getLabel()
//                    + ": Age must be a numeric value");
//            throw new ValidatorException(facesMessage);
//        }
    }
}
