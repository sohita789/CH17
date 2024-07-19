class StackOverflow{

public static void main(String[]args){
try{
recursiveMethod(1);
}
catch(StackOverflowError e){
System.out.println("Stack Overflow occured!");
e.printStackTrace();
}
}
private static void recursiveMethod(int i){
System.out.println("Method call number:"+i);
recursiveMethod(i+1);
}
}