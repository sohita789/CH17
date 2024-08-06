class Hotel{

String hotelname="kamat hotel";
Owner owner=new Owner("omkar");

Hotel()
{
System.out.println("created Hotel no arguments");
}
public void show(){
System.out.println("Hotel:"+this.hotelname);
System.out.println("Owner ownername:"+owner.ownername);
}
}