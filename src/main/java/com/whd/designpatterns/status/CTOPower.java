package com.whd.designpatterns.status;

public class CTOPower extends State {

	@Override
	public void state(int state) {
		if(state > 1 && state < 4){
			System.out.println("部分最高权限");
		}else{
			State s = new CFOPower();
			s.state(state);
		}
	}

}
