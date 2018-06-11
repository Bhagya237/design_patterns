package com.bhagya;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Encryptor encryptor =new Sha256Encryptor();

        encryptor.writeToDisk("");

    }
}
