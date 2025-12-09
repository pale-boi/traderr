/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;


public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Stocks> stocks = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
    public void addStock(Stocks stock) {
        stocks.add(stock);
    }
    
    public Stocks getStock(int i) {
        return stocks.get(i);
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Stocks> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stocks> stocks) {
        this.stocks = stocks;
    }
   
    
}
