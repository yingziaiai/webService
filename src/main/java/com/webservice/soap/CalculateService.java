package com.webservice.soap;
//http://blog.csdn.net/guo_rui22/article/details/6253745
//through the observation, it will generate the webServiceClient project automatically

//http://javapapers.com/web-service/soap-web-service-introduction/

//can't understand https://www.oschina.net/question/1473586_152018

//http://blog.csdn.net/li951383937/article/details/51925637 

//彻底理解webservice SOAP WSDL  
//http://blog.csdn.net/zhuizhuziwo/article/details/8153327
//http://di201yao.iteye.com/blog/310292
//http://www.javatips.net/blog/category/webservice

//http://docs.oracle.com/javaee/6/tutorial/doc/gijti.html

//webservice axis cxf xfire jws
//http://jack-chen10.blog.163.com/blog/static/677512820134103279555/
//https://my.oschina.net/XYleung/blog/96094
//http://www.cnblogs.com/frankliiu-java/articles/1641949.html
//j2ee 5, j2ee 6 http://medbricom.iteye.com/blog/1154369
//j2ee jdk 
//http://tool.oschina.net/apidocs/apidoc?api=javaEE6

//http://wuhongyu.iteye.com/blog/807836 只是为了说明JAVA6开发Web Service很方便
//http://www.xuebuyuan.com/2150259.html

//几种java通信(rmi,http,hessian,webservice)协议性能比较 
//http://lavasoft.blog.51cto.com/62575/91679/  rmi
//http://haolloyin.blog.51cto.com/1177454/332426/
//Hessian(实现SOA另外的方式)

//http://blog.csdn.net/chenleixing/article/details/44926955
//论SOA架构的几种主要开发方式 
//webservice soa hessian 
//dubbo hessian 对比
//dubbo支持多种远程调用方式，例如dubbo RPC（二进制序列化 + tcp协议）、http invoker（二进制序列化 + http协议，至少在开源版本没发现对文本序列化的支持）、hessian（二进制序列化 + http协议）、WebServices （文本序列化 + http协议）等等... 
//基于Dubbo的Hessian协议实现远程调用   http://shiyanjun.cn/archives/349.html

//http://blog.csdn.net/jaryle/article/details/52314072          
//Hessian与Webservice的区别 
//http://www.360doc.com/content/12/0807/16/59141_228856355.shtml

//webservice deep theory: http://linglong2110.iteye.com/blog/860130
//http://blog.csdn.net/oolala/article/details/3960756
//http://blog.csdn.net/fengzhihen2007/article/details/9495995
public class CalculateService {

	/** */
	/**
	 * 
	 * 加法运算
	 * 
	 * @param x
	 *            被加数
	 * 
	 * @param y
	 *            加数
	 * 
	 * @return x与y的和
	 */

	public float plus(float x, float y) {

		return x + y;

	}

	/** */
	/**
	 * 
	 * 减法运算
	 * 
	 * @param x
	 *            被减数
	 * 
	 * @param y
	 *            减数
	 * 
	 * @return x与y之差
	 */

	public float minus(float x, float y) {

		return x - y;

	}

	/** */
	/**
	 * 
	 * 乘法运算
	 * 
	 * @param x
	 *            被乘数
	 * 
	 * @param y
	 *            乘数
	 * 
	 * @return x与y的乘积
	 */

	public float multiply(float x, float y) {

		return x * y;

	}

	/** */
	/**
	 * 
	 * 除法运算
	 * 
	 * @param x
	 *            被除数
	 * 
	 * @param y
	 *            除数
	 * 
	 * @return x与y的商
	 */

	public float divide(float x, float y) {

		return x / y;

	}

}
