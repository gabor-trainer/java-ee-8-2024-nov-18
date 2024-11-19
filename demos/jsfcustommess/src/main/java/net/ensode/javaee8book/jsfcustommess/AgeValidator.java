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



    }
}
