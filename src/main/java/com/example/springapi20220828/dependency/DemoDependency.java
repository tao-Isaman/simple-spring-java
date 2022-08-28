package com.example.springapi20220828.dependency;

public class DemoDependency {
    public static void main(String[] args) {

        // Constructor Injection
        {
            Address address = new Address();
            address.setAddressNo("35/22");
            address.setAddressName("Bangkok Thailand ...");

            Customer customer = new Customer(address);
            System.out.println("customer name: " + customer.getName());

//        Address address = customer.getAddress();
            System.out.println("customer address no. " + address.getAddressNo());
            System.out.println("customer address name " + address.getAddressName());
        }

        //Setter Injection
        {
            Customer customer = new Customer();

            Address address = new Address();
            address.setAddressNo("35/88");
            address.setAddressName("Bangkok Thailand 99 ...");

            customer.setAddress(address);

            System.out.println("customer name: " + customer.getName());
            System.out.println("customer address no. " + address.getAddressNo());
            System.out.println("customer address name " + address.getAddressName());



        }

    }
}
