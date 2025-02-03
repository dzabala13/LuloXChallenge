package co.danielzabalaing.exceptions;

public class ElChatBotNoResponde extends AssertionError{
    public static final String  MENSAJE_ERROR_RESPUESTA_CHATBOT = "El chatbot no le ha contestado correctamente a el usuario";

    public ElChatBotNoResponde( String mensaje , Throwable causa){super(mensaje,causa);}
}
