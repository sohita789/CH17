class AsianPaintRunner{
public static void main(String[]args)
{
Paint.sketch("asian paints");
Paint.sketch("asian paints","Red");
Paint.sketch("asian paints",10000);
Paint.sketch("red","water proof",20000);

Train.book("kalburgi","banglore");
Train.book("kalburgi","banglore","ac");
Train.book("kalburgi","banglore","ac",400);
Train.cancel(11823);
Train.cancel("kalburgi","banglore");

Shoes.walk("sparx");
Shoes.walk("black");
Shoes.walk(999.9999);
Shoes.walk("M");
Shoes.walk("sparx","good");
}
}