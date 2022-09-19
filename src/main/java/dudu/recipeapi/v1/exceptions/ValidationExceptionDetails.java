package dudu.recipeapi.v1.exceptions;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@SuperBuilder
public class ValidationExceptionDetails extends StandardError{


    public ValidationExceptionDetails(ValidationExceptionDetails invalid_args) {
    }
}