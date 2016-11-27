package zsg;

import java.util.List;

import javax.swing.JOptionPane;

import PO.fhdPO;

import com.opensymphony.xwork2.ActionSupport;

import dao.fhdDao;


public class fhdtianjia extends ActionSupport {
	private String id;
	private String film;
	private String type;
	private String date;
	private String seat;
	private String cost;
	private String message="input";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFilm() {
		return film;
	}
	public void setFilm(String film) {
		this.film = film;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public void validate(){
		if(this.getId()==null||this.getId().length()==0){
			addFieldError("id","电影订单编号不能为空!");
		}else{
			fhdDao dao=new fhdDao();
			List list=(List) dao.findInfo("id",this.getId());
			if(!list.isEmpty()){
				addFieldError("id","电影订单编号已存在!");
			}
		}
		if(this.getFilm()==null||this.getFilm().length()==0){
			addFieldError("film","电影名不能为空!");
        }
	}
    public String execute() throws Exception{
    	fhdDao dao=new fhdDao();
    	boolean save=dao.saveinfo(info());
    	if(save){
    		message=SUCCESS;
    	}
    	return message;
    }
    public fhdPO info(){
    	fhdPO info=new fhdPO();
    	info.setId(this.getId());
    	info.setFilm(this.getFilm());
    	info.setType(this.getType());
    	info.setDate(this.getDate());
    	info.setSeat(this.getSeat());
    	info.setCost(this.getCost());

    	return info;
    }
    public void message(String mess){
		int type=JOptionPane.YES_NO_OPTION;
		String title="提示信息";
		JOptionPane.showMessageDialog(null,mess,title,type);
	}
}
