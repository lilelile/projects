/**
 * 
 * ���ڱ��汻ѡ�е�ҳǩ
 */
var selected = null;


/**
 * 
 * �����ĳ��ҳǩ����ʱ���ã������޸ı�ѡ�е�ҳǩ��֮ǰ��ѡ�е�ҳǩ����ʽ
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
 * ����ҳǩ��Ӧ����ʾ�����Ƿ���ʾ
 * name �������ڲ��id
 * show �Ƿ���ʾ��yes������ʾ��no������ʾ
 */
function showObj(name, show)
{
	obj = getElementById(name);
	obj.style.visibility = (show)?'visible':'hidden';
}

/**
 * 
 * �����ĳ��ҳǩ����ʱ���ã������޸�����ҳǩ��Ӧ����DIV�Ƿ���ʾ��
 * ����ʵ����showLayers('cmenu1',true,'c01',false,'������DIV��cmenu1��ʾ��DIV��c01����ʾ
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
