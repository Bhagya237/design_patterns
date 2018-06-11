package com.bhagya;

import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Encryptor {

    public void writeToDisk(String plaintext) {
        EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
        String cyphertext = encryptionAlgorithm.encrypt(plaintext);

    }
    public abstract EncryptionAlgorithm getEncryptionAlgorithm();
}
