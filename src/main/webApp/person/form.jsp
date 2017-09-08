<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Person</title>
</head>



<body>

    <form method="post" action="/arief/submit-person">
        <table>
            <tr>
                <td>Id Person</td>
                <td><input type="number" id="id" name="id" placeholder="Id Person"/></td>
                <td id="error-id"></td>
            </tr>
            <tr>
                <td>Nama Person</td>
                <td><input id="nama" type="text" name="nama" placeholder="Nama Person"/></td>
                <td id="error-nama"></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="Submit data"/></td>
            </tr>
        </table><br/>
    </form>


</body>



</html>
