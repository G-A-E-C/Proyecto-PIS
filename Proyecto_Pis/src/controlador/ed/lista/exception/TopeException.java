package controlador.ed.lista.exception;

public class TopeException extends Exception {

    /**
     * Creates a new instance of <code>TopeException</code> without detail
     * message.
     */
    public TopeException() {
    }

    /**
     * Constructs an instance of <code>TopeException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TopeException(String msg) {
        super(msg);
    }
}
