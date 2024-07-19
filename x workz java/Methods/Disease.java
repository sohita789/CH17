class Disease
{
public static String getsick(String Symptom)
{
System.out.println("starting getsick");
System.out.println("Symptom arg"+Symptom);

if(Symptom=="fever")
{
System.out.println("Symptom is fever");
return "dolo650";
}

if(Symptom=="cold")
{
System.out.println("Symptom is cold");
return "chestonCold";
}

if(Symptom=="stomachace")
{
System.out.println("Symptom is stomachace");
return "meftolPlus";
}

if(Symptom=="headace")
{
System.out.println("Symptom is headache");
return "paracetamol";
}
if(Symptom=="abdomenpain")
{
System.out.println("Symptom is abdomenpain");
return "pentop";
}
System.out.println("symptom doesnt matched");
return "not watched";
}
}