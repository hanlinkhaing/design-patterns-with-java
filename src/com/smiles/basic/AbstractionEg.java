package com.smiles.basic;

public class AbstractionEg {
    public static void main(String[] args) {
        Mailer mailer = new Mailer();
        mailer.sendEmail();
    }

    static class Mailer {
        public void sendEmail() {
            connect();
            System.out.println("Send Mail");
            disconnect();
        }

        private void connect() {
            System.out.println("Connect");
        }

        private void  disconnect() {
            System.out.println("Disconnect");
        }
    }
}
