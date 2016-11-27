<!--

	/*判断select元素里面是否有该option元素*/
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
	
	/*从right元素把选中的option加到left元素中*/
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
	/*从select元素中删除选中的元素*/
	function del(element){
		var index=element.selectedIndex;
		if(index==-1)
			return;
		element.remove(index);
	}
	
	/*删除select中所有的元素*/
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
	
	/*隐藏activity页面的信息*/
	function hideAll() {
	  
	  for(i=0;i<content.length;i=i+1) {
	    content[i].style.display="none";
	  }
	}
	
	/*显示activity页面的动态信息*/
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