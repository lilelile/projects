<!--
 
	//����1Ϊ����idֵ
	//����2Ϊ�洢�������ݵ�����
	function addRow()
	{
		var tb = document.getElementById(arguments[0]);
		var contentArr = arguments[1];
		var columnNum = contentArr.length;
		var newRow = tb.insertRow(tb.rows.length-1);
		for(i=0;i<columnNum;i++)
		{
			newCell = newRow.insertCell();
			newCell.align = "center";
			newCell.innerHTML = contentArr[i];
		}
	}
	
	//����1Ϊ����idֵ
	function delRow()
	{
		var tb = document.getElementById(arguments[0]);
		if(tb.rows.length>3)
			tb.deleteRow(tb.rows.length-2);
	}

-->