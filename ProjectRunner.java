class ProjectRunner
{
public static void main(String[]args)
{
Project project=new Project("samsung");
project.type="smart board"; 
project.setWeight(30);
project.display();


Project project1=new Project("lenovo");
project1.type="high efficiency"; 
project1.setWeight(40);
project1.display();

Project project2=new Project("LG");
project2.type="good";
project2.setWeight(20);
project2.display();

}
}