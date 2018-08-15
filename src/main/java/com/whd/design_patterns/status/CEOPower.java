package com.whd.design_patterns.status;

public class CEOPower extends State{

	@Override
	public void state(int state) {
		if(state == 1){
			System.out.println("所有权限");
		}else{
			State s = new CTOPower();
			s.state(state);
		}
	}

}
