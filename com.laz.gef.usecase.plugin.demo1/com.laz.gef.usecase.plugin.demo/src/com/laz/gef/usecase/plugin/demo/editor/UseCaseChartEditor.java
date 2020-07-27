package com.laz.gef.usecase.plugin.demo.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.ui.IEditorInput;

public class UseCaseChartEditor extends GraphicalEditorWithFlyoutPalette{
	
	public UseCaseChartEditor() {
		//设置编辑器域
		setEditDomain(new DefaultEditDomain(this));
	}
	
	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		// 设置编辑器显示名为（文件名）
		setPartName(input.getName());
	}
	
	/**
	 * 配置编辑器右侧画板
	 */
	@Override
	protected PaletteRoot getPaletteRoot() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 初始化编辑器信息
	 */
	@Override
	protected void initializeGraphicalViewer() {
	}
	
	/**
	 * 配置编辑器信息
	 */
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
	}
	
	/**
	 * 保存文件触发
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}

}
