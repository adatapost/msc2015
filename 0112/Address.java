package in.abc;

public class Address {
   private String city;
   private int pin;

   //constructors
   public Address() { city = ""; pin=0; }

   public Address(String city, int pin) {
       this.city = city;
       this.pin = pin;
   }

   //getter-setter
   public int getPin() { return pin; }
   public void setPin(int pin) { this.pin=pin;}

   public void setCity(String city) { this.city=city;}
   public String getCity() { return city;}
}