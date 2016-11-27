$(function(){
	$("#treeMenu").tree({
			onClick:function(node){
				//alert(node.attributes.flagIndex);
				if(node.attributes.flagIndex == 9){
					return;
				}else if(node.attributes.flagIndex == -1){
					return;
				}
				addPanel(node.text, node.attributes.flagIndex);
			}
		});
});

var tabIndex = 0;
var tabFlag, tabTitleStr;
function addPanel(titleStr, flagIndex){
	//tabFlag = flagIndex;
	tabIndex = flagIndex;
	tabTitleStr = titleStr;
	var tab = $("#tabContent").tabs("getTab", titleStr);
	if(tab){
		$('#tabContent').tabs("select", titleStr);
		clearAllRowStatus();
		return;
	}
	//tabIndex++;
	var url, cols, columns, content,url1,cols1,columns1;
	
	if(flagIndex == 1){	// 班级管理
        url = "class_data.json";
		cols = ["{field:\" \",checkbox:true},",
		    "{field:\"desc\",title:\"名称\",width:150,align:\"center\"},",
			"{field:\"grade\",title:\"年级\",width:150,align:\"center\"}"];
		columns = createColumnsHead(cols);
		
		url1 = "stu_data.json";
		cols1 = ["{field:\" \",checkbox:true},",
			"{field:\"sno\",title:\"学号\",width:120,align:\"center\"},",
			"{field:\"sname\",title:\"姓名\",width:120,align:\"center\"},",
			"{field:\"sex\",title:\"性别\",width:50,align:\"center\"},",
			"{field:\"yuan\",title:\"院系\",width:80,align:\"center\"},",
			"{field:\"zhuan\",title:\"专业\",width:180,align:\"center\"},",
			"{field:\"tel\",title:\"联系电话\",width:150,align:\"center\"},",
			"{field:\"email\",title:\"邮箱\",width:150,align:\"center\"}"];
		columns1 = createColumnsHead(cols1);
	}
	
	if(flagIndex == 0){	// 首页
		$("#tabContent").tabs("add",{
			title: 欢迎,
			border:false, 
			href:"./welcome.html",
			closable: true			
		});
	}else if(flagIndex == 1){
		content = "<div class=\"easyui-layout\" fit=\"true\">"
				+ "<div data-options=\"region:'west',title:'班级列表',split:true,width:350\">"
				+"<table style=\"margin:10px\" class=\"easyui-datagrid\" id='tabGrid1'" 
				+ "data-options='url:\""+ url +"\",method:\"get\","
				+ "loadMsg:\"数据加载中, 请稍等......\","
				+ "fit:true,singleSelect:true,rownumbers:true,canche:false,"
				+ "pagination:true,pagePosition:\"bottom\"," 
				+ columns
				+ "onLoadSuccess:setPage,"
				//+ "onRowContextMenu:contextMenu"
				+ "'></table>"
				+"</div>"
				+ "<div data-options=\"region:'center',title:'学生列表'\">"
				+"<table style=\"margin:10px\" class=\"easyui-datagrid\" id=\"aa\"" 
				+ "data-options='url:\""+ url1 +"\",method:\"get\","
				+ "loadMsg:\"数据加载中, 请稍等......\",toolbar:\"#tool\","
				+ "fit:true,singleSelect:true,rownumbers:true,canche:false,"
				+ "pagination:true,pagePosition:\"bottom\"," 
				+ columns1
				+ "onLoadSuccess:setPage,"
				//+ "onRowContextMenu:contextMenu"
				+ "'></table>"
				+ "</div></div>";
		$("#tabContent").tabs("add",{
			title: titleStr,
			border:false, 
			content:content,
			closable: true			
		});
		
			$("#tabGrid1").datagrid({
				onClickRow:function(){	
					var row = $("#tabGrid1").datagrid("getSelected");
					var index = $("#tabGrid1").datagrid("getRowIndex",row);
//					alert(index);

					if (index == 0) {
						$("#aa").datagrid({
							url:"stu1_data.json",
		columns:[[{field:'',checkbox:true},
			{field:'sno',title:'学号',width:120,align:'center'},
			{field:'sname',title:'姓名',width:120,align:'center'},
			{field:'sex',title:'性别',width:50,align:'center'},
			{field:'yuan',title:'院系',width:80,align:'center'},
			{field:'zhuan',title:'专业',width:180,align:'center'},
			{field:'tel',title:'联系电话',width:150,align:'center'},
			{field:'email',title:'邮箱',width:150,align:'center'}]]
						});
						}else if (index == 1) {
						$("#aa").datagrid({
							url:"stu2_data.json",
		columns:[[{field:'',checkbox:true},
			{field:'sno',title:'学号',width:120,align:'center'},
			{field:'sname',title:'姓名',width:120,align:'center'},
			{field:'sex',title:'性别',width:50,align:'center'},
			{field:'yuan',title:'院系',width:80,align:'center'},
			{field:'zhuan',title:'专业',width:180,align:'center'},
			{field:'tel',title:'联系电话',width:150,align:'center'},
			{field:'email',title:'邮箱',width:150,align:'center'}]]
						});
						}else if (index == 2) {
						$("#aa").datagrid({
							url:"stu3_data.json",
		columns:[[{field:'',checkbox:true},
			{field:'sno',title:'学号',width:120,align:'center'},
			{field:'sname',title:'姓名',width:120,align:'center'},
			{field:'sex',title:'性别',width:50,align:'center'},
			{field:'yuan',title:'院系',width:80,align:'center'},
			{field:'zhuan',title:'专业',width:180,align:'center'},
			{field:'tel',title:'联系电话',width:150,align:'center'},
			{field:'email',title:'邮箱',width:150,align:'center'}]]
						});
						}else{
						$("#aa").datagrid({
							url:"stu_data.json",
		columns:[[{field:'',checkbox:true},
			{field:'sno',title:'学号',width:120,align:'center'},
			{field:'sname',title:'姓名',width:120,align:'center'},
			{field:'sex',title:'性别',width:50,align:'center'},
			{field:'yuan',title:'院系',width:80,align:'center'},
			{field:'zhuan',title:'专业',width:180,align:'center'},
			{field:'tel',title:'联系电话',width:150,align:'center'},
			{field:'email',title:'邮箱',width:150,align:'center'}]]
						});
						}
				}
			});
		
	}else{
		url = "class_data.json";
		cols = ["{field:\" \",checkbox:true},",
		    "{field:\"desc\",title:\"名称\",width:150,align:\"center\"},",
			"{field:\"grade\",title:\"年级\",width:150,align:\"center\"}"];
		columns = createColumnsHead(cols);
		
		content = "<table style=\"margin:10px\" class=\"easyui-datagrid\"" 
				+ "data-options='url:\""+ url +"\",method:\"get\","
				+ "loadMsg:\"数据加载中, 请稍等......\","
				+ "fit:true,singleSelect:true,rownumbers:true,canche:false,"
				+ "pagination:true,pagePosition:\"bottom\"," 
				+ columns
				+ "onLoadSuccess:setPage,"
				//+ "onRowContextMenu:contextMenu"
				+ "'></table>"
		
		
		$("#tabContent").tabs("add",{
			title: titleStr,
			border:false, 
			content:content,
			closable: true			
		});
	}
}

