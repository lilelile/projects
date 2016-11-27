package zsg;
import java.util.List;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;

import PO.kdyPO;
import dao.kdyDao;

public class kdyxiugai extends ActionSupport{
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
		if(this.getId().equals("null")){
            message("暂无快递员信息!");
			addFieldError("id","暂无快递员信息!");
		}
		if(this.getName()==null||this.getName().length()==0){
			addFieldError("name","姓名不能为空!");
        }
	}
    public String execute() throws Exception{
    	kdyDao dao=new kdyDao();
    	boolean update=dao.updateInfo(info());
    	if(update){
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
