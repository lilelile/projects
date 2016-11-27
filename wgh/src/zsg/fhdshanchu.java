package zsg;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;

import dao.fhrDao;
import java.util.List;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;
import PO.fhdPO;
import dao.fhdDao;
public class fhdshanchu extends ActionSupport {
	private String id;
	private String message;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void validate(){
		if(this.getId().equals("null")){
            message("暂无电影订单信息!");
			addFieldError("id","暂无电影订单信息!");
		}
	}
    public String execute() throws Exception{
    	fhdDao dao=new fhdDao();
    	boolean del=dao.deleteInfo(this.getId());
    	if(del){
    		message=SUCCESS;
    	}
    	return message;
    }
    public void message(String mess){
		int type=JOptionPane.YES_NO_OPTION;
		String title="提示信息";
		JOptionPane.showMessageDialog(null,mess,title,type);
	}
}
