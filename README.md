# WebView
# 一、自定义WebView验证隐式Intent的使用
第二个应用：自定义WebView来加载URL
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190504185401694.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxNTg1ODAx,size_16,color_FFFFFF,t_70)
关键代码：
```
 webView=findViewById(R.id.mywebView);
        webView.setWebViewClient(new WebViewClient());
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null){
            String address=bundle.getString("address");
            webView.loadUrl(address);
        }
```
