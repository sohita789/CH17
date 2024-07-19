class MovieRunner
{
public static void main(String[]args)
{
System.out.println("starting main method");
String movieName="KGF";
String producer=Movie.getproducer(movieName);
System.out.println("producer:"+producer);
String producer1=Movie.getproducer(movieName);
System.out.println("producer1:"+producer1);
String producer2=Movie.getproducer(movieName);
System.out.println("producer2:"+producer2);
String producer3=Movie.getproducer(movieName);
System.out.println("producer3:"+producer3);
String producer4=Movie.getproducer(movieName);
System.out.println("producer4:"+producer4);
String producer5=Movie.getproducer(movieName);
System.out.println("producer5:"+producer5);
System.out.println("no movie matched");
}
}