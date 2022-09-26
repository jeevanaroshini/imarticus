<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    ${dbs_book}
    <form action="savebook" method="post">
    <br><br>
    ISBN: <input type="text" name="isbn"><br>
    Author: <input type="text" name="author" ><br>
    BookName: <input type="text" name="bookname"><br>
    Price: <input type="text" name="price"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>