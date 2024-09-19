package com.xworkz.machine;

public class MachineServiceImpl implements MachineService{
	MachineRepository machineRepository;
	private Object True;
	
	public MachineServiceImpl(MachineRepository machineRepository) {
		this.machineRepository=machineRepository;
		System.out.println("created the machineServiceImpl with no args");
	}

	@Override
	public String save() {
		
			if(machineRepository!=null)
			{
				boolean save=machineRepository.save();
				if(save) 
				{
				return "success";
			}
			else
			{
				return "failure";
			}
		}
			return "issue";
		}

		@Override
	public String update() {
		if(machineRepository!=null)
		{
			System.out.println("running update in MachineServieImpl");
			
			boolean save=machineRepository.save();
			if(save) {
				return "success" ;
			}
			else {
				return "failure";
			}
		}
		return "issue";
	}

		
	

	@Override
	public String delete() {
		System.out.println("running delete in MachineServiceImpl");
		if(machineRepository!=null)
		{
			System.out.println("running update in MachineServieImpl");
			
			boolean save=machineRepository.save();
			if(save) {
				return "success" ;
			}
			else {
				return "failure";
			}
		}
		return "issue";
	}
		
	

	@Override
	public MachineService read() {
		System.out.println("running read in MachineServiceImpl");
		
		
		if(machineRepository!=null)
		{
			System.out.println("running update in MachineServieImpl");
			
			boolean save=machineRepository.save();
			if(save) {
				return null  ;
			}
			else {
				return null;
			}
		}
		return null;
	}
		
		
		
	
	


		
	}
	
