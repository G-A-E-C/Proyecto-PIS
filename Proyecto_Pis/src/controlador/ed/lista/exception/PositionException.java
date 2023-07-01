package controlador.ed.lista.exception;

public class PositionException extends Exception {

    /**
     * Creates a new instance of <code>PositionException</code> without detail
     * message.
     */
    public PositionException() {
    }

    /**
     * Constructs an instance of <code>PositionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PositionException(String msg) {
        super(msg);
    }
}
