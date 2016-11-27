package zsg;

import java.util.List;

import javax.swing.JOptionPane;

import PO.fhrPO;

import com.opensymphony.xwork2.ActionSupport;

import dao.fhrDao;

public class khtianjia extends ActionSupport {
	private String id;
	private String name;
	private String tel;
	private String faddress;
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
	public String getFaddress() {
		return faddress;
	}
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	public void validate(){
		if(this.getId()==null||this.getId().length()==0){
			addFieldError("id","发货人编号不能为空!");
		}else{
			fhrDao dao=new fhrDao();
			List list=(List) dao.findInfo("id",this.getId());
			if(!list.isEmpty()){
				addFieldError("id","发货人编号已存在!");
			}
		}
		if(this.getName()==null||this.getName().length()==0){
			addFieldError("name","姓名不能为空!");
        }
	}
    public String execute() throws Exception{
    	fhrDao dao=new fhrDao();
    	boolean save=dao.saveinfo(info());
    	if(save){
    		message=SUCCESS;
    	}
    	return message;
    }
    public fhrPO info(){
    	fhrPO info=new fhrPO();
    	info.setId(this.getId());
    	info.setName(this.getName());
    	info.setTel(this.getTel());
    	info.setFaddress(this.getFaddress());
    	return info;
    }
    public void message(String mess){
		int type=JOptionPane.YES_NO_OPTION;
		String title="提示信息";
		JOptionPane.showMessageDialog(null,mess,title,type);
	}
}
	
