mktime（将时间结构数据转换成经过的秒数）
<pre>相关函数
time，asctime，gmtime，localtime
表头文件
#include< time.h>
定义函数
time_t mktime(strcut tm * timeptr);
函数说明
mktime()用来将参数timeptr所指的tm结构数据转换成从公元1970年1月1日0时0分0 秒算起至今的UTC时间所经过的秒数。
返回值
返回经过的秒数。
范例
/* 用time()取得时间（秒数），利用localtime()
转换成struct tm 再利用mktine（）将struct tm转换成原来的秒数*/
#include< time.h>
main()
{
time_t timep;
strcut tm *p;
time(&timep);
printf(“time() : %d \n”,timep);
p=localtime(&timep);
timep = mktime(p);
printf(“time()->localtime()->mktime():%d\n”,timep);
}
执行
time():974943297
time()->localtime()->mktime():974943297</pre>