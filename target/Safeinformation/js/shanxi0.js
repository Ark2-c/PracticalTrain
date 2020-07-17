  
        var uploadedDataURL = "../js/shanxi.json";
        //function randomData() {
        //    return Math.round(Math.random() * 10000);
        //}
        var myChart = echarts.init(document.getElementById('shanxi'));
        
        function showProvince() {
            var name = 'bj';
            
           myChart.showLoading();
        
            $.get(uploadedDataURL, function(geoJson) {
        
                myChart.hideLoading();
        
                echarts.registerMap(name, geoJson);
        
                myChart.setOption(option = {
                    backgroundColor: '#101129',
                    title: {
                        text: "",
                        subtext: "",
                        left: 'center',
                        textStyle: {
                            color: '#000'
                        }
                    },
                    visualMap: {
                        min: 0,
                        max: 1200,
                        left: 'left',
                        top: 'bottom',
                        text: ['高', '低'], // 文本，默认为数值文本
                        calculable: true,
                        inRange: {
                            color: ['#fff']
                        }
                    },
                    series: [{
                        type: 'map',
                        mapType: name,
                        label: {
                            normal: {
                                show: true,
                                formatter: function(params) {
                                    if (params.value) {
                                        return params.name + '\n' + params.value;
                                    }
                                }
                            },
                            emphasis: {
                                textStyle: {
                                    color: '#fff'
                                }
                            }
                        },
                        itemStyle: {
        
                            normal: {
                                borderColor: '#00a2ff',
                                areaColor: '#fff',
                            },
                            emphasis: {
                                areaColor: '#00a2ff',
                                borderWidth: 0
                            }
                        },
                        animation: false,
                        data: [{
                            "name": "阳泉市",
                            "value": 351
                        }, {
                            "name": "太原市",
                            "value": 1000
                        }, {
                            "name": "朔州市",
                            "value": 68
                        }, {
                            "name": "晋城市",
                            "value": 563
                        }, {
                            "name": "大同市",
                            "value": 91
                        }, {
                            "name": "晋中市",
                            "value": 947
                        }, {
                            "name": "长治市",
                            "value": 228
                        }, {
                            "name": "吕梁市",
                            "value": 989
                        }, {
                            "name": "运城市",
                            "value": 801
                        }, {
                            "name": "忻州市",
                            "value": 182
                        }, {
                            "name": "临汾市",
                            "value": 428
                        }]
                        
                        // animationDurationUpdate: 1000,
                        // animationEasingUpdate: 'quinticInOut'
                    }]
                });
            });
            
        }
        
        var currentIdx = 0;
        
        showProvince();
        myChart.on('click',function(param){
            var cityName=param.name;
            OpenWindow("./citizen.html",400,500);
        })
        