<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
<style>

	body{
			font-family:sans-serif;
			display:flex;
			flex-direction:column;
			align-items:center;
			justify-content:center;
			min-height:100vh;
			background:linear-gradient(135deg, #71b7e6, #9b59b6);
			color:white;
			font-size:1.5rem;
	}
		.pencil{
					position:relative;
					width:300px;
					height:40px;
					transform-orgin:center;
					transform:rotate(135deg);
					animation:pencil-animation 10s infinite;
		}
		@keyframes pencil-animation{
										0%{
												transform:rotate(135deg);
										}
										20%{
												transform:rotate(315deg);
										}
										45%{
												transform:translateX(300px)rotate(315deg);
										}
										55%{
												transform:translateX(300px)rotate(495deg);
										}
										100%{
												transform:rotate(495deg);
										}
		}
		.pencil__ball-point{
								position:absolute;
								left:0;
								top:50%;
								transform:translateY(-50%);
								background:lightblue;
								height:10px;
								width:10px;
								border-radius:50px;
		}
		.pencil__cap{
						position:absolute;
						left:0px;
						top:50%;
						transform:translateY(-50%);
						clip-path:polygon(20% 40%,100% 0%,100% 100%,20% 60%);
						background:#232123;
						width:12%;
						height:100%;
		}
		.pencil__cap-base{
							position:absolute;
							left:12%;
							top:0;
							height:100%;
							width:20px;
							background:slateblue;
		}
		.pencil__middle{
							position:absolute;
							left:calc(12% + 20px);
							top:0;
							height:100%;
							width:70%;
							background:lightblue;
		}
		.pencil__eraser{
							position:absolute;
							left:calc(12% + 70% + 20px);
							top:0;
							height:100%;
							width:11%;
							border-top-right-radius:5px;
							border-bottom-right-radius:5px;
							background:slateblue;
		}
		.line{
				position:relative;
				top:80px;
				right:103px;
				height:10px;
				width:1000px;
				z-index:-1;
				border-radius:50px;
				background:lightblue;
				transform:scaleX(0);
				transform-orgin:center;
				animation:line-animation 10s infinite;
		}
		
		@keyframes line-animation{
		20%{
				transform:scaleX(0);
		}
		45%{
				transform:scaleX(0.6);
		}
		55%{
				transform:scaleX(0.6);
		}
		100%{
				transform:scaleX(0);
				
		}
	}
	
	h2{
			position:relative;
			top:150px;
			right:75px;
	}
	
</style>
</head>
<body>
		<div class="pencil">
			<div class="pencil__ball-point"></div>
			<div class="pencil__cap"></div>
			<div class="pencil__cap-base"></div>
			<div class="pencil__middle"></div>
			<div class="pencil__eraser"></div>
		</div>
			<div class="line"></div>
			<h2>Invalide Login...Try Again</h2>
</body>
</html>