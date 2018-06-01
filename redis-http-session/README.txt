demo说明(参照网上例子,有点小毛病我给改好了)
启动服务1
java -jar target\redis-http-session-1.0.0.jar --server.port=8080
启动服务2
java -jar target\redis-http-session-1.0.0.jar --server.port=9091

访问 http://localhost:8080/admin/v1/first
这个类似登陆操作会在session中把当前请求路径放里面
此时session中
{
"request Url":"http://localhost:8080/admin/v1/first"
}

紧接着访问 http://localhost:8080/admin/v1/sessions
这个接口返回当前session id 和 刚才上个接口放入的request Url

然后再访问 http://localhost:9091/admin/v1/sessions
会得到跟访问8080上服务的同一个session id 和 request Url
至此 8080 和 9091 之间session应该是共享的了


PS:
打包jar 用工程下的clean-package.bat
8080 对应 contrl.jar 9091对应 service.jar (名字是蒙的,自行脑补....)
