package sk.kosickaakademia.vasinsky.aopdemo.dao;


import org.springframework.stereotype.Component;
import sk.kosickaakademia.vasinsky.aopdemo.Account;

@Component
public class AccountDAO {

private String name;
private String serviceCode;


    public void AddAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass()+ ": ADDING AN ACCOUNT... ");
    }

    public boolean doWork(){
        System.out.println(" DOING WORK: WRITING CODE...");
    return true;
    }


    public String getName() {
        System.out.println(getClass()+ ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+ ": in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass()+ ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass()+ ": in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
