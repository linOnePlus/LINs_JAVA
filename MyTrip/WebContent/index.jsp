<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8">2
		<title>Mytrip</title>
		<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" type="text/css" href="/MyTrip/css/bootstrap.css" />

		<!-- 还需要引入JQuery -->
		<script src="/MyTrip/js/jquery-3.3.1.js" type="text/javascript" charset="utf-8"></script>

		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="/MyTrip/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>

		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="/MyTrip/css/index.css"/>
		<script src="/MyTrip/js/index.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<!-- 背景 -->
		<div id="bg" class="col-md-12">
			<!-- 容器 -->
			<div class="container">
			<!-- 用include引入头 -->
				<jsp:include page="/jsp/logo.jsp"></jsp:include>
				<nav class="navbar" id="daohanglan">
					<div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

							<form class="navbar-form ">
								<select class="form-control serch">
									<option value ="">城市</option>
									<option value ="">景点</option>
								</select>
								<div class="form-group"">
										<input type=" serch" id="serch" onfocus="bc()" onblur="lk()" placeholder="请输入城市或景点">
								</div>
								<button type="submit" class="btn btn-danger serch">搜索</button>
							</form>
						</div><!-- /.navbar-collapse -->
					</div><!-- /.container-fluid -->
				</nav>
			</div>
		</div>
		<!-- 容器 -->
		<div class="container" id="trip">
			<!-- 热门景点 -->
			<div class="row">

			</div>
			<!-- 驴友评论 -->

			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="row">
						<div class="col-md-4">
							<div class="thumbnail">
								<img alt="300x200" src="img/guangzhou.jpg" />
								<div class="caption">
									<h3>
										广州
									</h3>
									<p>
										这个城市没有冬天，没有寒冷，永远都是那么暖意洋洋，永远都是那么热火朝天；
										这个城市的每一条街道，都灯火辉煌，明亮耀眼；广州大多数景点都需要1天的时间来游览，
										最有特色是有着异域风情的沙面和拥有130多年历史的石室圣心大教堂。
									</p>
									<p>
										<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">评论</a>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="thumbnail">
								<img alt="300x200" src="img/shanghai.jpg" />
								<div class="caption">
									<h3>
										上海
									</h3>
									<p>
										到上海，你可以到外滩尽情感受夜的风情，去徐汇区的天平路和湖南路找最漂亮的老洋房，
										在老上海的里弄感受历史的沉淀。最后千万别忘了登上东方明珠，放眼看看这个国际化的大都市。
									</p>
									<p>
										<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href=".comment">评论</a>
									</p>
								</div>
							</div>
						</div>

						<div class="col-md-4">
							<div class="thumbnail">
								<img alt="300x200" src="img/malaixiya.jpg" />
								<div class="caption">
									<h3>
										马来西亚
									</h3>
									<p>
										电影《偷天陷阱》取景地，吉隆坡的第一地标
									</p>
									<p>
										<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">评论</a>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="thumbnail">
								<img alt="300x200" src="img/trip1.jpg" />
								<div class="caption">
									<h3>
										威尼斯
									</h3>
									<p>
										威尼斯贵为水上之城本身就是一个水上艺术品，在这里任意一个建筑物的美感都离不开水。
										身处威尼斯，路边音乐家演奏的古典音乐就像是演出配乐，
										来回的形形色色的人们就像是演员，而你正好赶上这威尼斯剧目的上演.
									</p>
									<p>
										<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">评论</a>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="thumbnail">
								<img alt="300x200" src="img/dongjing.jpg" />
								<div class="caption">
									<h3>
										东京
									</h3>
									<p>
										深入到东京的街头巷尾，你却绝不会觉得单调无聊，而会惊奇地发现传统的神社、建筑与摩天大楼有机结合，
										繁忙的市中心不时出现绿茵与河流，博物馆、美术馆与购物中心融为一体，
									</p>
									<p>
										<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">评论</a>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="thumbnail">
								<img alt="300x200" src="img/trip2.jpg" />
								<div class="caption">
									<h3>
										悉尼
									</h3>
									<p>
										悉尼，港台称“雪梨”，澳大利亚新南威尔士州的首府，是澳大利亚、大洋洲及南半球第一大城市和港口，
										世界公认十大最繁华的国际大都市之一。
									</p>
									<p>
										<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">评论</a>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 版权所有的声明 -->
			<div id="copyright">
				Copyright © 2019-2020 04160620 林泽佳 版权所有
			</div>
		</div>
</body>
</html>