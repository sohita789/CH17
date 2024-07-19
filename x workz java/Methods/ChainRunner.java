class ChainRunner
{
public static void main(String[]args)
{
String ref=Chain.carat();
System.out.println("ref:"+ref);
double costpergram=Chain.cost();
System.out.println("costpergram:"+costpergram);
String type=Chain.type();
System.out.println("type:"+type);
String quality=Chain.quality();
System.out.println("quality:"+quality);
double quantity=Chain.quantity();
System.out.println("quantity:"+quantity);
String wastage=Chain.wastage();
System.out.println("wastage:"+wastage);
int servicecharge=Chain.servicecharge();
System.out.println("servicecharge"+servicecharge);
double GST=Chain.GST();
System.out.println("GST:"+GST);
}
}