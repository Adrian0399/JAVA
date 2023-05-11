<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tarea 4: Cambiar color de los textos</title>
</head>
<body>
  <h3 style="color: ${cookie.color.getValue() == null? "black": cookie.color.getValue()}">Tarea 4: cambiar el color de los textos</h3>
  <p style="color: ${cookie.color.getValue() == null? "black": cookie.color.getValue()}">Elegir el color</p>
  <form action="/webapp-cookie/cambiar-color" method="get">
    <div>
      <label for="color">Cambiar color</label>
      <div>
        <select name="color" id="color">
          <option value="blue">Blue</option>
          <option value="red">Red</option>
          <option value="green">Green</option>
          <option value="aqua">Aqua</option>
          <option value="BlueViolet">BlueViolet</option>
          <option value="Gray">Gray</option>
          <option value="Cyan">Cyan</option>
        </select>
      </div>
    </div>
    <div>
      <input type="submit" value="Cambiar">
    </div>
  </form>

</body>
</html>