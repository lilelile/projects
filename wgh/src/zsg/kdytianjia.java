package zsg;
import java.util.List;

import javax.swing.JOptionPane;

import PO.kdyPO;

import com.opensymphony.xwork2.ActionSupport;

import dao.kdyDao;

public class kdytianjia extends ActionSupport {
	private String id;
	private String name;
	private String tel;
	private String message="input";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void validate(){
		if(this.getId()==null||this.getId().length()==0){
			addFieldError("id","快递员编号不能为空!");
		}else{
			kdyDao dao=new kdyDao();
			List list=(List) dao.findInfo("id",this.getId());
			if(!list.isEmpty()){
				addFieldError("id","快递员编号已存在!");
			}
		}
		if(this.getName()==null||this.getName().length()==0){
			addFieldError("name","姓名不能为空!");
        }
	}
    public String execute() throws Exception{
    	kdyDao dao=new kdyDao();
    	boolean save=dao.saveinfo(info());
    	if(save){
    		message=SUCCESS;
    	}
    	return message;
    }
    public kdyPO info(){
    	kdyPO info=new kdyPO();
    	info.setId(this.getId());
    	info.setName(this.getName());
    	info.setTel(this.getTel());
    	return info;
    }
    public void message(String mess){
		int type=JOptionPane.YES_NO_OPTION;
		String title="提示信息";
		JOptionPane.showMessageDialog(null,mess,title,type);
	}
}