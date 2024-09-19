package com.xworkz.machine;

public class MachineRepositoryImpl implements MachineRepository{

	@Override
	public boolean save() {
		
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int update() {
		System.out.println("update in MachineRepository");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		System.out.println("delete in MachineRepository");
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MachineRepository read() {
		System.out.println("read in Machinerepository");
		
		// TODO Auto-generated method stub
		return null;
	}

}
