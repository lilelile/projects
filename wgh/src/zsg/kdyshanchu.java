package zsg;
import java.util.List;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;

import PO.kdyPO;
import dao.kdyDao;

public class kdyshanchu extends ActionSupport {
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
            message("���޿��Ա��Ϣ!");
			addFieldError("id","���޿��Ա��Ϣ!");
		}
	}
    public String execute() throws Exception{
    	kdyDao dao=new kdyDao();
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
