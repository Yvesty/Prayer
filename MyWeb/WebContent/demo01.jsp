<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

function ajaxFunction(){
	   var xmlHttp;
	   try{ // Firefox, Opera 8.0+, Safari
	        xmlHttp=new XMLHttpRequest();
	    }
	    catch (e){
		   try{// Internet Explorer
		         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		      }
		    catch (e){
		      try{
		         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		      }
		      catch (e){}
		      }
	    }

		return xmlHttp;
	 }
	 
//执行get请求
	function get() {
		//1.创建xmlhttprequest
		var request = ajaxFunction();
		//2.发送请求
		//request.open("GET","DemoServlet01",true);
		request.open("GET","/MyWeb/DemoServlet01?name=yves&age=18",true);
		
		request.send();
	}
	
	function get() {
		//1.创建xmlhttprequest
		var request = ajaxFunction();
		//2.发送请求
		//request.open("GET","DemoServlet01",true);
		request.open("GET","/MyWeb/DemoServlet01?name=yves&age=18",true);
		//3.获取响应数据
		request.onreadystatechange = function(){
			
			if(request.readyState == 4 && request.status == 200){
				alert(request.responseText);
			}
		}
		request.send();
	}
</script>

</head>
<body>

	<h3><a href="" onclick="get()">使用Ajax方式发送Get请求</a></h3>
	
</body>
</html>