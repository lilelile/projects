<!--

	/*�ж�selectԪ�������Ƿ��и�optionԪ��*/
	function contain(element,option){
		var col=element.options;
		if(col.length==0)
			return false;
		else{
			for(var i=0;i<col.length;i++){
				//alert(col[i].text);
				if(col[i].text==option.text)
					return true;
			}
			return false;
		}
	}
	
	/*��rightԪ�ذ�ѡ�е�option�ӵ�leftԪ����*/
	function add(left,right){
		//alert("runing.......");
		var index=right.selectedIndex;
		if(index==-1||contain(left,right.options[index])){
			return;
		}
		var oldOption=right.options[index];
		var newOption=new Option(oldOption.text,oldOption.value);
		newOption.selected=true;
		left.add(newOption);
	}
	/*��selectԪ����ɾ��ѡ�е�Ԫ��*/
	function del(element){
		var index=element.selectedIndex;
		if(index==-1)
			return;
		element.remove(index);
	}
	
	/*ɾ��select�����е�Ԫ��*/
	function delAll(element){
		if(element.length==0)
			return;
		else{
			var length=element.length;
			for(var i=0;i<length;i++){
				element.remove(0);
			}
		}
	}
	
	/*����activityҳ�����Ϣ*/
	function hideAll() {
	  
	  for(i=0;i<content.length;i=i+1) {
	    content[i].style.display="none";
	  }
	}
	
	/*��ʾactivityҳ��Ķ�̬��Ϣ*/
	function showMenu(num) {
	  if (content[num].style.display=="none") {
	    hideAll();
	    content[num].style.display="inline";
	  }
	  else {
	    content[num].style.display="none";
	  }
	}
	

-->