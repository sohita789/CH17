package com.xworkz.machine;

public class MachineServiceRunner {
	    public static void main(String[] args) {
	        MachineRepository machineRepository = new MachineRepositoryImpl();
	        MachineService machineService = new MachineServiceImpl(machineRepository);

	      
	        MachineService machineservice = new MachineServiceImpl(machineRepository);
	        MachineService machineservices = new MachineServiceImpl(machineRepository);

	        machineService.save();
	        machineservices.save();

	        // Read and display machines
	        System.out.println("Reading Machines:");
	        System.out.println(machineService.read());
	        System.out.println(machineservice.read());

	        // Update a machine
	       
	        machineService.update();
	        System.out.println("After Update:");
	        System.out.println(machineService.read());

	        // Delete a machine
	        machineService.delete();
	        System.out.println("After Deletion:");
	        System.out.println("Machineservices: " + machineService.read()); 
	    }
	}



