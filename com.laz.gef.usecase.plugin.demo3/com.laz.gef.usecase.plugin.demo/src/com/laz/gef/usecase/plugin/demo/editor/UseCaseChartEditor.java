package com.laz.gef.usecase.plugin.demo.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;

import com.laz.gef.usecase.plugin.demo.factory.MyEditPartFactory;
import com.laz.gef.usecase.plugin.demo.model.RootModel;
import com.laz.gef.usecase.plugin.demo.util.PaletteUtil;

public class UseCaseChartEditor extends GraphicalEditorWithFlyoutPalette {

	public UseCaseChartEditor() {
		// 设置编辑器域
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		// 设置编辑器显示名为（文件名）
		setPartName(input.getName());
	}

	private PaletteRoot root; // 调色板对象

	/**
	 * 配置编辑器右侧画板
	 */
	@Override
	protected PaletteRoot getPaletteRoot() {
		if (root == null) {
			root = PaletteUtil.createPalette();
		}
		return root;
	}

	/**
	 * 初始化编辑器信息 
	 */
	@Override
	protected void initializeGraphicalViewer() {
		// 得到编辑器主画布
		GraphicalViewer viewer = getGraphicalViewer();
		//得到文件信息
		IFile file = ((IFileEditorInput) getEditorInput()).getFile();
		RootModel root = null;
		if (file.exists()) {
			try {
				//TODO 读取文件信息转换为RootModel
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		//读取文件失败或者文件信息为空，初始化模型信息
		if (root == null) {
			root = createInitializeModel();
		}
		//设置主视图模型信息
		viewer.setContents(root);
	}
	
	/**
	 * 创建初始化模型信息
	 * @return
	 */
	private RootModel createInitializeModel() {
		RootModel root = new RootModel();
		return root;
	}

	/**
	 * 配置编辑器信息
	 */
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();
		//设置视图控制器工厂
		viewer.setEditPartFactory(createEditPartFactory());
		// 设置跟控制器
		ScalableRootEditPart rootEditPart = new ScalableRootEditPart();
		viewer.setRootEditPart(rootEditPart);
	}

	/**
	 * 创建编辑器工厂 映射-模型与控制器
	 * 
	 * @return
	 */
	private EditPartFactory createEditPartFactory() {
		return new MyEditPartFactory();
	}

	/**
	 * 保存文件触发
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

}
