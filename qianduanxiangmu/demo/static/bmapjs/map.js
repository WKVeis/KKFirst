/////////////////////地图实例///////////////////////////
	// 创建Map实例，BMmap为一个命名空间
	var map = new BMap.Map("allmap");
	
	//初始化地图，设置中性点坐标和地图级别
	var point=new BMap.Point(116.404,39.915);
	
	map.centerAndZoom(point,11);
  //也可以用这句map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
    //map.setCurrentCity("北京");设置地图显示的城市 
 
 	//用panTo()方法将让地图平滑移动至新中心点经过一段时间后
    window.setTimeout(function(){
		map.panTo(new BMap.Point(113.270854,23.13507));
	},5000)
    
    //开启鼠标滚轮缩放
	map.enableScrollWheelZoom(true);  
	
///////////////////////////////////////////////