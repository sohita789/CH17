package com.xworkz.interfaces.Address;

public class AddressServiceImpl implements AddressService{
	
	private AddressRepository addressRepository;
	
	
	public AddressServiceImpl(AddressRepository addressRepository)
	{
		this.addressRepository=addressRepository;	
		}

	@Override
	public String push()
	{
		// TODO Auto-generated method stub
		if(addressRepository!=null)
		{
			boolean save=addressRepository.save();
			if(save) 
			{
			return "succes";
		}
		else
		{
			return "failure";
		}
	}
		return "issue";
	}

	@Override
	public String refresh() {
		if(addressRepository!=null)
		{
			boolean save=addressRepository.save();
			if(save) {
				return"success";
			}
			else {
				return "failure";
			}
		}
		return"issue";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String remove() {
		if(addressRepository!=null)
		{
			boolean save=addressRepository.save();
			if(save) {
				return "success";
				
			}
			else {
				return "failure";
			}
		}
		return "issue";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String load() {
		if(addressRepository!=null)
		{
			boolean save=addressRepository.save();
			if(save) {
				return "success";
			}
			else {
				return "failure";
				
			}
		}
		return "issue";
		// TODO Auto-generated method stub
		
	}

}
