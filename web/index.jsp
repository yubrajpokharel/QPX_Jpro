<!DOCTYPE html>
<html>
<head>
  <title>Online Dictionary</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="css/style.css" rel="stylesheet" type="text/css"/>
  <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
  <script src="js/dict.js" type="text/javascript"></script>

</head>
<body>
<div class="container">
  <section>
    <h2>Online Dictionery</h2>
    <form id="dictForm">
      <ul class="input-list mystyle clearfix">
        <li >
          <input type="text" name="word" placeholder=":Enter your word">
        </li>
        <li>
          <input id="search" type="submit" value="Search">
        </li>
      </ul>
    </form>
  </section>
  <div id='loadingDiv'>
    Please wait...
  </div>

  <div id="result">

  </div>
</div>
</body>
</html>