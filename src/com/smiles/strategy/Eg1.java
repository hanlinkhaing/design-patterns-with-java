package com.smiles.strategy;

public class Eg1 {
    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        client.send("Hello", new AESEncryption());
        client.send("World", new RSAEncryption());
    }

    static class ChatClient {
        public void send(String message, Encryption encryption) {
            encryption.encrypt(message);
            System.out.println("Encrypted " + message + " was sent.");
        }
    }

    interface Encryption {
        void encrypt(String message);
    }

    static class AESEncryption implements Encryption{

        @Override
        public void encrypt(String message) {
            System.out.println("AES Encryption applied on: " + message);
        }
    }

    static class RSAEncryption implements Encryption{

        @Override
        public void encrypt(String message) {
            System.out.println("RSA Encryption applied on: " + message);
        }
    }
}
