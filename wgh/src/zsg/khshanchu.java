package zsg;

import java.util.List;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;

import PO.fhrPO;
import dao.fhrDao;

public class khshanchu extends ActionSupport {
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
            message("���޷�������Ϣ!");
			addFieldError("id","���޷�������Ϣ!");
		}
	}
    public String execute() throws Exception{
    	fhrDao dao=new fhrDao();
    	boolean del=dao.deleteInfo(this.getId());
    	if(del){
    		message=SUCCESS;
    	}
    	return message;
    }
    public void message(String mess){
		int type=JOptionPane.YES_NO_OPTION;
		String title="��ʾ��Ϣ";
		JOptionPane.showMessageDialog(null,mess,title,type);
	}
}
