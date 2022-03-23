$(document).ready(function () {
    $(".input-smt").click(function () {
        var begin = $("#beginTime").val();
        var end = $("#endTime").val();
        if(new Date(begin) >new Date(end)){
            alert("起始时间不能大于结束时间");
        }

        //异步 post 请求
        $.post("/nginx/student/selectBirth",{
            "beginTime":begin,
            "endTime":end
        },function(students,status,xhr){
            if(status == "success") {
                var str = "";
                for (var i=0; i<students.length;i++) {
                    var stu = students[i];
                    str += "<tr>" +
                        "<td>"+(i+1)+"</td>" +
                        "<td>"+stu.name+"</td>" +
                        "<td>"+stu.age+"</td>" +
                        "<td>"+stu.sex+"</td>" +
                        "<td>"+stu.birth+"</td>" +
                        "</tr>";
                }
                //向指定标签下，以字符串的方式输出
                $("tbody").html(str);
            } else {
                alert("ERROR:"+xhr.statusText+"---"+xhr.status);
            }
        });
    });
});