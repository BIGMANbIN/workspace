爬虫
//1.找到网址
Document document = Jsoup.connect("网址");
//2.找到对应元素
Elements elements = document.select("对应节点");
//3.for循环 （迭代）找到对应超链接

for(Element element : elements){
	String href = element.attr("href");
	//System.out.pritln(href);
	
	
}




Thread.sleep(6000)；//时间间隔






