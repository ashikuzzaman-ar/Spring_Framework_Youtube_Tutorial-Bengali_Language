<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <h1>${message}</h1>
        <h1 style="color: red;">${errorMessage}</h1>
        <form name="home" action="home" method="POST">
            <table>
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td>
                            <input type="text" name="username" value="" size="30" />
                        </td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td>
                            <input type="password" name="password" value="" size="30" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="reset" value="Reset" />
                        </td>
                        <td>
                            <input type="submit" value="Submit" name="okButton" />
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>