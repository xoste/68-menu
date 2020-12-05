<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title></title>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
	<script type="text/javascript">
        $(function () {
            $.post("${pageContext.request.contextPath}/show", function (data, status) {
                let result = "";
                for (let i = 0; i < data.length; i++) {
                    result += "<dl>";
                    result += "<dt style='cursor:pointer'>" + data[i].name + "</dt>";
                    for (let j = 0; j < data[i].subMenu.length; j++) {
                        result += "<dd>" + data[i].subMenu[j].name + "</dd>";
                    }
                    result += "</dl>";
                }
                $("#td1").html(result);
            });
        });


        $("dt").live("click", function () {
            $(this).siblings().slideToggle(200);
        });
	</script>
</head>
<body>
<table>
	<tr>
		<td id="td1"></td>
	</tr>
	<tr>
		<td>
			<a href="${pageContext.request.contextPath}/download?fileName=active-tool.rar">激活工具.rar下载</a><br/>
			<a href="${pageContext.request.contextPath}/download?fileName=a.txt">文件下载</a>
		</td>
		<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
			<label>
				姓名：<input type="text" name="name"/><br/>
				文件：<input type="file" name="file"/><br/>
				<input type="submit" value="提交"/>
			</label>
		</form>
	</tr>
</table>
</body>
</html>