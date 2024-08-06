class Speaker{
 
 String brand;
 String size;
 double price;
 String output="volume";
 
 public Speaker(String brand){
 this.brand=brand;
 }
 public void setPrice(double price){
 this.price=price;
 }
 
public void display(){
System.out.println("brand:"+brand);
System.out.println("size:"+size);
System.out.println("price:"+price);
System.out.println("output:"+output);
}
 }