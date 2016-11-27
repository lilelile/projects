package ams.util;

public class commons {
	public String converseType(Integer t){
		if(t==0){
			return "普通员工 ";
		}else if(t==1){
			return "财务出纳";
		}else if(t==2){
			return "财务经理";
		}else
		{
			return "null";
		}
	}

}
