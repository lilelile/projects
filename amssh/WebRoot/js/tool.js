<!--
	/**********************************************
	/*
	/*����idȡ��Ԫ�ص����á�
	/**********************************************/
	
	function getElementById(name){
		return document.getElementById(name);
	}
	/**********************************************
	/*
	/* ��������ȡ��Ԫ�ص����á�
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
	
	//����1Ϊ����
	//����2ΪҪ��ѯ��idֵ
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
        for (i = 0; i < radio_array . length; ++ i){  //radio_array.length��radioѡ��ĸ���
                if (radio_array[i].checked){
                        return radio_array[i].value;
				}
		}
        return null;  //���һ�ûѡ�򷵻ؿ�ֵ
	}


	function get_selected_value(selectObj)
	{
		var os = selectObj.options;
        for (var i = 0; i < os.length; i++){ 
                if (os[i].selected){
                        return os[i].value;
				}
		}
        return null;  //���һ�ûѡ�򷵻ؿ�ֵ
	}	

	function get_selected_option(selectObj)
	{
		var os = selectObj.options;
        for (var i = 0; i < os.length; i++){ 
                if (os[i].selected){
                        return os[i];
				}
		}
        return null;  //���һ�ûѡ�򷵻ؿ�ֵ
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
	
	//�ж��Ƿ�������
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
	//�ж��Ƿ��������򸡵���
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
	//�ı�һ�е���ɫ
	function turnColor(color){
		event.srcElement.parentElement.style.backgroundColor=color;
	}
	
		//����1Ϊ�������˵�Ԫ�ض���
		//����2Ϊ�������˵���������������
		//����3Ϊ�������˵�Ԫ�ض���
		//����4�����������˵���valueֵ���޸�ҳ�����Ҫ�����������
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
			
			//ɾ���������˵���ԭ����ѡ��
			var children = subObj.options;
			for(var i =1;i<children.length;){//������һ��Ĭ����ʾѡ��
				subObj.removeChild(children[i]);
			}
			if(children[0]!=null && children[0].value!=0){//����һ���Ĭ����ʾѡ����ɾ������
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
  *��ѡ��ȫѡ��ť���÷���
  */
function check_all(obj){
    for(i=0;i<document.getElementsByName(obj).length;i++){
       document.getElementsByName(obj)[i].checked='checked';
	   
    }
}
/**
  *��ȡ��ѡ��ťֵ
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
 * ����idȡ��Ԫ�ص�����
 */
function getElementById(name) {
	return document.getElementById(name);
}


/**
 * 
 * ��������ȡ��Ԫ�ص�����
 */
function getElementByName(name) {
	var elements = document.getElementsByName(name);
	return elements[0];
}


/**
 * 
 * ȥ���ַ�����ߵĿո�
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
 * ȥ���ַ����ұߵĿո�
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
 * ȥ���ַ����������ߵĿո�
 */
function trim(str) {
	return (lTrim(rTrim(str)));
}


/**
 * ��ʾ�����˵�
 * menuDiv:�Ҽ��˵�������DIV����
 * width:����ʾ�Ŀ��
 * rowControlString:�п����ַ�����0��ʾ����ʾ��1��ʾ��ʾ���硰101�������ʾ��1��3����ʾ����2�в���ʾ
 */
function popMenu(menuDiv, width, rowControlString) {
    	//���������˵�
	var pop = window.createPopup();
    	//���õ����˵�������
	pop.document.body.innerHTML = menuDiv.innerHTML;
	var rowObjs = pop.document.body.all[0].rows;
    	//��õ����˵�������
	var rowCount = rowObjs.length;
    	//ѭ������ÿ�е�����
	for (var i = 0; i < rowObjs.length; i++) {
        //������ø��в���ʾ����������һ
		var hide = rowControlString.charAt(i) != "1";
		if (hide) {
			rowCount--;
		}
        //�����Ƿ���ʾ����
		rowObjs[i].style.display = (hide) ? "none" : "";
        //������껬�����ʱ��Ч��
		rowObjs[i].cells[0].onmouseover = function () {
			this.style.background = "#818181";
			this.style.color = "white";
		};
        //������껬������ʱ��Ч��
		rowObjs[i].cells[0].onmouseout = function () {
			this.style.background = "#cccccc";
			this.style.color = "black";
		};
	}
    //���β˵��Ĳ˵�
	pop.document.oncontextmenu = function () {
		return false;
	};
    //ѡ���Ҽ��˵���һ��󣬲˵�����
	pop.document.onclick = function () {
		pop.hide();
	};
    //��ʾ�˵�
	pop.show(event.clientX - 1, event.clientY, width, rowCount * 30, document.body);
	return true;
}

/**
 *�������ر�����ʾ
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
