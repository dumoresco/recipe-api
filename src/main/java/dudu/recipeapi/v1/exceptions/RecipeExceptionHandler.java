package dudu.recipeapi.v1.exceptions;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.constraints.NotNull;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class RecipeExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(code = NOT_FOUND)
    public StandardError entityNotFound(EntityNotFoundException e) {
        return new StandardError(StandardError.builder().status(NOT_FOUND.value()).message(NOT_FOUND.name()).build());
    }

    @ResponseStatus(value = BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public StandardError notValid(@NotNull MethodArgumentNotValidException e) {


        return new StandardError(
                StandardError.builder().status(BAD_REQUEST.value()).message(e.getMessage()).build());
    }}