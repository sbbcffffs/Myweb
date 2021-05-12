<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<div class="container">
	<div align="center">
		<h2>Servlet Test</h2>
		<hr/>
		<form action="/MyWeb/servlet/regist.yeo" method="post" id="servlet-form">
			<table>
				<tr>
					<td>아이디</td>
					<td><input id="input-id" type="text" name="id" placeholder="4글자 이상"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
			</table>
			
			<input type="button" value="등록" onclick="formCheck()">
		</form>
	</div>
</div>

<%@ include file="../include/footer.jsp" %>

<script>
	function formCheck() {
		debugger;
		console.log("formCheck in")
		
		//submit -> form action="call name": call name 호출
		$("#servlet-form").submit();
		
		
		
	}


</script>