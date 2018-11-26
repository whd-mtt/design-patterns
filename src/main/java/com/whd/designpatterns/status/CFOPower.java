package com.whd.designpatterns.status;

public class CFOPower extends State {

	@Override
	public void state(int state) {
		if(state == 4){
			System.out.println("最高财政权");
		}else{
			System.out.println("进入下一个权限");
		}
	}

}
