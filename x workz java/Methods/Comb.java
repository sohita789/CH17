class Comb {
    
    public static String result(int studentmarks) {
        
            // Handle special case where numbers array is empty
            System.out.println("Student result ");
			if(studentmarks>=34)
			{
			
            return "pass"; 
        }
        

        
        return "fail";
    }

    public static void main(String[] args) {
        String result1=Comb.result(40);
        System.out.println("result1:" +result1);
		String result2=Comb.result(10);
        System.out.println("result2:" +result2);
		
    }
}
  
