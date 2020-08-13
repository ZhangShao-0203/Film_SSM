$(function () {
    show_movieCinema();
})

function show_movieCinema() {
    $.ajax({
        url: "/cinema/list",
        data: {"start": 1, "size": 15, "seek": "%"},
        success: function (data) {
            for (var i = 0; i < data.length; i++) {
                $("#cinemas-body").append("<div class='cineam-model'><div class=\"cineam-name\">\n" +
                    "        <p>\n" +
                    "            <a href=\"#\">\n" +
                    "            "+data[i].cname+"\n" +
                    "        </a>\n" +
                    "        </p>\n" +
                    "        <p>地址：1111</p>\n" +
                    "            111111111\n" +
                    "        </div>\n" +
                    "        <div class=\"cineam-money\">\n" +
                    "        <div class=\"price\">\n" +
                    "            <p><span>￥1111</span>起</p>\n" +
                    "            <p>1111km</p>\n" +
                    "        </div>\n" +
                    "        <div class=\"buy-btn\">\n" +
                    "            <a href=\"cinemadatas.html?${value.name}?${backToPreUrl[1]}\">\n" +
                    "                选座购票\n" +
                    "            </a>\n" +
                    "        </div>\n" +
                    "        </div></div>");
            }
        }
    })
}