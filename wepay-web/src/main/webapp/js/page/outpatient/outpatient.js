$(document).ready(function() {
	httpGet();
});

function httpGet(){
    $.ajax({
        type : 'GET',
        url : 'http://localhost:8080/wepay-web/outpatient/orderList',
		async : false,//异步
        contentType: 'application/json;charset=utf-8', //默认: "application/x-www-form-urlencoded"
        dataType : 'json',
        success : function(data,textStatus) {
			//alert(JSON.stringify(data));
			contactList(JSON.stringify(data));
        },
		error : function(msg,textStatus){
			alert(JSON.stringify(msg));
		}
    });
}

function contactList(jsons){
	var table = document.getElementById("contactTable");
	var arr = eval(jsons);
	for(var i=0; i<arr.length; i++){
		var jsonObj = arr[i]; //获取json对象
		var tr = table.insertRow(table.rows.length);
		var td1 = tr.insertCell(0);
		td1.align = "center";
		var td2 = tr.insertCell(1);
		td2.align = "center";
		var td3 = tr.insertCell(2);
		td3.align = "center";
		var td4 = tr.insertCell(3);
		td4.align = "center";
		var td5 = tr.insertCell(4);
		td5.align = "center";
		
		td1.innerHTML = jsonObj.djh;
		td2.innerHTML = jsonObj.sfy;
		td3.innerHTML = jsonObj.je;
		td4.innerHTML = jsonObj.rq;
		td5.innerHTML = "<a href='#' onclick=pay('"+jsonObj.djh+"')>支付</a>";
	}
}

function pay(djh){
	window.location.href="http://localhost:8080/wepay-web/outpatient/payUI/"+djh;
}

function httpPost(){
    $.ajax({
        type : 'POST',
        url : 'http://localhost:8088/userRest/user',
        async : true,//异步
        //data: $("#editForm").serialize(),
        data : JSON.stringify({
            'userId':'1233eee',
            'userPassword':'123456',
            'userName':'smith',
            'userRemark':' 测试数据',
            'userPhone':'123123445523',
            'userEmail':'qwe@abc.com',
            'userStatus':'Y'
        }),
        contentType: 'application/json;charset=utf-8', //默认: "application/x-www-form-urlencoded"
        dataType : 'json',
        success : function(result,textStatus) {
            alert(JSON.stringify(result));
        },
        error : function(msg,textStatus){
            alert(JSON.stringify(msg));
        }
    });
}