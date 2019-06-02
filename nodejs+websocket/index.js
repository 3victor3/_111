// 新建index.js作为服务端
var ws = require("nodejs-websocket");
console.log("开始建立连接...")

var server = ws.createServer(function(conn){
    conn.on("text",function(str){
        console.log("message:"+str)
        conn.sendText("my name");
    });

    conn.on("close",function(code,reason){
        console.log("关闭连接")
    });

    conn.on("error",function(code,reson){
        console.log("异常关闭")
    });
}).listen(8001)

console.log("websocket建立完毕")

