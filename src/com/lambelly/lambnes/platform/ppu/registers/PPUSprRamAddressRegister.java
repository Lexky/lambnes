package com.lambelly.lambnes.platform.ppu.registers;

import com.lambelly.lambnes.platform.Platform;

public class PPUSprRamAddressRegister
{
	public static final int REGISTER_ADDRESS = 0x2003;
	public static PPUSprRamAddressRegister register = new PPUSprRamAddressRegister();
	private Integer rawControlByte = null;
	
	private PPUSprRamAddressRegister()
	{
		
	}
	
	public void cycle()
	{	
		// if greater than 0.
		if (this.getRawControlByte() != null)
		{
			// set 0x2004
			Platform.getPpu().getPpuSprRamIORegister().setIoAddress(this.getRawControlByte());
			Platform.getCpuMemory().setMemoryFromHexAddress(0x2004, this.getRawControlByte());
				
			// clear? I suppose it makes sense.
			this.clear();
		}
	}
	
	public static PPUSprRamAddressRegister getRegister()
	{
		return register;
	}
	
	public void setRegisterValue(int value)
	{
		this.setRawControlByte(value);
	}
	
	private void clear()
	{
		this.setRawControlByte(null);
	}
	
	private Integer getRawControlByte()
	{
		return rawControlByte;
	}

	private void setRawControlByte(Integer rawControlByte)
	{
		this.rawControlByte = rawControlByte;
	}
}