function createColumnsHead(cols){
	var colsHead = "columns:[["
		for(var index in cols){
			colsHead += cols[index];
		}
		colsHead += "]],";
	return colsHead;
}
function setPage(){
	var pager = $("#tabGrid1").datagrid("getPager");
	var options = pager.data("pagination").options;
	var total = options.total;
	var pageCount = Math.ceil(total/options.pageSize);
	pager.pagination({
		pageSize: 12,
		beforePageText: '第',
		afterPageText: '页    共 {pages} 页',  
		displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		showPageList:false,
		layout:['first','prev','next','last','refresh'],
		onBeforeRefresh:function(){
			alert('刷新之前触发, 如果返回false可以取消刷新');
			return true;
		},
		onRefresh:function(){
			alert('数据刷新...');
		}
	});
	
	var pager1 = $("#aa").datagrid("getPager");
	var options1 = pager1.data("pagination").options;
	var total1 = options1.total;
	var pageCount1 = Math.ceil(total1/options1.pageSize);
	pager1.pagination({
		pageSize: 12,
		beforePageText: '第',
		afterPageText: '页    共 {pages} 页',  
		displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		showPageList:false,
		layout:['first','prev','next','last','refresh'],
		onBeforeRefresh:function(){
			alert('刷新之前触发, 如果返回false可以取消刷新');
			return true;
		},
		onRefresh:function(){
			alert('数据刷新...');
		}
	});
}

function clearAllRowStatus(){
	$("#tabGrid" + tabIndex).datagrid("clearSelections");	// 清除所有已选行
}