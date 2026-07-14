package br.com.amanda.exception;

public class ErroFormatoDDDException extends RuntimeException {
    private String message;

    public ErroFormatoDDDException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
