package TiketKeretaAPI;

public class Customer {
    protected String CustomerName;
    protected String CustomerPhone;

    public String getName(){
        return this.CustomerName;
    }
    public void setName (String n){
        this.CustomerName = n;
    }
    public String getTelepon(){
        return this.CustomerPhone;
    }
    public void setTelepon (String t) {
        this.CustomerPhone=t;
    }
    public void displayInfo() {
    }
}
