$(function () {
    show_movie();
})
function show_movie() {
    $.ajax({
        url:"/movie/listmm",
        data:{"start":1,"size":15,"seek":"%"},
        success:function (data) {
            for(var i=0;i<data.length;i++){
                $("#movies-body").append("<li class=\"othermovie-model\">\n" +
                    "            <div class=\"movies-model\">\n" +
                    "                <a href=\"${encodeURI('moviedatas.html?'+value.name)}\">\n" +
                    "                    <img src=\""+data[i].photo+"\" width=\"160px\"\n" +
                    "                         height='210.33px'>\n" +
                    "                </a>\n" +
                    "                <a class=\"movieName\" style=\"font-size: 16px\">"+data[i].mnamec+"</a>\n" +
                    "            </div>\n" +
                    "        </li>");
            }
        }
    })
}