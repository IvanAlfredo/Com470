package com.com470.HolaMundoApp.service;

/**
 *
 * @author Ivan
 */
public class Utilidades {

    public String Concatenar(String uno, String dos) {
        if (uno != null && dos != null) {
            return uno.concat(" ").concat(dos);
        }
        return null;
    }
}
