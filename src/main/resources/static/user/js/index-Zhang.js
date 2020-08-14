$(function () {
    show_fire();
    show_future();
    show_firemovie();
})

function show_fire() {
    $.ajax({
        url: "/movie/list",
        type: "POST",
        success: function (data) {
            $("#fire").append(data.length)
            for (var i = 0; i < data.length; i++) {
                if (i == 4) {
                    break;
                }
                $("#hotmovies").append(" <div class=\"movies-model\">       " +
                    " <a href=\"/user/moviedatas.html?"+data[i].mid+"\">\n" +
                    "        <img src=\"" + data[i].photo + "\" alt=\"\" srcset=\"\" height='210.33px'>\n" +
                    "    </a>\n" +
                    "    <button data-id=\"${value.name}\" class=\"btn\">立即购票</button></div>");
            }
        }
    })
}
function show_future() {
    $.ajax({
        url: "/movie/list",
        type: "POST",
        success: function (data) {
            $("#future").append(data.length)
            for (var i = 0; i < data.length; i++) {
                if (i == 4) {
                    break;
                }
                $("#future_show").append(" <div class=\"movies-model\">       " +
                    " <a href=\"/user/moviedatas.html?"+data[i].mid+"\">\n" +
                    "        <img src=\"" + data[i].photo + "\" alt=\"\" srcset=\"\" height='210.33px'>\n" +
                    "    </a>\n" +
                    "    <button data-id=\"${value.name}\" class=\"btn\">立即购票</button></div>");
            }
        }
    })
}
function show_firemovie() {
    $.ajax({
        url: "/movie/list",
        type: "POST",
        success: function (data) {
            $("#firemovie").append(data.length)
            for (var i = 0; i < data.length; i++) {
                if (i == 8) {
                    break;
                }
                $("#firemovie_show").append(" <div class=\"movies-model\">       " +
                    " <a href=\"/user/moviedatas.html?"+data[i].mid+"\">\n" +
                    "        <img src=\"" + data[i].photo + "\" alt=\"\" srcset=\"\" height='210.33px'>\n" +
                    "    </a>\n" +
                    "    <button data-id=\"${value.name}\" class=\"btn\">立即购票</button></div>");
            }
        }
    })
}