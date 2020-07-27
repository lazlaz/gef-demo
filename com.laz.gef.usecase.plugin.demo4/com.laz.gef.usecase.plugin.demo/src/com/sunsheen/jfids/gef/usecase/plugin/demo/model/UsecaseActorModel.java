package com.sunsheen.jfids.gef.usecase.plugin.demo.model;


/**
 * 用例角色模型
 * @author lz
 *
 */
public class UsecaseActorModel extends AbstractEntityModel{
	/**
	 * 角色名
	 */
	private String name;
	public UsecaseActorModel() {
		super();
		setName("角色");
	}
	
	public void setName(String name) {
		String old = this.name;
		this.name = name;
		firePropertyChange(P_ENTITY_NAME, old, name);
	}

	public String getName() {
		return name;
	}
}
