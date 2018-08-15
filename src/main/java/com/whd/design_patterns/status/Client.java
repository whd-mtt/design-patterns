package com.whd.design_patterns.status;

public class Client {

	public static void main(String[] args) {
		//1-->CEO 所有权限
		//2-->CHO 部分最高权限
		//3-->CTO 部分最高权限
		//4-->CFO 财政权
		//5-->分公司总经理
		//6-->部门经理
		//7-->部门经理助理
		//8-->主管
		//9-->职员
		
		State s = new CEOPower();
		s.state(4);

	}

}
