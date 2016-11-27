<!--
	
	function subSel(id,show){
		this.id = id;
		this.show = show;
	}
	
	function parentSel(id, subSels){
		this.id = id;
		this.subSels = subSels;
	}	

	//参数1为下拉菜单的id值
	//参数2为保存下拉菜单选项值的数组名
	//参数3保存下拉菜单的value值（修改页面才需要传这个参数）
	function showOptions(){
	
		var selId = arguments[0];
		var optionPro = arguments[1];
		var selValue = arguments[2];
		var sel = document.getElementById(selId);
		var opt = null;

		for(var i=0;i<optionPro.length;i++){
			opt = document.createElement("OPTION");
			sel.options.add(opt);
			opt.value = optionPro[i][0];
			opt.innerText = optionPro[i][1];
			if(selValue==null && optionPro[i][2]!=null){
				opt.selected = true;
			}
			
			if(selValue!=null && selValue==opt.value){
				opt.selected = true;
			}
		}	
	}	
	
	//参数1为下拉菜单元素对象
	//参数2为保存下拉菜单选项值的数组名
	//参数3保存下拉菜单的value值（修改页面才需要传这个参数）
	function showOptionsBySelObj(){
		var sel = arguments[0];
		var optionPro = arguments[1];
		var selValue = arguments[2];
		var opt = null;
		
		for(var i=0;i<optionPro.length;i++){
			opt = document.createElement("OPTION");
			sel.options.add(opt);
			opt.value = optionPro[i][0];
			opt.innerText = optionPro[i][1];
			if(selValue==null && optionPro[i][2]!=null){
				opt.selected = true;
			}
			
			if(selValue!=null && selValue==opt.value){
				opt.selected = true;
			}
		}	
	}	
	
	//参数１为父下拉菜单ｉｄ
	//参数２为父下拉菜单数据所存数组名
	//参数３为子下拉菜单ｉｄ
	//参数4保存子下拉菜单的value值（修改页面才需要传这个参数）
	function showSubSelBySel(){
		var parentObj = document.getElementById(arguments[0]);
		var subObj = document.getElementById(arguments[2]);
		var parentData = arguments[1];
		var subSelectedValue = arguments[3];
		
		if(parentObj == null || subObj == null || parentData == null || parentData.length == 0){
			return;
		}
			
		var parentSelectedValue = get_selected_value(parentObj);
		var subData = null;
		for(var i=0;i<parentData.length;i++){
			if(parentData[i].id == parentSelectedValue){
				subData = parentData[i].subSels;
				break;
			}
		}
		
		if(subData == null){
			subObj.style.display = "none";
			return;
		}
		
		//删除掉下来菜单中原来的选项
		var children = subObj.options;
		for(var i =1;i<children.length;){//保留第一个默认提示选项
			subObj.removeChild(children[i]);
		}
		if(children[0]!=null && children[0].value!=0){//若第一项不是默认提示选项则删除该项
			subObj.removeChild(children[0]);
		}
		
		//添加新的选项
		//opt = document.createElement("OPTION");
		//subObj.options.add(opt);
		//opt.value = 0;
		//opt.innerText =　"无";	
		
		for(var i=0;i<subData.length;i++){
		
			opt = document.createElement("OPTION");
			subObj.options.add(opt);
			opt.value = subData[i].id;
			opt.innerText = subData[i].show;
			
			if(subSelectedValue!=null && subSelectedValue==opt.value){
				opt.selected = true;
			}
		}
		
		subObj.style.display = "block";

	}
-->