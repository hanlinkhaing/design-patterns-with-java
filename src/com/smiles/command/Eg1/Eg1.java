package com.smiles.command.Eg1;

import com.smiles.command.fx.Button;

public class Eg1 {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        AddCustomerCommand command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
    }
}
