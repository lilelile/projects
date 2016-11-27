package zcdl;

import java.util.List;

import zcdl.LoginRegisterInfo;
import PO.UserInfoPO;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {
	private String username;
	private String password;
	private String message="error";
	private List list;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void validate(){
			System.out.print(this.getUsername());
		if(this.getUsername()==null||this.getUsername().length()==0){
			addFieldError("username","�û�������Ϊ��!");
		}else{
		    LoginRegisterInfo info=new LoginRegisterInfo();
		    list=info.queryInfo(this.getUsername());
		    if(list.size()==0){
		    	addFieldError("username","���û���δע��!");
		    }else{
		    	UserInfoPO ui=new UserInfoPO();
		    	int count=0;
		    	for(int i=0;i<list.size();i++){
		    		count++;
		    		ui=(UserInfoPO)list.get(i);
		    		if(this.getUsername().equals(ui.getUsername())){
		    			if(ui.getPassword().equals(this.getPassword())){
		    				message="success";
		    			}else{
		    				addFieldError("password","��½���벻��ȷ!");
		    			}
		    		}
		    	}
		    }
	    }
      }
	public String execute() throws Exception{
		return message;
	}
}
