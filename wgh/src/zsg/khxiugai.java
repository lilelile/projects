package zsg;

import java.util.List;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;

import PO.fhrPO;
import dao.fhrDao;

public class khxiugai extends ActionSupport{
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
		if(this.getId().equals("null")){
            message("���޷�������Ϣ!");
			addFieldError("id","���޷�������Ϣ!");
		}
		if(this.getName()==null||this.getName().length()==0){
			addFieldError("name","��������Ϊ��!");
        }
	}
    public String execute() throws Exception{
    	fhrDao dao=new fhrDao();
    	boolean update=dao.updateInfo(info());
    	if(update){
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
		String title="��ʾ��Ϣ";
		JOptionPane.showMessageDialog(null,mess,title,type);
	}
}
