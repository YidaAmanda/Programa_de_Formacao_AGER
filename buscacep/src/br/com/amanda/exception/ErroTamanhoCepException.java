package br.com.amanda.exception;

public class ErroTamanhoCepException extends RuntimeException {
    private String message;

    public ErroTamanhoCepException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
