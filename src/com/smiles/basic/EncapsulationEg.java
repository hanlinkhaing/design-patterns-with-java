package com.smiles.basic;

public class EncapsulationEg {
    public static void main(String[] args) {
        User user = new User("lin", "lin@gmail.com", "yangon");
        System.out.println(user.getEmail());
    }

    static class User {
        private String name, email, address;

        public User(String name, String email, String address) {
            this.name = name;
            this.email = email;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
