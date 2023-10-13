package br.com.ruthzil.safeenergy.exception.service;

public class DatabaseException extends  RuntimeException {

    public DatabaseException(String msg) {
        super(msg);
    }
}
