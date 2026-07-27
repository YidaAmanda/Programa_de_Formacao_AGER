package br.com.amanda.adopet.api.service;

public interface EmailService {

    void enviarEmail(String to, String subject, String message);

}
