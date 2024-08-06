class PaperRunner
{
public static void main(String[]args)
{
Paper paper=new Paper(2);
paper.setquality(false);
paper.color="white";
paper.display();

Paper paper1=new Paper(3);
paper1.setquality(true);
paper1.color="yellow";
paper1.display();

Paper paper2=new Paper(4);
paper2.setquality(false);
paper2.color="pink";
paper2.display();
}
}