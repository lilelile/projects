
// 页面左部树形菜单的上下文菜单
function contextMenuShow(e, node){
	$(this).tree("select",node.target);
	$("#treeContextMenu").menu("show",{
		left: e.pageX,
		top: e.pageY
	});
	e.preventDefault();
}

function append(){
	var t = $("#treeMenu");
	var node = t.tree("getSelected");
	t.tree("append", {
		parent: (node ? node.target : null),
		data: [{
			text: "新增菜单项",
			attributes:{
				flagIndex:-1
			}
		}]
	});
}
function edit(){
	var node = $("#treeMenu").tree("getSelected");
	//alert(node.text);
	$("#treeMenu").tree("beginEdit", node.target);
}
function afterEdit(node){
	alert("成功修改为： " + node.text);
}
function removeit(){
	var node = $("#treeMenu").tree("getSelected");
	$("#treeMenu").tree("remove", node.target);
}
function expand(){
	var node = $("#treeMenu").tree("getSelected");
	$("#treeMenu").tree("expand",node.target);
}
function collapse(){
	var node = $("#treeMenu").tree("getSelected");
	$("#treeMenu").tree("collapse",node.target);
}