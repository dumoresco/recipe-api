package dudu.recipeapi.v1.exceptions;

public class EntityNotFoundException extends RuntimeException{

    // Contrutor que recebe a mensagem
    public EntityNotFoundException(String message){
        super(message);
    }

}