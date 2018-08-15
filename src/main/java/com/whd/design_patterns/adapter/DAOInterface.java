package com.whd.design_patterns.adapter;

import java.util.List;
import java.util.Map;

public interface DAOInterface {
	
	public abstract void save();
	public abstract String findById();
	public abstract String findByName();
	public abstract List findAll();
	public abstract void update();
	public abstract void update(Map map);
	public abstract void delete();

}
