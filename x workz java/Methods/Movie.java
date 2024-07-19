class Movie
{
public static String getproducer(String movieName)
{
System.out.println("starting get producer");
System.out.println("movieName arg"+movieName);

if(movieName=="KGF")
{
System.out.println("movie is KGF");
return "vijay Kirangadur";
}
if(movieName=="pailwaan")
{
System.out.println("movie is pailwaan");
return  "swapna Krishna";
}

if(movieName=="yuvarathna")
{
System.out.println("movie is yuvarathna");
return "vijay Kirangadur";
}

if(movieName=="roberrt")
{
System.out.println("movie is roberrt");
return "umapathy Srinivasa Gowda";
}
if(movieName=="vikrant Rona")
{
System.out.println("movie is vikrant Rona");
return "jack Manjunath";
}
System.out.println("no movies matched");
return "not matched";
}
}