<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<style type="text/css">
input[type="text"] {
	display: block;
	padding: 10px;
	border: solid 1px #dcdcdc;
	transition: box-shadow 0.3s, border 0.3s;
}

input[type="text"]:focus, input[type="text"].focus {
	border: solid 1px #707070;
	box-shadow: 0 0 5px 1px #969696;
}

button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 16px 32px;
	text-decoration: none;
	margin: 2px 2px;
	cursor: pointer;
}
</style>
</head>
<body>
	<h1>Cálculo de IMC</h1>
	<form name="imc">
		Peso: <input type="text" name="peso"> <br> Altura: <input type="text" name="altura"> <br>
		<button>Calcular</button>
	</form>
	<b>${resultado}</b>
</body>
</html>
