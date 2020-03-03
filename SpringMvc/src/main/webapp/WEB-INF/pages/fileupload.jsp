<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>SpringMVC学习</title>
</head>
<body>

    <h3> 文件上传</h3>
    
    <form action="/user/fileupload1" method="post"  enctype="multipart/form-data">
       选择文件: <input typr="file" name="upload"/> <br/>
       
       <input type="submit" value="上传"/>
    </form>
    
    </body>
</html>