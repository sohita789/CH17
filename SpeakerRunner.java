class SpeakerRunner
{
public static void main(String[]args)
{
Speaker speaker=new Speaker("samsung");
speaker.size="medium";
speaker.setPrice(50);
speaker.display();


Speaker speaker1=new Speaker("lenovo");
speaker1.size="large";
speaker1.setPrice(30);
speaker1.display();


Speaker speaker2=new Speaker("lg");
speaker2.size="small";
speaker2.setPrice(40);
speaker2.display();
}
}