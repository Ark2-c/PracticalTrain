<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/7/16
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../js/echarts.min.js"></script>
    <script src="../js/jquery.min.js"></script>
    <style>
        #shanxi{
            margin: auto;
            width: 400px;
            height: 600px;
        }
    </style>
    <script>



    </script>
</head>
<body>
登录成功


<div id="shanxi"></div>
<script >


    var uploadedDataURL = "../js/shanxi.json";
    var count;
    function showProvince() {
        var name = 'bj';
        var myChart = echarts.init(document.getElementById('shanxi'));
        myChart.showLoading();


        $.get(uploadedDataURL, function(geoJson) {
            $.ajax({
                type: "post",
                url: "/Safeinformation_war/index/getCount",
                data: count,
                success: function (data) {
                    if (1 === data.type) {
                        count=data;
                        //alert("数据库访问成功");
                        //alert(count['太原市']);
                        myChart.hideLoading();

                        echarts.registerMap(name, geoJson);

                        myChart.setOption(option = {
                            tooltip: {},
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
                                name:'设备数',
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
                                    "value": count['阳泉市']
                                }, {
                                    "name": "太原市",
                                    "value": count['太原市']
                                }, {
                                    "name": "朔州市",
                                    "value": count['朔州市']
                                }, {
                                    "name": "晋城市",
                                    "value": count['晋城市']
                                }, {
                                    "name": "大同市",
                                    "value": count['大同市']
                                }, {
                                    "name": "晋中市",
                                    "value": count['晋中市']
                                }, {
                                    "name": "长治市",
                                    "value": count['长治市']
                                }, {
                                    "name": "吕梁市",
                                    "value": count['吕梁市']
                                }, {
                                    "name": "运城市",
                                    "value": count['运城市']
                                }, {
                                    "name": "忻州市",
                                    "value": count['忻州市']
                                }, {
                                    "name": "临汾市",
                                    "value": count['临汾市']
                                }]

                                // animationDurationUpdate: 1000,
                                // animationEasingUpdate: 'quinticInOut'
                            }]
                        });
                    }
                }
            });
        });
    }

    var currentIdx = 0;

    showProvince();

</script>

</body>
</html>
