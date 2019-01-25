/////////////////添加地图表面控件/////////////////////////////      
      //给地图添加控件
	map.addControl(new BMap.NavigationControl());//	PC端默认位于地图左上方，它包含控制地图的平移和缩放的功能。移动端提供缩放控件，默认位于地图右下方
	map.addControl(new BMap.ScaleControl());//默认位于地图左下方，显示地图的比例关系,默认10公里
	map.addControl(new BMap.MapTypeControl());//地图类型，位于地图的右上方：包含普通，卫星和三维
	map.addControl(new BMap.OverviewMapControl());//位于地图的右下方,是一个可折叠的缩略地图
	map.addControl(new BMap.CopyrightControl());//位于地图的左下方
	//	map.addControl(new BMap.GeolocationControl());针对移动端开发，默认位于地图左下方
	//	var mapStyle={style:"midnight"};
	//	map.setMapStyle(mapStyle);//设置个性化地图

/////////////////添加标注///////////////////////////////////
	var marker = new BMap.Marker(point);//定义标注
	marker.enableDragging();//可拖拽的标注
	
	//给点击标注时候添加事件
	marker.addEventListener("dragend", function(e){    
    alert("当前位置：" + e.point.lng + ", " + e.point.lat);    
    }) 
    
	map.addOverlay(marker);//添加标注
	
	//添加折线
	var polyline= new BMap.Polyline([
		new BMap.Point(113.255906,23.210023),
		new BMap.Point(113.438155,23.25678),
		new BMap.Point(113.377213,23.216931)
	],
	{
		strokeColor:"black",
		strokeWeight:6,
		strokeOpacity:0.5
	}
	);
	map.addOverlay(polyline);
	
///////////添加覆盖物///////////////////////////////////
	
	//定义一个覆盖物的构造函数
	function SquareOverlay(center,length,color){
		this._center=certer;
		his._length=length;
		this._color=color;
	}
	
	//继承API的BMap.Overlay
	SquareOverlay.prototype=new BMap.Overlay();
	
	//初始化自定义覆盖物,用initialize方法
	SquareOverlay.prototype.initialize=function(map){
		//保存map对象实例
		his._map=map;
		//创建div元素，作为自定义覆盖物的容器
		var div=document.createElement("div");
		div.style.position="absolute";
		//可以根据参数设置元素外观
		div.style.width=this._length+"px";
		div.style.height=this._length+"px";
		div.style.background=this._color;
		 // 将div添加到覆盖物容器中
        map.getPanes().markerPane.appendChild(div);
         // 保存div实例
    	this._div = div;
    	// 需要将div元素作为方法的返回值，当调用该覆盖物的show、
    	// hide方法，或者对覆盖物进行移除时，API都将操作此元素。
        return div;
	}
	
	//绘制覆盖物，实现draw方法。
	SquareOverlay.prototype.draw = function(){    
	// 根据地理坐标转换为像素坐标，并设置给容器    
    var position = this._map.pointToOverlayPixel(this._center);    
    this._div.style.left = position.x - this._length / 2 + "px";    
    this._div.style.top = position.y - this._length / 2 + "px";    
	}
	
	//移除覆盖物
	//map.removeOverlay或者map.clearOverlays
	
	//显示和隐藏覆盖物，
	SquareOverlay.prototype.show = function(){    
    if (this._div){    
        this._div.style.display = "";    
    	}    
	}      
// 实现隐藏方法  
	SquareOverlay.prototype.hide = function(){    
    if (this._div){    
        this._div.style.display = "none";    
    	}    
	}
			//添加覆盖物
	var mySquare = new SquareOverlay(map.getCenter(), 100, "red");    
	map.addOverlay(mySquare);
	


