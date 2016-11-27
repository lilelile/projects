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
			addFieldError("username","用户名不能为空!");
		}else{
		    LoginRegisterInfo info=new LoginRegisterInfo();
		    list=info.queryInfo(this.getUsername());
		    if(list.size()==0){
		    	addFieldError("username","该用户尚未注册!");
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
		    				addFieldError("password","登陆密码不正确!");
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
