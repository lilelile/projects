<!--
	/**********************************************
	/*
	/*根据id取得元素的引用。
	/**********************************************/
	
	function getElementById(name){
		return document.getElementById(name);
	}
	/**********************************************
	/*
	/* 根据名称取得元素的引用。
	/*
	/**********************************************/
	function getElementByName(name)
	{
	    var elements = document.getElementsByName(name);
	    return elements[0];
	}
	function lTrim(str){
		var rtnStr;
		rtnStr=""
		for (var i=0;i<str.length;i++){
			if (str.charAt(i)!=" "){
				rtnStr=str.substr(i);
				break;
			}
		}
		return rtnStr;
	}

	//==========================================
	//Purpose: Trim right spaces
	//==========================================
	function rTrim(str){
		var rtnStr;
		rtnStr=""
		for (var i=str.length-1;i>=0;i--){
			if (str.charAt(i)!=" "){
				rtnStr=str.substring(0,i+1);
				break;
			}
		}
		return rtnStr;
	}

	//==========================================
	//Purpose: Trim both left and right spaces
	//==========================================
	function trim(str){
		return(lTrim(rTrim(str)));
	}
	
	//参数1为数组
	//参数2为要查询的id值
	function getNameById(){
		
		var arr = arguments[0];
		var id = arguments[1];

		for(var i=0;i<arr.length;i++){
			if(arr[i][0]==id){
				return arr[i][1];
			}
		}
		return "";
	}

	function get_radio_value(radio_array)
	{
        var i;
        for (i = 0; i < radio_array . length; ++ i){  //radio_array.length是radio选项的个数
                if (radio_array[i].checked){
                        return radio_array[i].value;
				}
		}
        return null;  //如果一项都没选则返回空值
	}


	function get_selected_value(selectObj)
	{
		var os = selectObj.options;
        for (var i = 0; i < os.length; i++){ 
                if (os[i].selected){
                        return os[i].value;
				}
		}
        return null;  //如果一项都没选则返回空值
	}	

	function get_selected_option(selectObj)
	{
		var os = selectObj.options;
        for (var i = 0; i < os.length; i++){ 
                if (os[i].selected){
                        return os[i];
				}
		}
        return null;  //如果一项都没选则返回空值
	}	
		
	function set_selected_value(selectObj,selectedValue)
	{
		var os = selectObj.options;
        for (var i = 0; i < os.length; i++){ 
                if (os[i].value == selectedValue){
                        os[i].selected = true;
                        return;
				}
		}
	}	
	
	//判断是否是数字
	function isNumber(pObj){
	
 		var obj = eval(pObj);
 		strRef = "1234567890";
 		
 		for (i=0;i<obj.value.length;i++) {
  			tempChar= obj.value.substring(i,i+1);
  			if (strRef.indexOf(tempChar,0)==-1) {
   				return false;
 			}
 		}
 		return true;
	}
	//判断是否是整数或浮点数
	function isIntegerOrFloat(pObj){
	
 		var obj = eval(pObj);
 		strRef = "1234567890.";
 		
 		for (i=0;i<obj.value.length;i++) {
  			tempChar= obj.value.substring(i,i+1);
  			if (strRef.indexOf(tempChar,0)==-1) {
   				return false;
 			}
 		}
 		return true;
	}
	//改变一行的颜色
	function turnColor(color){
		event.srcElement.parentElement.style.backgroundColor=color;
	}
	
		//参数1为父下拉菜单元素对象
		//参数2为父下拉菜单数据所存数组名
		//参数3为子下拉菜单元素对象
		//参数4保存子下拉菜单的value值（修改页面才需要传这个参数）
		function showSubSelBySel_OBJ(){
			var parentObj = arguments[0];
			var subObj = arguments[2];
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


/**
  *复选框全选按钮调用方法
  */
function check_all(obj){
    for(i=0;i<document.getElementsByName(obj).length;i++){
       document.getElementsByName(obj)[i].checked='checked';
	   
    }
}
/**
  *获取单选按钮值
  */
function getRadioValue(obj){
	var returnTagValue;
 	for(var   i=0;i<document.getElementsByName(obj).length;i++)  {  
		if(document.getElementsByName(obj)[i].checked)
		{
		  returnTagValue=document.getElementsByName(obj)[i].value;   
		}
    }
	return returnTagValue;
}

/**
 * 
 * 根据id取得元素的引用
 */
function getElementById(name) {
	return document.getElementById(name);
}


/**
 * 
 * 根据名称取得元素的引用
 */
function getElementByName(name) {
	var elements = document.getElementsByName(name);
	return elements[0];
}


/**
 * 
 * 去掉字符串左边的空格
 */
function lTrim(str) {
	var rtnStr;
	rtnStr = "";
	for (var i = 0; i < str.length; i++) {
		if (str.charAt(i) != " ") {
			rtnStr = str.substr(i);
			break;
		}
	}
	return rtnStr;
}


/**
 * 
 * 去掉字符串右边的空格
 */
function rTrim(str) {
	var rtnStr;
	rtnStr = "";
	for (var i = str.length - 1; i >= 0; i--) {
		if (str.charAt(i) != " ") {
			rtnStr = str.substring(0, i + 1);
			break;
		}
	}
	return rtnStr;
}


/**
 * 
 * 去掉字符串左右两边的空格
 */
function trim(str) {
	return (lTrim(rTrim(str)));
}


/**
 * 显示弹出菜单
 * menuDiv:右键菜单的内容DIV对象
 * width:行显示的宽度
 * rowControlString:行控制字符串，0表示不显示，1表示显示，如“101”，则表示第1、3行显示，第2行不显示
 */
function popMenu(menuDiv, width, rowControlString) {
    	//创建弹出菜单
	var pop = window.createPopup();
    	//设置弹出菜单的内容
	pop.document.body.innerHTML = menuDiv.innerHTML;
	var rowObjs = pop.document.body.all[0].rows;
    	//获得弹出菜单的行数
	var rowCount = rowObjs.length;
    	//循环设置每行的属性
	for (var i = 0; i < rowObjs.length; i++) {
        //如果设置该行不显示，则行数减一
		var hide = rowControlString.charAt(i) != "1";
		if (hide) {
			rowCount--;
		}
        //设置是否显示该行
		rowObjs[i].style.display = (hide) ? "none" : "";
        //设置鼠标滑入该行时的效果
		rowObjs[i].cells[0].onmouseover = function () {
			this.style.background = "#818181";
			this.style.color = "white";
		};
        //设置鼠标滑出该行时的效果
		rowObjs[i].cells[0].onmouseout = function () {
			this.style.background = "#cccccc";
			this.style.color = "black";
		};
	}
    //屏蔽菜单的菜单
	pop.document.oncontextmenu = function () {
		return false;
	};
    //选择右键菜单的一项后，菜单隐藏
	pop.document.onclick = function () {
		pop.hide();
	};
    //显示菜单
	pop.show(event.clientX - 1, event.clientY, width, rowCount * 30, document.body);
	return true;
}

/**
 *设置隐藏表格的显示
 */
function changeDisplay(objId){
		 var obj = document.getElementById(objId);
		 if(obj.style.display==''){
		 		obj.style.display='block';
		 }else{
		 		obj.style.display='';
		 }	
}
-->
