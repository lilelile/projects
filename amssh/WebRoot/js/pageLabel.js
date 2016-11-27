/**
 * 
 * 用于保存被选中的页签
 */
var selected = null;


/**
 * 
 * 当点击某个页签链接时调用，用来修改被选中的页签和之前被选中的页签的样式
 */
function background(){
	if(selected != null){
		selected.parentElement.bgColor = "";
		selected.className="pageLabelFocusLink";
	}		
	var s = event.srcElement;
	selected = s;
	s.parentElement.bgColor = 'white';
	s.className="pageLabelLink";
}

/**
 * 
 * 设置页签对应的显示内容是否显示
 * name 内容所在层的id
 * show 是否显示，yes代表显示，no代表不显示
 */
function showObj(name, show)
{
	obj = getElementById(name);
	obj.style.visibility = (show)?'visible':'hidden';
}

/**
 * 
 * 当点击某个页签链接时调用，用来修改所有页签对应内容DIV是否显示。
 * 参数实例：showLayers('cmenu1',true,'c01',false,'）代表DIV：cmenu1显示，DIV：c01不显示
 */
function showLayers()
{
	var i,len;
	var args = showLayers.arguments;

	len = args.length-1;
	for(i=0;i<len;i+=2)
	{
		showObj(args[i],args[i+1]);
	}
}
