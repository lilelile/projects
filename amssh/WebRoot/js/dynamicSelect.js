<!--
	
	function subSel(id,show){
		this.id = id;
		this.show = show;
	}
	
	function parentSel(id, subSels){
		this.id = id;
		this.subSels = subSels;
	}	

	//����1Ϊ�����˵���idֵ
	//����2Ϊ���������˵�ѡ��ֵ��������
	//����3���������˵���valueֵ���޸�ҳ�����Ҫ�����������
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
	
	//����1Ϊ�����˵�Ԫ�ض���
	//����2Ϊ���������˵�ѡ��ֵ��������
	//����3���������˵���valueֵ���޸�ҳ�����Ҫ�����������
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
	
	//������Ϊ�������˵����
	//������Ϊ�������˵���������������
	//������Ϊ�������˵����
	//����4�����������˵���valueֵ���޸�ҳ�����Ҫ�����������
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
		
		//ɾ���������˵���ԭ����ѡ��
		var children = subObj.options;
		for(var i =1;i<children.length;){//������һ��Ĭ����ʾѡ��
			subObj.removeChild(children[i]);
		}
		if(children[0]!=null && children[0].value!=0){//����һ���Ĭ����ʾѡ����ɾ������
			subObj.removeChild(children[0]);
		}
		
		//����µ�ѡ��
		//opt = document.createElement("OPTION");
		//subObj.options.add(opt);
		//opt.value = 0;
		//opt.innerText =��"��";	
		
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