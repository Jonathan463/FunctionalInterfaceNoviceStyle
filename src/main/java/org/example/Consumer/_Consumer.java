package org.example.Consumer;

import java.util.function.Consumer;

public class _Consumer {

    static class Customer{
        private String customerName;
        private String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }

    //Normal Java Way
    static void greetCustomer(Customer customer){
        System.out.println("You are welcome "+customer.customerName +"With registration number "+customer.customerPhoneNumber);
    }

    //Functional Interface Way
    static Consumer<Customer> customerConsumer = customer -> System.out.println("You are welcome "+customer.customerName +"With registration number "+customer.customerPhoneNumber);
    public static void main(String[] args) {
        Customer customer = new Customer("Jonathan","08030496039");
        greetCustomer(customer);

        customerConsumer.accept(customer);
    }
}
