

const baseURL =  'http://localhost:8000/member'
// 创建请求前拦截器
export const httpInterceptor = {
    // 拦截前触发
     invoke (options: UniApp.RequestOptions)  {
        console.log(111111111111)
        // 1.非http开头的需要拼接基地址
        if (!options.url.startsWith('http')) {
            options.url = baseURL + options.url
        }
        // 2.设置请求延迟时间
        options.timeout = 10000
        console.log(options)
        // 3.设置请求小程序端请求标识
        // options.header = {
        //     'source-client': 'miniapp'
        // }
        // 4.添加token标识符
        // const token=this.$store.userinfo.token
        // if(token){
        //   options.header.Authorization=token
        // }
    }
}
// 导出一个函数来添加拦截器
// export function addHttpInterceptor() {
//     // 注意：确保在调用此方法之前，uni 对象已经可用
//     // 你可以考虑在 App.vue 的 onLaunch 方法中调用它
//     uni.addInterceptor('request', httpInterceptor);
// }
//request请求
// uni.addInterceptor('request', httpInterceptor)
//文件上传
// uni.addInterceptor('uploadFile', httpInterceptor)

//返回Promise对象
// export const axios = (options) => {
//     return new Promise((resove, reject) => {
//         uni.request({
//             ...options,
//             // 1. 成功请求处理
//             success(res) {
//                 // 1.2 成功状态码接收数据
//                 if(res.statusCode>=200&&res.statusCode<300){
//                     resove(res.data)
//                 }else if(res.statusCode===401){
//                     // 1.2身份认证失败
//                     // 1.2.1显示提示框
//                     // 1.2.2点击确定，清空用户信息，跳转登录页
//                     reject(res)
//                 }else{
//                     // 1.3其他错误
//                     // uni.$showMsg('其他错误', 1500)
//                     // reject(res)
//                 }
//             },
//             // 2.失败处理
//             fail(err){
//                 // uni.$showMsg('网络错误！',1500)
//                 // reject(res)
//             }
//         })
//     })
// }